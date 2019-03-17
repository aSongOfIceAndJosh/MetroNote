package com.android.joshuamarotta.metronote.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.widget.Toast
import com.android.joshuamarotta.metronote.R
import com.google.firebase.auth.FirebaseAuth
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()
        setupEditTextClickListeners()
        setupLoginButton()
    }

    private fun setupEditTextClickListeners() {
        compositeDisposable.addAll(
            RxView.clicks(login_activity_create_account_edit_text).subscribe { startActivity(Intent(this, CreateUserActivity::class.java)) },
            RxView.clicks(login_activity_forgot_password_edit_text).subscribe { startActivity(Intent(this, ResetPasswordActivity::class.java)) }
        )
    }

    private fun setupLoginButton() {
        compositeDisposable.add(
            RxView.clicks(login_activity_login_button)
                .subscribe {
                    if (TextUtils.isEmpty(login_activity_email_editText.text.trim()) && TextUtils.isEmpty(login_activity_password_edit_text.text.trim())) {
                        Toast.makeText(this, "Please enter your email and password!", Toast.LENGTH_SHORT).show()
                    } else if (TextUtils.isEmpty(login_activity_email_editText.text.trim())) {
                        Toast.makeText(this, "Please enter your email!", Toast.LENGTH_SHORT).show()
                    } else if (TextUtils.isEmpty(login_activity_password_edit_text.text.trim())) {
                        Toast.makeText(this, "Please enter your password!", Toast.LENGTH_SHORT).show()
                    } else {
                        //TODO - set progress bar while loading!
                        val email = login_activity_email_editText.text.trim().toString()
                        val password = login_activity_password_edit_text.text.trim().toString()
                        rotateloading_login.start()
                        mAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener {
                                if (it.isSuccessful) {
                                    val intent = Intent(this, HomeActivity::class.java)
                                    intent.addFlags(
                                        Intent.FLAG_ACTIVITY_CLEAR_TOP or
                                                Intent.FLAG_ACTIVITY_CLEAR_TASK or
                                                Intent.FLAG_ACTIVITY_NEW_TASK
                                    )
                                    startActivity(intent)
                                    rotateloading_login.stop()
                                } else {
                                    Toast.makeText(this, "Login failed!", Toast.LENGTH_SHORT).show()
                                    rotateloading_login.stop()
                                }
                            }
                    }
                }

        )
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }
}
