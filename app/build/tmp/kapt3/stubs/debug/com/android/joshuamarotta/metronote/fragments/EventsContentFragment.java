package com.android.joshuamarotta.metronote.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020+H\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\rH\u0016J\u000f\u00100\u001a\u0004\u0018\u00010+H\u0002\u00a2\u0006\u0002\u00101J\u0012\u00102\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u000104H\u0016J&\u00105\u001a\u0004\u0018\u00010%2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010:\u001a\u00020+H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00020\u0019X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006;"}, d2 = {"Lcom/android/joshuamarotta/metronote/fragments/EventsContentFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter$EventFragmentManageEventCallback;", "()V", "adapter", "Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter;", "getAdapter", "()Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter;", "setAdapter", "(Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter;)V", "adapterEventsLiveData", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "getAdapterEventsLiveData", "()Landroid/arch/lifecycle/LiveData;", "setAdapterEventsLiveData", "(Landroid/arch/lifecycle/LiveData;)V", "eventViewModel", "Lcom/android/joshuamarotta/metronote/viewmodels/EventViewModel;", "getEventViewModel", "()Lcom/android/joshuamarotta/metronote/viewmodels/EventViewModel;", "eventViewModel$delegate", "Lkotlin/Lazy;", "eventsContentFragmentType", "Lcom/android/joshuamarotta/metronote/fragments/EventsContentFragmentType;", "getEventsContentFragmentType", "()Lcom/android/joshuamarotta/metronote/fragments/EventsContentFragmentType;", "setEventsContentFragmentType", "(Lcom/android/joshuamarotta/metronote/fragments/EventsContentFragmentType;)V", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "displayNoEventsBookedView", "", "hideNoEventsBookedView", "initAdapterEventsLiveData", "manageEvent", "eventRoomModel", "observeEventsLiveData", "()Lkotlin/Unit;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "app_debug"})
public abstract class EventsContentFragment extends android.support.v4.app.Fragment implements com.android.joshuamarotta.metronote.adapters.EventListAdapter.EventFragmentManageEventCallback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy eventViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.Nullable()
    private com.android.joshuamarotta.metronote.adapters.EventListAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public android.view.View rootView;
    @org.jetbrains.annotations.Nullable()
    private android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> adapterEventsLiveData;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.joshuamarotta.metronote.viewmodels.EventViewModel getEventViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.joshuamarotta.metronote.adapters.EventListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.android.joshuamarotta.metronote.adapters.EventListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> getAdapterEventsLiveData() {
        return null;
    }
    
    public final void setAdapterEventsLiveData(@org.jetbrains.annotations.Nullable()
    android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.joshuamarotta.metronote.fragments.EventsContentFragmentType getEventsContentFragmentType();
    
    public abstract void setEventsContentFragmentType(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.fragments.EventsContentFragmentType p0);
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAdapterEventsLiveData() {
    }
    
    private final kotlin.Unit observeEventsLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void displayNoEventsBookedView() {
    }
    
    @java.lang.Override()
    public void hideNoEventsBookedView() {
    }
    
    @java.lang.Override()
    public void manageEvent(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel) {
    }
    
    public EventsContentFragment() {
        super();
    }
}