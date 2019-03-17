package com.android.joshuamarotta.metronote.roomdatabase

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.*
import android.content.Context
import com.android.joshuamarotta.metronote.converters.Converters
import com.android.joshuamarotta.metronote.interfaces.dao.EventDao
import com.android.joshuamarotta.metronote.models.EventRoomModel
import kotlinx.coroutines.CoroutineScope
import java.util.*

@TypeConverters(Converters::class)
@Database(entities = [EventRoomModel::class], version = 1)
abstract class EventRoomDatabase : RoomDatabase() {

    abstract fun eventDao(): EventDao

    companion object {
        @Volatile
        private var INSTANCE: EventRoomDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): EventRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    EventRoomDatabase::class.java,
                    "event_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(EventDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class EventDatabaseCallback(private val scope: CoroutineScope): RoomDatabase.Callback() {
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                //TODO _ COMMENT THIS OUT TO KEEP ROOM DATABASE DATA THROUGH APP RESTARTS! UNCOMMENT TO CLEAR ALL DATA
                //INSTANCE?.let { database -> scope.launch(Dispatchers.IO) { populateDatabase(database.eventDao()) } }
            }
        }
    }

}
