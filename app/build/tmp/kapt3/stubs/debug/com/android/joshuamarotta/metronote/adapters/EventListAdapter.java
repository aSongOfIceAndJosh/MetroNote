package com.android.joshuamarotta.metronote.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001b\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u00a2\u0006\u0002\b\u001dR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter$EventViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "eventFragmentManageEventCallback", "Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter$EventFragmentManageEventCallback;", "events", "", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "inflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "getProperlyFormattedDate", "", "eventRoomModel", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEventFragmentManageEventCallback", "setEvents", "eventRoomModels", "setEvents$app_debug", "EventFragmentManageEventCallback", "EventViewHolder", "app_debug"})
public final class EventListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.android.joshuamarotta.metronote.adapters.EventListAdapter.EventViewHolder> {
    private com.android.joshuamarotta.metronote.adapters.EventListAdapter.EventFragmentManageEventCallback eventFragmentManageEventCallback;
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel> events;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.joshuamarotta.metronote.adapters.EventListAdapter.EventViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.adapters.EventListAdapter.EventViewHolder holder, int position) {
    }
    
    private final java.lang.String getProperlyFormattedDate(com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel) {
        return null;
    }
    
    public final void setEvents$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.joshuamarotta.metronote.models.EventRoomModel> eventRoomModels) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setEventFragmentManageEventCallback(@org.jetbrains.annotations.Nullable()
    com.android.joshuamarotta.metronote.adapters.EventListAdapter.EventFragmentManageEventCallback eventFragmentManageEventCallback) {
    }
    
    public EventListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter$EventViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter;Landroid/view/View;)V", "eventDateTime", "Landroid/widget/TextView;", "getEventDateTime", "()Landroid/widget/TextView;", "eventDescription", "getEventDescription", "eventLocation", "getEventLocation", "eventTitle", "getEventTitle", "manageTextView", "getManageTextView", "swipeLayout", "Lcom/daimajia/swipe/SwipeLayout;", "getSwipeLayout", "()Lcom/daimajia/swipe/SwipeLayout;", "app_debug"})
    public final class EventViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.daimajia.swipe.SwipeLayout swipeLayout = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView eventTitle = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView eventDescription = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView eventLocation = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView eventDateTime = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView manageTextView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.daimajia.swipe.SwipeLayout getSwipeLayout() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getEventTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getEventDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getEventLocation() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getEventDateTime() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getManageTextView() {
            return null;
        }
        
        public EventViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/android/joshuamarotta/metronote/adapters/EventListAdapter$EventFragmentManageEventCallback;", "", "displayNoEventsBookedView", "", "hideNoEventsBookedView", "manageEvent", "eventRoomModel", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "app_debug"})
    public static abstract interface EventFragmentManageEventCallback {
        
        public abstract void manageEvent(@org.jetbrains.annotations.NotNull()
        com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel);
        
        public abstract void displayNoEventsBookedView();
        
        public abstract void hideNoEventsBookedView();
    }
}