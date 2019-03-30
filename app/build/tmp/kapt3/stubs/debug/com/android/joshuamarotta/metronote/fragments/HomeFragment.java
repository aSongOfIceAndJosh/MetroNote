package com.android.joshuamarotta.metronote.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/android/joshuamarotta/metronote/fragments/HomeFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/android/joshuamarotta/metronote/interfaces/OnReselectedDelegate;", "()V", "adapter", "Lcom/android/joshuamarotta/metronote/adapters/HomeFragmentAdapter;", "homeFragmentViewModel", "Lcom/android/joshuamarotta/metronote/viewmodels/HomeFragmentViewModel;", "getHomeFragmentViewModel", "()Lcom/android/joshuamarotta/metronote/viewmodels/HomeFragmentViewModel;", "homeFragmentViewModel$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "initTopHorizontalRecyclerView", "", "rootView", "Landroid/view/View;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onReselected", "onViewCreated", "view", "setupActionBar", "app_debug"})
public final class HomeFragment extends android.support.v4.app.Fragment implements com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate {
    private android.support.v7.widget.RecyclerView recyclerView;
    private com.android.joshuamarotta.metronote.adapters.HomeFragmentAdapter adapter;
    private final kotlin.Lazy homeFragmentViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.android.joshuamarotta.metronote.viewmodels.HomeFragmentViewModel getHomeFragmentViewModel() {
        return null;
    }
    
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
    
    @java.lang.Override()
    public void onReselected() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupActionBar() {
    }
    
    private final void initTopHorizontalRecyclerView(android.view.View rootView) {
    }
    
    public HomeFragment() {
        super();
    }
}