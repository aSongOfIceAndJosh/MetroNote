package com.android.joshuamarotta.metronote.DataBus

import com.android.joshuamarotta.metronote.models.EventRoomModel

class RxDataBusEvent(val eventType: EventType) {

    var message: String? = null
    var eventRoomModel: EventRoomModel? = null

    enum class EventType(val value: Int) {
        SetTabLayoutBackgroundTint(1),
        RestoreNaturalTabLayoutBackground(2),
        CloseFloatingActionButtonMenu(3),
        GetEventFromRoomDatabase(4)
    }

    //fun attachMessage(message: String) { this.message = message }

    //fun eventIsMessage() = EventType.Message == eventType
}