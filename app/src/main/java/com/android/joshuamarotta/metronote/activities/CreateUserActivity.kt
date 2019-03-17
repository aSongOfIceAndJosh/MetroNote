package com.android.joshuamarotta.metronote.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.MenuItem
import android.widget.Toast
import com.android.joshuamarotta.metronote.R
import com.google.firebase.auth.FirebaseAuth
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_create_user.*

class CreateUserActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
        mAuth = FirebaseAuth.getInstance()
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayShowTitleEnabled(false)
        }
        setupCreateUserButton()
    }

    private fun setupCreateUserButton() {
        compositeDisposable.add(
            RxView.clicks(create_user_activity_create_user_button)
                .subscribe{
                    if (TextUtils.isEmpty(create_user_activity_email_editText.text.trim()) && TextUtils.isEmpty(create_user_activity_password_edit_text.text.trim())) {
                        Toast.makeText(this, "Please enter your email and password!", Toast.LENGTH_SHORT).show()
                    } else if (TextUtils.isEmpty(create_user_activity_email_editText.text.trim())) {
                        Toast.makeText(this, "Please enter your email!", Toast.LENGTH_SHORT).show()
                    } else if (TextUtils.isEmpty(create_user_activity_password_edit_text.text.trim())) {
                        Toast.makeText(this, "Please enter a password!", Toast.LENGTH_SHORT).show()
                    } else {
                        createUser()
                    }
                }
        )
    }

    private fun createUser() {
        val email = create_user_activity_email_editText.text.trim().toString()
        val password = create_user_activity_password_edit_text.text.trim().toString()
        rotateloading_create_user.start()
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.addFlags(
                        Intent.FLAG_ACTIVITY_CLEAR_TOP or
                                Intent.FLAG_ACTIVITY_CLEAR_TASK or
                                Intent.FLAG_ACTIVITY_NEW_TASK
                    )
                    startActivity(intent)
                    rotateloading_create_user.stop()
                } else {
                    Toast.makeText(this, "Account Creation Failed!", Toast.LENGTH_SHORT).show()
                    rotateloading_create_user.stop()
                }
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

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }
}
