package com.android.joshuamarotta.metronote.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.models.EventRoomModel

/**
 * Created by Joshua Marotta on 6/25/18.
 */
class HomeFragmentAdapter internal constructor (context: Context) : Adapter<HomeFragmentAdapter.HomeFragmentViewHolder>() {
    private var events = emptyList<EventRoomModel>()

    inner class HomeFragmentViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val homeItemView = inflater.inflate(R.layout.recycler_view_home_item_top, parent, false)
        return HomeFragmentViewHolder(homeItemView)
    }

    override fun getItemCount() = events.size

    override fun onBindViewHolder(holder: HomeFragmentViewHolder, position: Int) {

    }

    internal fun setEvents(eventRoomModels: List<EventRoomModel>) {
        this.events = eventRoomModels
        notifyDataSetChanged()
        //if (eventRoomModels.isEmpty()) eventFragmentManageEventCallback?.displayNoEventsBookedView() else eventFragmentManageEventCallback?.hideNoEventsBookedView()
    }
}