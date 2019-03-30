package com.android.joshuamarotta.metronote.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u000eJ\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u000eJ\b\u0010%\u001a\u00020&H\u0014J\u0006\u0010\'\u001a\u00020&R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006("}, d2 = {"Lcom/android/joshuamarotta/metronote/viewmodels/EventViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "parentJob", "Lkotlinx/coroutines/Job;", "eventRoomRepository", "Lcom/android/joshuamarotta/metronote/repositories/EventRepository;", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/Job;Lcom/android/joshuamarotta/metronote/repositories/EventRepository;)V", "dateTimeSortedEvents", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "getDateTimeSortedEvents", "()Landroid/arch/lifecycle/LiveData;", "dateTimeSortedEventsMap", "Landroid/arch/lifecycle/MutableLiveData;", "", "", "getDateTimeSortedEventsMap", "()Landroid/arch/lifecycle/MutableLiveData;", "dateTimeSortedPerformances", "getDateTimeSortedPerformances", "dateTimeSortedPractices", "getDateTimeSortedPractices", "getEventRoomRepository", "()Lcom/android/joshuamarotta/metronote/repositories/EventRepository;", "getParentJob", "()Lkotlinx/coroutines/Job;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "delete", "eventRoomModel", "deleteAllEvents", "insert", "onCleared", "", "processSortedEventsToSortedMap", "app_debug"})
public final class EventViewModel extends android.arch.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> dateTimeSortedEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> dateTimeSortedPerformances = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> dateTimeSortedPractices = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>>> dateTimeSortedEventsMap = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.Job parentJob = null;
    @org.jetbrains.annotations.NotNull()
    private final com.android.joshuamarotta.metronote.repositories.EventRepository eventRoomRepository = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>>> getDateTimeSortedEventsMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAllEvents() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void processSortedEventsToSortedMap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getParentJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.joshuamarotta.metronote.repositories.EventRepository getEventRoomRepository() {
        return null;
    }
    
    public EventViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job parentJob, @org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.repositories.EventRepository eventRoomRepository) {
        super(null);
    }
}