package com.android.joshuamarotta.metronote.fragments

import com.android.joshuamarotta.metronote.adapters.EventListAdapter

class PracticeEventsFragment : EventsContentFragment(), EventListAdapter.EventFragmentManageEventCallback {
    override var eventsContentFragmentType: EventsContentFragmentType = EventsContentFragmentType.PRACTICE
}