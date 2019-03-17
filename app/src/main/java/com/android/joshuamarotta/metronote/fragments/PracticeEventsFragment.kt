package com.android.joshuamarotta.metronote.fragments

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.EVENT_ROOM_MODEL
import com.android.joshuamarotta.metronote.adapters.EventListAdapter
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import kotlinx.android.synthetic.main.fragment_practice_events.view.*

class PracticeEventsFragment : Fragment(), EventListAdapter.EventFragmentManageEventCallback {
    private lateinit var recyclerView: RecyclerView
    private var adapter: EventListAdapter? = null
    private lateinit var eventViewModel: EventViewModel
    private lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_practice_events, container, false)
        recyclerView = rootView.fragment_practices_events_recyclerview
        adapter = context?.let { EventListAdapter(it) }
        adapter?.setEventFragmentManageEventCallback(this)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        eventViewModel = ViewModelProviders.of(this).get(EventViewModel::class.java)
        eventViewModel.dateTimeSortedPractices.observe(this, Observer { events -> events?.let { adapter?.setEvents(it) } })
    }

    override fun onDestroy() {
        super.onDestroy()
        adapter?.setEventFragmentManageEventCallback(null)
    }

    override fun manageEvent(eventRoomModel: EventRoomModel) {
        val args = Bundle()
        args.putParcelable(EVENT_ROOM_MODEL, eventRoomModel)
        findNavController().navigate(R.id.action_eventsFragment_to_manageEventFragment, args)
    }

    override fun displayNoEventsBookedView() { rootView.practices_events_fragment_no_events_booked_textview.visibility = View.VISIBLE }

    override fun hideNoEventsBookedView() { rootView.practices_events_fragment_no_events_booked_textview.visibility = View.GONE }
}