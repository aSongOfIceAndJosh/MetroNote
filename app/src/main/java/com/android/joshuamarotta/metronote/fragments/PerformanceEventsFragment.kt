package com.android.joshuamarotta.metronote.fragments


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.EVENT_ROOM_MODEL
import com.android.joshuamarotta.metronote.adapters.EventListAdapter
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import devs.mulham.horizontalcalendar.HorizontalCalendar
import devs.mulham.horizontalcalendar.model.CalendarEvent
import devs.mulham.horizontalcalendar.utils.CalendarEventsPredicate
import kotlinx.android.synthetic.main.fragment_performance_events.view.*
import java.util.*

class PerformanceEventsFragment : Fragment(), EventListAdapter.EventFragmentManageEventCallback {

    private lateinit var eventViewModel: EventViewModel

    private lateinit var recyclerView: RecyclerView
    private lateinit var horizontalCalendar: HorizontalCalendar
    private var adapter: EventListAdapter? = null
    private lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_performance_events, container, false)
        recyclerView = rootView.fragment_performances_events_recyclerview
        adapter = context?.let { EventListAdapter(it) }
        adapter?.setEventFragmentManageEventCallback(this)





        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        eventViewModel = ViewModelProviders.of(this).get(EventViewModel::class.java)
        eventViewModel.dateTimeSortedPerformances.observe(this, Observer { events -> events?.let { adapter?.setEvents(it) } })
        eventViewModel.dateTimeSortedEvents.observe(this, Observer { eventViewModel.processSortedEventsToSortedMap() })

        eventViewModel.dateTimeSortedEventsMap.observe(this, Observer { it?.let { map -> buildHorizontalCalendar(map) } })

        //TODO perhaps observe the events map here and update the horizontal calendar?
    }

    private fun buildHorizontalCalendar(dateTimeSortedEventsMap: Map<String, List<EventRoomModel>>) {
        val startDate = Calendar.getInstance()
        startDate.add(Calendar.MONTH, -1)
        val endDate = Calendar.getInstance()
        endDate.add(Calendar.MONTH, 1)

        horizontalCalendar = HorizontalCalendar.Builder(rootView, R.id.horizontalCalendarView)
            .range(startDate, endDate)
            .datesNumberOnScreen(5)
            .addEvents {
                mutableListOf(CalendarEvent(Color.WHITE, "TEST"))
            }
            .build()
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

    override fun displayNoEventsBookedView() { rootView.performances_events_fragment_no_events_booked_textview.visibility = VISIBLE }

    override fun hideNoEventsBookedView() { rootView.performances_events_fragment_no_events_booked_textview.visibility = GONE }
}
