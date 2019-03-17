package com.android.joshuamarotta.metronote.repositories

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import com.android.joshuamarotta.metronote.interfaces.dao.EventDao
import com.android.joshuamarotta.metronote.models.EventRoomModel

class EventRepository(private val eventDao: EventDao) {
    val allEvents: LiveData<List<EventRoomModel>> = eventDao.getAlphabetizedEvents()
    val dateTimeSortedEvents: LiveData<List<EventRoomModel>> = eventDao.getDateTimeSortedEvents()
    val dateTimeSortedPerformances: LiveData<List<EventRoomModel>> = eventDao.getDateTimeSortedPerformances()
    val dateTimeSortedPractices: LiveData<List<EventRoomModel>> = eventDao.getDateTimeSortedPractices()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(event: EventRoomModel) { eventDao.insert(event) }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun delete(event: EventRoomModel) { eventDao.delete(event) }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteAllEvents() { eventDao.deleteAll() }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun getEvent(eventId: Int): LiveData <EventRoomModel> { return eventDao.getEvent(eventId) }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun getEvent(): LiveData <EventRoomModel> { return eventDao.getEvent() }
}