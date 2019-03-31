package com.android.joshuamarotta.metronote.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/android/joshuamarotta/metronote/fragments/EventsFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/android/joshuamarotta/metronote/interfaces/OnReselectedDelegate;", "()V", "eventsFragmentViewModel", "Lcom/android/joshuamarotta/metronote/viewmodels/EventsFragmentViewModel;", "getEventsFragmentViewModel", "()Lcom/android/joshuamarotta/metronote/viewmodels/EventsFragmentViewModel;", "eventsFragmentViewModel$delegate", "Lkotlin/Lazy;", "tabLayout", "Landroid/support/design/widget/TabLayout;", "viewPager", "Landroid/support/v4/view/ViewPager;", "viewPagerAdapter", "Lcom/android/joshuamarotta/metronote/adapters/EventsFragmentPagerAdapter;", "getViewPagerAdapter", "()Lcom/android/joshuamarotta/metronote/adapters/EventsFragmentPagerAdapter;", "viewPagerAdapter$delegate", "viewPagerTabOnLaunch", "", "getArgs", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onReselected", "onViewCreated", "view", "setupActionBar", "app_debug"})
public final class EventsFragment extends android.support.v4.app.Fragment implements com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate {
    private final kotlin.Lazy eventsFragmentViewModel$delegate = null;
    private android.support.v4.view.ViewPager viewPager;
    private android.support.design.widget.TabLayout tabLayout;
    private final kotlin.Lazy viewPagerAdapter$delegate = null;
    private int viewPagerTabOnLaunch;
    private java.util.HashMap _$_findViewCache;
    
    private final com.android.joshuamarotta.metronote.viewmodels.EventsFragmentViewModel getEventsFragmentViewModel() {
        return null;
    }
    
    private final com.android.joshuamarotta.metronote.adapters.EventsFragmentPagerAdapter getViewPagerAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupActionBar() {
    }
    
    @java.lang.Override()
    public void onReselected() {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
    }
    
    private final int getArgs() {
        return 0;
    }
    
    public EventsFragment() {
        super();
    }
}