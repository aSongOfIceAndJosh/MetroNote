package com.android.joshuamarotta.metronote.fragments

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.graphics.Canvas
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.EVENT_ROOM_MODEL
import com.android.joshuamarotta.metronote.adapters.EventListAdapter
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import kotlinx.android.synthetic.main.fragment_events_content.view.*
import org.koin.android.viewmodel.ext.android.sharedViewModel

abstract class EventsContentFragment : Fragment(), EventListAdapter.EventFragmentManageEventCallback {

    private val eventViewModel: EventViewModel by sharedViewModel()

    lateinit var recyclerView: RecyclerView
    var adapter: EventListAdapter? = null
    lateinit var rootView: View
    var adapterEventsLiveData: LiveData<List<EventRoomModel>>? = null
    lateinit var itemTouchHelper: ItemTouchHelper

    abstract var eventsContentFragmentType: EventsContentFragmentType

    private val recyclerViewItemTouchCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
        override fun onMove(p0: RecyclerView, p1: RecyclerView.ViewHolder, p2: RecyclerView.ViewHolder): Boolean {
            Toast.makeText(context, "on Move", Toast.LENGTH_SHORT).show()
            return false
        }

        override fun onSwiped(p0: RecyclerView.ViewHolder, p1: Int) {
            Toast.makeText(context, "on Swiped", Toast.LENGTH_SHORT).show()
        }

        override fun onChildDraw(
            c: Canvas,
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            dX: Float,
            dY: Float,
            actionState: Int,
            isCurrentlyActive: Boolean
        ) {
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_events_content, container, false)
        recyclerView = rootView.fragment_events_content_recyclerview
        adapter = context?.let { EventListAdapter(it) }
        adapter?.setEventFragmentManageEventCallback(this)
        itemTouchHelper = ItemTouchHelper(recyclerViewItemTouchCallback)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        itemTouchHelper.attachToRecyclerView(recyclerView)
        initAdapterEventsLiveData()
        observeEventsLiveData()
    }

    private fun initAdapterEventsLiveData() {
        adapterEventsLiveData =
            when (eventsContentFragmentType) {
                EventsContentFragmentType.PRACTICE -> eventViewModel.dateTimeSortedPractices
                EventsContentFragmentType.PERFORMANCE -> eventViewModel.dateTimeSortedPerformances
                else -> eventViewModel.dateTimeSortedPractices
            }
    }

    private fun observeEventsLiveData()  = adapterEventsLiveData?.observe(this, Observer { events -> events?.let { adapter?.setEvents(it) } })

    override fun onDestroy() {
        super.onDestroy()
        adapter?.setEventFragmentManageEventCallback(null)
    }

    override fun displayNoEventsBookedView() { rootView.events_fragment_no_events_booked_textview.visibility = View.VISIBLE }

    override fun hideNoEventsBookedView() { rootView.events_fragment_no_events_booked_textview.visibility = View.GONE }


    override fun manageEvent(eventRoomModel: EventRoomModel) {
        val args = Bundle()
        args.putParcelable(EVENT_ROOM_MODEL, eventRoomModel)
        findNavController().navigate(R.id.action_eventsFragment_to_manageEventFragment, args)
    }
}

enum class EventsContentFragmentType(val typeId: String) {
    PRACTICE(PRACTICE_TYPE),
    PERFORMANCE(PERFORMANCE_TYPE),
    NONE(NONE_TYPE)
}

const val PRACTICE_TYPE = "PRACTICE_TYPE"
const val PERFORMANCE_TYPE = "PERFORMANCE_TYPE"
const val NONE_TYPE = "NONE_TYPE"

