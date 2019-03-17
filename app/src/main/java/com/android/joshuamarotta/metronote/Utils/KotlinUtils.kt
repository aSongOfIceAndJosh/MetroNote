package com.android.joshuamarotta.metronote.Utils

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.view.View
import android.view.ViewGroup
import com.android.joshuamarotta.metronote.helpers.TypeFaceSpan


/**
 * Created by f22labs on 07/03/17.
 */
const val EVENT_ID = "event_id"
const val EVENT_TITLE = "event_title"
const val EVENT_DESCRIPTION = "event_description"
const val EVENT_LOCATION = "event_location"
const val EVENT_TYPE = "event_type"
const val EVENT_DATE_TIME = "event_date_time"
const val EVENT_ROOM_MODEL = "event_room_model"

object KotlinUtils {

    fun <T> T?.or(default: T): T = this ?: default
    fun <T> T?.or(compute: () -> T): T = this ?: compute()

    fun Fragment.isSectionVisible(): Boolean = (((view?.parent as? ViewGroup)?.parent as? ViewGroup)?.visibility == View.VISIBLE)

    fun Fragment.setupActionBar(title: String, displayHome: Boolean = false) {
        val spannableString = SpannableString(title)
        spannableString.setSpan(TypeFaceSpan(context, "Roboto-Regular.ttf"),0, spannableString.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        (activity as? AppCompatActivity)?.supportActionBar?.apply {
            this.title = spannableString
            setDisplayShowHomeEnabled(displayHome)
            setDisplayHomeAsUpEnabled(displayHome)
            elevation = 4f
        }
        setHasOptionsMenu(displayHome)


    }

    fun Fragment.setActionBarTitle(title: String) {
        val spannableString = SpannableString(title)
        spannableString.setSpan(TypeFaceSpan(context, "Roboto-Regular.ttf"),0, spannableString.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        (activity as? AppCompatActivity)?.supportActionBar?.title = spannableString
    }
}
fun <T> T?.or(default: T): T = this ?: default
fun <T> T?.or(compute: () -> T): T = this ?: compute()
