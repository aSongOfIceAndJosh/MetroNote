package com.android.joshuamarotta.metronote.interfaces.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.android.joshuamarotta.metronote.models.EventRoomModel

@Dao
interface EventDao {

    @Query("SELECT * from event_table ORDER BY title ASC")
    fun getAlphabetizedEvents(): LiveData<List<EventRoomModel>>

    @Query ("SELECT * FROM event_table ORDER BY dateTime ASC")
    fun getDateTimeSortedEvents(): LiveData<List<EventRoomModel>>

    @Query ("SELECT * FROM event_table WHERE eventType = 'Performance' ORDER BY dateTime ASC")
    fun getDateTimeSortedPerformances(): LiveData<List<EventRoomModel>>

    @Query ("SELECT * FROM event_table WHERE eventType = 'Practice' ORDER BY dateTime ASC")
    fun getDateTimeSortedPractices(): LiveData<List<EventRoomModel>>

    @Query("SELECT * FROM event_table WHERE eventId = :eventId")
    fun getEvent(eventId: Int): LiveData<EventRoomModel>

    @Query("SELECT * FROM event_table WHERE eventId = 1")
    fun getEvent(): LiveData<EventRoomModel>

    @Insert
    fun insert(eventRoomModel: EventRoomModel)

    @Delete
    fun delete(eventRoomModel: EventRoomModel)

    @Query("DELETE FROM event_table")
    fun deleteAll()
}