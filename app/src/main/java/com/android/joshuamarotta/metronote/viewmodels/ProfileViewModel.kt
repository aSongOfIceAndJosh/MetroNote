package com.android.joshuamarotta.metronote.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.android.joshuamarotta.metronote.models.BigThreeModel
import com.android.joshuamarotta.metronote.repositories.BigThreeRepository

class ProfileViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: BigThreeRepository = BigThreeRepository()
    val bigThreeProperties: LiveData<List<BigThreeModel>>

    init {
        bigThreeProperties = repository.bigThree
    }

}