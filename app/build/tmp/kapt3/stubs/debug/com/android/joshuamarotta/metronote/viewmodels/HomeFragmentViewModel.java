package com.android.joshuamarotta.metronote.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/android/joshuamarotta/metronote/viewmodels/HomeFragmentViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "parentJob", "Lkotlinx/coroutines/Job;", "eventRoomRepository", "Lcom/android/joshuamarotta/metronote/repositories/EventRepository;", "(Landroid/app/Application;Lkotlinx/coroutines/Job;Lcom/android/joshuamarotta/metronote/repositories/EventRepository;)V", "getEventRoomRepository", "()Lcom/android/joshuamarotta/metronote/repositories/EventRepository;", "homeFeedItems", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "getHomeFeedItems", "()Landroid/arch/lifecycle/LiveData;", "getParentJob", "()Lkotlinx/coroutines/Job;", "onCleared", "", "app_debug"})
public final class HomeFragmentViewModel extends android.arch.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> homeFeedItems = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.Job parentJob = null;
    @org.jetbrains.annotations.NotNull()
    private final com.android.joshuamarotta.metronote.repositories.EventRepository eventRoomRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getHomeFeedItems() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getParentJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.joshuamarotta.metronote.repositories.EventRepository getEventRoomRepository() {
        return null;
    }
    
    public HomeFragmentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job parentJob, @org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.repositories.EventRepository eventRoomRepository) {
        super(null);
    }
}