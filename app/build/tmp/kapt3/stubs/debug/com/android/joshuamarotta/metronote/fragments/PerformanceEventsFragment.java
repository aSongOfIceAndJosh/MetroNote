package com.android.joshuamarotta.metronote.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u000fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/android/joshuamarotta/metronote/fragments/PerformanceEventsFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter$EventFragmentManageEventCallback;", "()V", "adapter", "Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter;", "eventViewModel", "Lcom/android/joshuamarotta/metronote/viewmodels/EventViewModel;", "horizontalCalendar", "Ldevs/mulham/horizontalcalendar/HorizontalCalendar;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "rootView", "Landroid/view/View;", "buildHorizontalCalendar", "", "dateTimeSortedEventsMap", "", "", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "displayNoEventsBookedView", "hideNoEventsBookedView", "manageEvent", "eventRoomModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "app_debug"})
public final class PerformanceEventsFragment extends android.support.v4.app.Fragment implements com.android.joshuamarotta.metronote.adapters.EventListAdapter.EventFragmentManageEventCallback {
    private com.android.joshuamarotta.metronote.viewmodels.EventViewModel eventViewModel;
    private android.support.v7.widget.RecyclerView recyclerView;
    private devs.mulham.horizontalcalendar.HorizontalCalendar horizontalCalendar;
    private com.android.joshuamarotta.metronote.adapters.EventListAdapter adapter;
    private android.view.View rootView;
    private java.util.HashMap _$_findViewCache;
    
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
    
    private final void buildHorizontalCalendar(java.util.Map<java.lang.String, ? extends java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel>> dateTimeSortedEventsMap) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void manageEvent(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel) {
    }
    
    @java.lang.Override()
    public void displayNoEventsBookedView() {
    }
    
    @java.lang.Override()
    public void hideNoEventsBookedView() {
    }
    
    public PerformanceEventsFragment() {
        super();
    }
}