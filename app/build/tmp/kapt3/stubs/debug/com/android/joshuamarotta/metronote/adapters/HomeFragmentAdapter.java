package com.android.joshuamarotta.metronote.adapters;

import java.lang.System;

/**
 * * Created by Joshua Marotta on 6/25/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001b\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u00a2\u0006\u0002\b\u0015R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/android/joshuamarotta/metronote/adapters/HomeFragmentAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/android/joshuamarotta/metronote/adapters/HomeFragmentAdapter$HomeFragmentViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "events", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEvents", "eventRoomModels", "setEvents$app_debug", "HomeFragmentViewHolder", "app_debug"})
public final class HomeFragmentAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.android.joshuamarotta.metronote.adapters.HomeFragmentAdapter.HomeFragmentViewHolder> {
    private java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel> events;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.joshuamarotta.metronote.adapters.HomeFragmentAdapter.HomeFragmentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.adapters.HomeFragmentAdapter.HomeFragmentViewHolder holder, int position) {
    }
    
    public final void setEvents$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel> eventRoomModels) {
    }
    
    public HomeFragmentAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/android/joshuamarotta/metronote/adapters/HomeFragmentAdapter$HomeFragmentViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/joshuamarotta/metronote/adapters/HomeFragmentAdapter;Landroid/view/View;)V", "app_debug"})
    public final class HomeFragmentViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public HomeFragmentViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}