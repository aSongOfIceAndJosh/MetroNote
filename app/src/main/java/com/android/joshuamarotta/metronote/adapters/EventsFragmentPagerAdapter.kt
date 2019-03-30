package com.android.joshuamarotta.metronote.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

private const val NUM_PAGES = 2

class EventsFragmentPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    private val fragmentList: ArrayList<Fragment> = arrayListOf()

    override fun getItem(position: Int) = fragmentList[position]

    override fun getCount() = NUM_PAGES

    fun addFragment(fragment: Fragment) = fragmentList.add(fragment)

    fun addFragments(fragmentList: List<Fragment>?) = fragmentList?.let { this.fragmentList.addAll(it) }

    override fun getPageTitle(position: Int) = when(position) {
            0 -> "Performances"
            1 -> "Practices"
            2 -> "Transactions"
            else -> ""
        }
}