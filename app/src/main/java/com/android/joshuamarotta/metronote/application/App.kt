package com.android.joshuamarotta.metronote.application

import android.app.Application
import shortbread.Shortbread

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        Shortbread.create(this)
    }
}