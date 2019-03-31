package com.android.joshuamarotta.metronote.viewpager

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class NoSwipeViewPager(context: Context, attributeSet: AttributeSet): ViewPager(context, attributeSet) {

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }
}