package com.android.joshuamarotta.metronote.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.support.v4.app.Fragment
import com.android.joshuamarotta.metronote.repositories.EventsFragmentRepository

class EventsFragmentViewModel(application: Application, repository: EventsFragmentRepository): AndroidViewModel(application) {
    val viewPagerFragments: LiveData<List<Fragment>> = repository.viewPagerFragments
}