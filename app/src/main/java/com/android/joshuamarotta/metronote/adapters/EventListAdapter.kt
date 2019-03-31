package com.android.joshuamarotta.metronote.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.TextView
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.daimajia.swipe.SwipeLayout
import kotlinx.android.synthetic.main.events_fragment_event_recyclerview_item.*
import kotlinx.android.synthetic.main.events_fragment_event_recyclerview_item.view.*
import java.text.SimpleDateFormat

class EventListAdapter internal constructor(context: Context) : RecyclerView.Adapter<EventListAdapter.EventViewHolder>() {
    private var eventFragmentManageEventCallback: EventFragmentManageEventCallback? = null

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var events = emptyList<EventRoomModel>() // Cached copy of events

    inner class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val swipeLayout: SwipeLayout = itemView.swipeLayout
        val eventTitle: TextView? = itemView.events_fragment_recyclerview_item_title
        val eventDescription: TextView? = itemView.events_fragment_recyclerview_item_description
        val eventLocation: TextView? = itemView.events_fragment_recyclerview_item_location
        val eventDateTime: TextView? = itemView.events_fragment_recyclerview_item_date_time
        val manageTextView: TextView? = itemView.events_fragment_recyclerview_item_manage_event
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val itemView = inflater.inflate(R.layout.events_fragment_event_recyclerview_item, parent, false)
        val eventViewHolder =  EventViewHolder(itemView)

        eventViewHolder.swipeLayout.apply {
            showMode = SwipeLayout.ShowMode.LayDown
            swipeLayout.addDrag(SwipeLayout.DragEdge.Left, rootView.bottom_wrapper)
            swipeLayout.addSwipeListener(object: SwipeLayout.SwipeListener {
                override fun onOpen(layout: SwipeLayout?) {
                    //TODO
                }

                override fun onUpdate(layout: SwipeLayout?, leftOffset: Int, topOffset: Int) {
                    //TODO
                }

                override fun onStartOpen(layout: SwipeLayout?) {
                    //TODO
                }

                override fun onStartClose(layout: SwipeLayout?) {
                    //TODO
                }

                override fun onHandRelease(layout: SwipeLayout?, xvel: Float, yvel: Float) {
                    //TODO
                }

                override fun onClose(layout: SwipeLayout?) {
                    //TODO
                }

            })
        }

        return eventViewHolder
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val current = events[position]
        holder.eventTitle?.text = current.title
        holder.eventDescription?.text = current.description
        holder.eventLocation?.text = current.location
        holder.eventDateTime?.text = getProperlyFormattedDate(current)

        //TODO - set up click listener here for manage event fragment
        holder.manageTextView?.apply {
            setOnClickListener { eventFragmentManageEventCallback?.manageEvent(current) }
            visibility = VISIBLE
        }
    }

    private fun getProperlyFormattedDate(eventRoomModel: EventRoomModel): String {
        val simpleDateFormat = SimpleDateFormat("MM/dd/yyyy HH:mm a")
        return simpleDateFormat.format(eventRoomModel.dateTime).toString()
    }

    internal fun setEvents(eventRoomModels: List<EventRoomModel>) {
        this.events = eventRoomModels
        notifyDataSetChanged()
        if (eventRoomModels.isEmpty()) eventFragmentManageEventCallback?.displayNoEventsBookedView() else eventFragmentManageEventCallback?.hideNoEventsBookedView()
    }

    override fun getItemCount() = events.size

    interface EventFragmentManageEventCallback {
        fun manageEvent(eventRoomModel: EventRoomModel)
        fun displayNoEventsBookedView()
        fun hideNoEventsBookedView()
    }

    fun setEventFragmentManageEventCallback(eventFragmentManageEventCallback: EventFragmentManageEventCallback?) { this.eventFragmentManageEventCallback = eventFragmentManageEventCallback}
}

