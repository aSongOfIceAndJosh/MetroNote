package com.android.joshuamarotta.metronote.fragments

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.preference.PreferenceFragmentCompat
import android.widget.TextView
import android.widget.Toast
import com.afollestad.materialdialogs.MaterialDialog
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.activities.AboutActivity
import com.android.joshuamarotta.metronote.activities.LaunchActivity
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import com.firebase.ui.auth.AuthUI

class PreferencesFragment : PreferenceFragmentCompat(){

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)

        findPreference("AboutMe").setOnPreferenceClickListener {
            startActivity(Intent(context, AboutActivity::class.java))
            true
        }

        findPreference("DeleteAllEvents").setOnPreferenceClickListener {
            val dialog = context?.let {
                MaterialDialog.Builder(it)
                    .title("Delete All Events?")
                    .negativeText("Cancel")
                    .negativeColorRes(R.color.black)
                    .positiveText("Delete")
                    .positiveColorRes(R.color.base_red_color)
                    .onPositive { _, _ ->
                        val eventViewModel = ViewModelProviders.of(this).get(EventViewModel::class.java)
                            eventViewModel.deleteAllEvents().invokeOnCompletion {
                                activity?.runOnUiThread {
                                    val toast = Toast.makeText(context, "All events deleted!", Toast.LENGTH_SHORT)
                                    val view = toast.view
                                    val text = view.findViewById(android.R.id.message) as TextView
                                    context?.let { context ->
                                        text.setTextColor(ContextCompat.getColor(context, R.color.white))
                                        view.background.setColorFilter(
                                            ContextCompat.getColor(
                                                context,
                                                R.color.toolbar_main_color
                                            ), PorterDuff.Mode.SRC_IN
                                        )
                                    }
                                    toast.show()
                                }
                            }
                    }
                    .show()
            }
            true
        }

        findPreference("LogOut").setOnPreferenceClickListener {
            context?.let { task ->
                AuthUI.getInstance().signOut(task).addOnCompleteListener {
                    val intent = Intent(context, LaunchActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or
                            Intent.FLAG_ACTIVITY_CLEAR_TASK or
                            Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                    //activity?.finish()
                }
            }
            true
        }
    }
}
