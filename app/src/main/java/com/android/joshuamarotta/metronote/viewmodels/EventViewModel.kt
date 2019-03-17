package com.android.joshuamarotta.metronote.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.android.joshuamarotta.metronote.DataBus.RxDataBusEvent
import com.android.joshuamarotta.metronote.DataBus.RxDataBusImpl
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.repositories.EventRepository
import com.android.joshuamarotta.metronote.roomdatabase.EventRoomDatabase
import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.coroutines.CoroutineContext

class EventViewModel(application: Application) : AndroidViewModel(application) {
    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)
    private val repository: EventRepository
    //val allEvents: LiveData<List<EventRoomModel>>
    val dateTimeSortedEvents: LiveData<List<EventRoomModel>>
    val dateTimeSortedPerformances: LiveData<List<EventRoomModel>>
    val dateTimeSortedPractices: LiveData<List<EventRoomModel>>

    val dateTimeSortedEventsMap = MutableLiveData<MutableMap<String, List<EventRoomModel>>>()

    init {
        val eventsDao = EventRoomDatabase.getDatabase(application, scope).eventDao()
        repository = EventRepository(eventsDao)
        //allEvents = repository.allEvents
        dateTimeSortedEvents = repository.dateTimeSortedEvents
        dateTimeSortedPerformances = repository.dateTimeSortedPerformances
        dateTimeSortedPractices = repository.dateTimeSortedPractices
    }

    fun insert(eventRoomModel: EventRoomModel) = scope.launch(Dispatchers.IO) { repository.insert(eventRoomModel) }

    fun delete(eventRoomModel: EventRoomModel) = scope.launch(Dispatchers.IO) { repository.delete(eventRoomModel) }

    fun deleteAllEvents() = scope.launch(Dispatchers.IO) { repository.deleteAllEvents() }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }

    fun processSortedEventsToSortedMap() {
        val sortedEventsList = dateTimeSortedEvents.value
        val resultMap = mutableMapOf<String, List<EventRoomModel>>()
        sortedEventsList?.forEach {
            val sdf = SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy")
            val date = sdf.parse(it.dateTime.toString())
            val formatter = SimpleDateFormat("yyyy-MM-dd")
            val properDate = formatter.format(date)

            if (resultMap.containsKey(properDate)) {
                val mapValue = resultMap[properDate]?.toMutableList()
                mapValue?.add(it)
                properDate?.let { d -> mapValue?.let { mapValue -> resultMap.put(d, mapValue) } }
            } else {
                properDate?.let { d -> resultMap.put(d, listOf(it)) }
            }
        }
        dateTimeSortedEventsMap.value = resultMap
    }
}