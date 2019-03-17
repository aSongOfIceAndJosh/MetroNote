package com.android.joshuamarotta.metronote.models

import android.net.Uri

const val PERFORMANCES = "Performances"
const val PRACTICES = "Practices"
const val TRANSACTIONS = "Transactions"

data class BigThreeModel(val title: String, val imageUri: Uri?)