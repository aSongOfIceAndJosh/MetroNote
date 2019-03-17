package com.android.joshuamarotta.metronote.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/android/joshuamarotta/metronote/viewmodels/HomeFragmentViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "homeFeedItems", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "getHomeFeedItems", "()Landroid/arch/lifecycle/LiveData;", "parentJob", "Lkotlinx/coroutines/Job;", "repository", "Lcom/android/joshuamarotta/metronote/repositories/EventRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onCleared", "", "app_debug"})
public final class HomeFragmentViewModel extends android.arch.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.Job parentJob;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.android.joshuamarotta.metronote.repositories.EventRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> homeFeedItems = null;
    
    private final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getHomeFeedItems() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public HomeFragmentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}