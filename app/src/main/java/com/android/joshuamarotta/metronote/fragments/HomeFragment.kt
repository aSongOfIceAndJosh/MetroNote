package com.android.joshuamarotta.metronote.fragments

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.isSectionVisible
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.setupActionBar
import com.android.joshuamarotta.metronote.adapters.HomeFragmentAdapter
import com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import com.android.joshuamarotta.metronote.viewmodels.HomeFragmentViewModel
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment(), OnReselectedDelegate {
    private lateinit var recyclerView: RecyclerView
    private var adapter: HomeFragmentAdapter? = null
    private lateinit var homeFragmentViewModel: HomeFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = rootView.recycler_view_home
        adapter = context?.let { HomeFragmentAdapter(it) }
        initTopHorizontalRecyclerView(rootView)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        homeFragmentViewModel = ViewModelProviders.of(this).get(HomeFragmentViewModel::class.java)
        //eventViewModel.allEvents.observe(this, Observer { events -> events?.let {adapter?.setEvents(it) } })
        //eventViewModel.dateTimeSortedEvents.observe(this, Observer { events -> events?.let { adapter?.setEvents(it) } })
        homeFragmentViewModel.homeFeedItems.observe(this, Observer { events -> events?.let { adapter?.setEvents(it) } })

    }

    override fun onReselected() = setupActionBar()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { if (isSectionVisible()) setupActionBar() }

    private fun setupActionBar() = setupActionBar(getString(R.string.title_home_fragment))

    private fun initTopHorizontalRecyclerView(rootView: View) {
       // val horizontalRecyclerView = findViewById(R.id.recycler_view_home_item_horizontal_sub_recycler_view) as RecyclerView
        //horizontalRecyclerView.adapter = HorizontalRecyclerViewAdapter()
        //horizontalRecyclerView.layoutManager = LinearLayoutManager(context)
    }
}
