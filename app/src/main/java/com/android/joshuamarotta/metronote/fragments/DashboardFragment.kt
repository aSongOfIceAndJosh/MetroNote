package com.android.joshuamarotta.metronote.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.isSectionVisible
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.setupActionBar
import com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate

class DashboardFragment : Fragment(), OnReselectedDelegate {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = View.inflate(activity, R.layout.dashboard_fragment, null)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { if (isSectionVisible()) setupActionBar() }

    private fun setupActionBar() = setupActionBar("Dashboard")

    override fun onReselected() = setupActionBar()
}