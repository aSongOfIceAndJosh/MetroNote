package com.android.joshuamarotta.metronote.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0012H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/android/joshuamarotta/metronote/repositories/EventRepository;", "", "eventDao", "Lcom/android/joshuamarotta/metronote/interfaces/dao/EventDao;", "(Lcom/android/joshuamarotta/metronote/interfaces/dao/EventDao;)V", "allEvents", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "getAllEvents", "()Landroid/arch/lifecycle/LiveData;", "dateTimeSortedEvents", "getDateTimeSortedEvents", "dateTimeSortedPerformances", "getDateTimeSortedPerformances", "dateTimeSortedPractices", "getDateTimeSortedPractices", "delete", "", "event", "(Lcom/android/joshuamarotta/metronote/models/EventRoomModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllEvents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEvent", "eventId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "app_debug"})
public final class EventRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> allEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> dateTimeSortedEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> dateTimeSortedPerformances = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> dateTimeSortedPractices = null;
    private final com.android.joshuamarotta.metronote.interfaces.dao.EventDao eventDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getAllEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getDateTimeSortedEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getDateTimeSortedPerformances() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getDateTimeSortedPractices() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel event, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel event, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object deleteAllEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object getEvent(int eventId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.arch.lifecycle.LiveData<com.android.joshuamarotta.metronote.models.EventRoomModel>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object getEvent(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.arch.lifecycle.LiveData<com.android.joshuamarotta.metronote.models.EventRoomModel>> p0) {
        return null;
    }
    
    public EventRepository(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.interfaces.dao.EventDao eventDao) {
        super();
    }
}