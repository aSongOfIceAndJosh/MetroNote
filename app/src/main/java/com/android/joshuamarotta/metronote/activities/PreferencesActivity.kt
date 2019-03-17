package com.android.joshuamarotta.metronote.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem


import com.android.joshuamarotta.metronote.R

class PreferencesActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        supportActionBar?.apply {
            title = getString(R.string.title_activity_preferences)
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return false
    }

    override fun onBackPressed() {
        this.finish()
        overridePendingTransition(R.anim.fade_in, R.anim.right_slide_out)
    }
}
