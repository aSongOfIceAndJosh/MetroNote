package com.android.joshuamarotta.metronote.DataBus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/android/joshuamarotta/metronote/DataBus/RxDataBusEvent;", "", "eventType", "Lcom/android/joshuamarotta/metronote/DataBus/RxDataBusEvent$EventType;", "(Lcom/android/joshuamarotta/metronote/DataBus/RxDataBusEvent$EventType;)V", "eventRoomModel", "Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "getEventRoomModel", "()Lcom/android/joshuamarotta/metronote/models/EventRoomModel;", "setEventRoomModel", "(Lcom/android/joshuamarotta/metronote/models/EventRoomModel;)V", "getEventType", "()Lcom/android/joshuamarotta/metronote/DataBus/RxDataBusEvent$EventType;", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "EventType", "app_debug"})
public final class RxDataBusEvent {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private com.android.joshuamarotta.metronote.models.EventRoomModel eventRoomModel;
    @org.jetbrains.annotations.NotNull()
    private final com.android.joshuamarotta.metronote.DataBus.RxDataBusEvent.EventType eventType = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.joshuamarotta.metronote.models.EventRoomModel getEventRoomModel() {
        return null;
    }
    
    public final void setEventRoomModel(@org.jetbrains.annotations.Nullable()
    com.android.joshuamarotta.metronote.models.EventRoomModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.joshuamarotta.metronote.DataBus.RxDataBusEvent.EventType getEventType() {
        return null;
    }
    
    public RxDataBusEvent(@org.jetbrains.annotations.NotNull()
    com.android.joshuamarotta.metronote.DataBus.RxDataBusEvent.EventType eventType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/joshuamarotta/metronote/DataBus/RxDataBusEvent$EventType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SetTabLayoutBackgroundTint", "RestoreNaturalTabLayoutBackground", "CloseFloatingActionButtonMenu", "GetEventFromRoomDatabase", "app_debug"})
    public static enum EventType {
        /*public static final*/ SetTabLayoutBackgroundTint /* = new SetTabLayoutBackgroundTint(0) */,
        /*public static final*/ RestoreNaturalTabLayoutBackground /* = new RestoreNaturalTabLayoutBackground(0) */,
        /*public static final*/ CloseFloatingActionButtonMenu /* = new CloseFloatingActionButtonMenu(0) */,
        /*public static final*/ GetEventFromRoomDatabase /* = new GetEventFromRoomDatabase(0) */;
        private final int value = 0;
        
        public final int getValue() {
            return 0;
        }
        
        EventType(int value) {
        }
    }
}