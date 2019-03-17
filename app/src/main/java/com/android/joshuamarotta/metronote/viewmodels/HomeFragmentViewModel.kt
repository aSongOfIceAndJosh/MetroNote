package com.android.joshuamarotta.metronote.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.repositories.EventRepository
import com.android.joshuamarotta.metronote.roomdatabase.EventRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

class HomeFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)
    private val repository: EventRepository
    val homeFeedItems: LiveData<List<EventRoomModel>>

    init {
        val eventsDao = EventRoomDatabase.getDatabase(application, scope).eventDao()
        repository = EventRepository(eventsDao)
        homeFeedItems = repository.allEvents
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}