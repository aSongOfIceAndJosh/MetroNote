package com.android.joshuamarotta.metronote.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.firebase.firestore.ServerTimestamp
import kotlinx.android.parcel.Parcelize
import java.util.*

data class PerformanceEvent(var title: String? = null, var description: String? = null,
                            var location: String? = null, var eventType: String? = "Performance", @ServerTimestamp var dateTime : Date)

data class PracticeEvent(var title: String? = null, var description: String? = null,
                         var location: String? = null, var eventType: String? = "Practice", @ServerTimestamp var dateTime : Date)


@Parcelize
@Entity(tableName = "event_table")
data class EventRoomModel(
    @PrimaryKey(autoGenerate = true) var eventId: Int = 0,
    var title: String,
    var description: String,
    var location: String,
    var eventType: String,
    var dateTime: Date?
) : Parcelable