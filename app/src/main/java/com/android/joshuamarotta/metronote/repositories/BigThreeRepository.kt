package com.android.joshuamarotta.metronote.repositories

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.android.joshuamarotta.metronote.models.*
import com.google.firebase.storage.FirebaseStorage
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class BigThreeRepository {

    private var storage: FirebaseStorage = FirebaseStorage.getInstance()
    val bigThree: LiveData<List<BigThreeModel>>

    init {
        bigThree = MutableLiveData<List<BigThreeModel>>()

        Single.just(loadImageThumbnails())
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { it ->
                it.addOnSuccessListener {
                    val bigThreeTitles = listOf(PERFORMANCES, PRACTICES, TRANSACTIONS)

                    bigThree.value = listOf(
                        BigThreeModel(bigThreeTitles[0],it),
                        BigThreeModel(bigThreeTitles[1], it),
                        BigThreeModel(bigThreeTitles[2], it)
                    )
                }
            }
    }

    private fun loadImageThumbnails() = storage.reference.child("images/Performances-MetroNote.jpg").downloadUrl
}