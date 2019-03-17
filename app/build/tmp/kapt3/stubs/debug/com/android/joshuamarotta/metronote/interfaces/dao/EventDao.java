package com.android.joshuamarotta.metronote.interfaces.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/android/joshuamarotta/metronote/interfaces/dao/EventDao;", "", "delete", "", "eventRoomModel", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "deleteAll", "getAlphabetizedEvents", "Landroid/arch/lifecycle/LiveData;", "", "getDateTimeSortedEvents", "getDateTimeSortedPerformances", "getDateTimeSortedPractices", "getEvent", "eventId", "", "insert", "app_debug"})
public abstract interface EventDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from event_table ORDER BY title ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getAlphabetizedEvents();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM event_table ORDER BY dateTime ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getDateTimeSortedEvents();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM event_table WHERE eventType = \'Performance\' ORDER BY dateTime ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getDateTimeSortedPerformances();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM event_table WHERE eventType = \'Practice\' ORDER BY dateTime ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getDateTimeSortedPractices();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM event_table WHERE eventId = :eventId")
    public abstract android.arch.lifecycle.LiveData<com.android.joshuamarotta.metronote.models.EventRoomModel> getEvent(int eventId);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM event_table WHERE eventId = 1")
    public abstract android.arch.lifecycle.LiveData<com.android.joshuamarotta.metronote.models.EventRoomModel> getEvent();
    
    @android.arch.persistence.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM event_table")
    public abstract void deleteAll();
}