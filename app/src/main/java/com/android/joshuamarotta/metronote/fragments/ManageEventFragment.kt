package com.android.joshuamarotta.metronote.fragments

import android.arch.lifecycle.ViewModelProviders
import android.graphics.PorterDuff
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.android.joshuamarotta.metronote.DataBus.RxDataBusEvent
import com.android.joshuamarotta.metronote.DataBus.RxDataBusImpl

import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.*
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.isSectionVisible
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.setupActionBar
import com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_manage_event.view.*
import java.util.*

class ManageEventFragment : Fragment(), OnReselectedDelegate {

    private var eventRoomModel: EventRoomModel? = null
    private var eventTitle: String? = null
    private var eventDescription: String? = null
    private var eventLocation: String? = null
    private var eventType: String? = null
    private var eventDateTime: Date? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView =  inflater.inflate(R.layout.fragment_manage_event, container, false)
        initEventProperties(rootView, arguments)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { if (isSectionVisible()) setupActionBar() }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu_manage_event, menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?) {
        menu?.apply {
            findItem(R.id.menu_options_item_settings)?.isVisible = false
            findItem(R.id.menu_options_item_delete_event)?.setOnMenuItemClickListener {
                handleDeleteEventDialog()
                return@setOnMenuItemClickListener true
            }
        }
    }

    private fun setupActionBar() = setupActionBar("Manage Event", displayHome = true)

    override fun onReselected() = setupActionBar()

    private fun initEventProperties(view: View, args: Bundle?) {
        eventRoomModel = args?.getParcelable(EVENT_ROOM_MODEL)
        eventTitle = eventRoomModel?.title
        eventDescription = eventRoomModel?.description
        eventLocation = eventRoomModel?.location
        eventType = eventRoomModel?.eventType
        eventDateTime = eventRoomModel?.dateTime as Date

        view.apply {
            manage_event_title_editText.setText(eventTitle)
            manage_event_description_editText.setText(eventDescription)
            manage_event_location_editText.setText(eventLocation)
            manage_event_spinner.apply {
                setItems(mutableListOf("Practice", "Performance"))
                selectedIndex = if (eventType == "Practice") 0 else 1
            }
            //TODO - set date & time in dialog here
        }
    }

    //TODO - create ToastHelper to extract the toast setup logic
    private fun handleDeleteEventDialog() {
        //Throw callback to handle delete Toast!
        val dialog = context?.let {
            MaterialDialog.Builder(it)
                .title("Delete ${eventType?.toLowerCase()} '$eventTitle'?")
                .positiveText("Delete")
                .positiveColorRes(R.color.base_red_color)
                .onPositive { _, _ ->
                    val eventViewModel = ViewModelProviders.of(this).get(EventViewModel::class.java)
                    //eventViewModel.deleteAllEvents()
                    eventRoomModel?.let { eventRoomModel ->
                        eventViewModel.delete(eventRoomModel).invokeOnCompletion {
                            activity?.runOnUiThread {
                                val toast = Toast.makeText(context, "Event Deleted", Toast.LENGTH_SHORT)
                                val view = toast.view
                                val text = view.findViewById(android.R.id.message) as TextView
                                context?.let { context ->
                                    text.setTextColor(ContextCompat.getColor(context, R.color.white))
                                    view.background.setColorFilter(ContextCompat.getColor(context, R.color.toolbar_main_color), PorterDuff.Mode.SRC_IN)
                                }
                                toast.show()
                            }
                            findNavController().navigateUp()
                        }
                    }
                }
                .show()
        }
    }
}
