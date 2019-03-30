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

class HomeFragmentViewModel(application: Application, val parentJob: Job, val eventRoomRepository: EventRepository) : AndroidViewModel(application) {
    val homeFeedItems: LiveData<List<EventRoomModel>> = eventRoomRepository.allEvents

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}