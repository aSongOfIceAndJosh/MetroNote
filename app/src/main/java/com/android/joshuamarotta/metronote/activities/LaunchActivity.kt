package com.android.joshuamarotta.metronote.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.firebase.auth.FirebaseAuth

class LaunchActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ONCREATE1", "CALLED")

        mAuth = FirebaseAuth.getInstance()
        if (mAuth.currentUser != null) {
            //User is signed in
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

    override fun onBackPressed() {
        Log.d("ONBACK", "CALLED")
        finish()
    }
}
