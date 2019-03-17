package com.android.joshuamarotta.metronote.roomdatabase;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {com.android.joshuamarotta.metronote.models.EventRoomModel.class}, version = 1)
@android.arch.persistence.room.TypeConverters(value = {com.android.joshuamarotta.metronote.converters.Converters.class})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/joshuamarotta/metronote/roomdatabase/EventRoomDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "eventDao", "Lcom/android/joshuamarotta/metronote/interfaces/dao/EventDao;", "Companion", "app_debug"})
public abstract class EventRoomDatabase extends android.arch.persistence.room.RoomDatabase {
    private static volatile com.android.joshuamarotta.metronote.roomdatabase.EventRoomDatabase INSTANCE;
    public static final com.android.joshuamarotta.metronote.roomdatabase.EventRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.joshuamarotta.metronote.interfaces.dao.EventDao eventDao();
    
    public EventRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/android/joshuamarotta/metronote/roomdatabase/EventRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/android/joshuamarotta/metronote/roomdatabase/EventRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "populateDatabase", "", "eventDao", "Lcom/android/joshuamarotta/metronote/interfaces/dao/EventDao;", "EventDatabaseCallback", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.joshuamarotta.metronote.roomdatabase.EventRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        public final void populateDatabase(@org.jetbrains.annotations.NotNull()
        com.android.joshuamarotta.metronote.interfaces.dao.EventDao eventDao) {
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/android/joshuamarotta/metronote/roomdatabase/EventRoomDatabase$Companion$EventDatabaseCallback;", "Landroid/arch/persistence/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onOpen", "", "db", "Landroid/arch/persistence/db/SupportSQLiteDatabase;", "app_debug"})
        static final class EventDatabaseCallback extends android.arch.persistence.room.RoomDatabase.Callback {
            private final kotlinx.coroutines.CoroutineScope scope = null;
            
            @java.lang.Override()
            public void onOpen(@org.jetbrains.annotations.NotNull()
            android.arch.persistence.db.SupportSQLiteDatabase db) {
            }
            
            public EventDatabaseCallback(@org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.CoroutineScope scope) {
                super();
            }
        }
    }
}