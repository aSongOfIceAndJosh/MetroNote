package com.android.joshuamarotta.metronote.repositories

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.support.v4.app.Fragment
import com.android.joshuamarotta.metronote.fragments.PerformanceEventsFragment
import com.android.joshuamarotta.metronote.fragments.PracticeEventsFragment

class EventsFragmentRepository {
    val viewPagerFragments: LiveData<List<Fragment>>

    init {
        viewPagerFragments = MutableLiveData<List<Fragment>>()
        //TODO - make transaction fragment here!
        viewPagerFragments.value = listOf(
            PerformanceEventsFragment(),
            PracticeEventsFragment(),
            PerformanceEventsFragment()
        )
    }
}