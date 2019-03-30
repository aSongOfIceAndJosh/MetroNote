package com.android.joshuamarotta.metronote.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.repositories.EventRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat

class EventViewModel(application: Application, val scope: CoroutineScope, val parentJob: Job, val eventRoomRepository: EventRepository) : AndroidViewModel(application) {
    val dateTimeSortedEvents: LiveData<List<EventRoomModel>> = eventRoomRepository.dateTimeSortedEvents
    val dateTimeSortedPerformances: LiveData<List<EventRoomModel>> = eventRoomRepository.dateTimeSortedPerformances
    val dateTimeSortedPractices: LiveData<List<EventRoomModel>> = eventRoomRepository.dateTimeSortedPractices
    val dateTimeSortedEventsMap = MutableLiveData<MutableMap<String, List<EventRoomModel>>>()

    fun insert(eventRoomModel: EventRoomModel) = scope.launch(Dispatchers.IO) { eventRoomRepository.insert(eventRoomModel) }

    fun delete(eventRoomModel: EventRoomModel) = scope.launch(Dispatchers.IO) { eventRoomRepository.delete(eventRoomModel) }

    fun deleteAllEvents() = scope.launch(Dispatchers.IO) { eventRoomRepository.deleteAllEvents() }

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