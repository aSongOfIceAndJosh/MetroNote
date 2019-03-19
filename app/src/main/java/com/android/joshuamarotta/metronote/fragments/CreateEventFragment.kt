package com.android.joshuamarotta.metronote.fragments


import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.text.TextUtils
import android.text.format.DateUtils.formatDateTime
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.android.joshuamarotta.metronote.activities.HomeActivity
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.isSectionVisible
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.setupActionBar
import com.android.joshuamarotta.metronote.interfaces.OnBackPressedListener
import com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate
import com.android.joshuamarotta.metronote.models.EventRoomModel
import com.android.joshuamarotta.metronote.models.PerformanceEvent
import com.android.joshuamarotta.metronote.models.PracticeEvent
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_create_event.*
import kotlinx.android.synthetic.main.fragment_create_event.view.*
import shortbread.Shortcut
import java.text.SimpleDateFormat
import java.util.*

//@Shortcut(id = "test", icon = R.drawable.ic_create_event_location, shortLabel = "Add Event",  activity = HomeActivity::class)
class CreateEventFragment : Fragment(), OnReselectedDelegate, OnBackPressedListener {

    private val db = FirebaseFirestore.getInstance()
    private val mAuth = FirebaseAuth.getInstance()
    private val now = Calendar.getInstance()

    private lateinit var date: String
    private lateinit var time: String
    private lateinit var timeView: TextView
    private lateinit var dateView: TextView

    private var year = now.get(Calendar.YEAR)
    private var month = now.get(Calendar.MONTH)
    private var day = now.get(Calendar.DAY_OF_MONTH)
    private var hour = now.get(Calendar.HOUR_OF_DAY)
    private var minute = now.get(Calendar.MINUTE)

    private var createEventCallback: CreateEventCallback? = null

    override fun onPrepareOptionsMenu(menu: Menu?) {
        menu?.apply {
            findItem(R.id.menu_options_item_settings)?.isVisible = false
            findItem(R.id.menu_options_item_delete_event)?.isVisible = false
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_create_event, container, false)

        rootView.create_event_spinner.setItems(mutableListOf("Practice", "Performance"))
        initDialogDateTime()
        rootView.create_event_dialog_launcher.setOnClickListener { setupDialogLauncher()}
        rootView.create_event_add_button.setOnClickListener { evaluateAddClick() }

        this.setCreateEventActivityCallback((activity as HomeActivity))
        return rootView
    }

    override fun onDestroy() {
        super.onDestroy()
        this.setCreateEventActivityCallback(null)
    }

    override fun onBackPressed() { (activity as? HomeActivity)?.showFloatingActionButton() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { if (isSectionVisible()) setupActionBar() }

    private fun setupActionBar() = setupActionBar("Create Event", displayHome = true)

    override fun onReselected() = setupActionBar()

    private fun initDialogDateTime() {
        val df = SimpleDateFormat("MM/dd/yyyy")
        val tf = SimpleDateFormat("hh:mm a")
        date = df.format(Calendar.getInstance().time)
        time = tf.format(Calendar.getInstance().time)
    }

    private fun setupDialogLauncher() {
        val dialog = context?.let {
            MaterialDialog.Builder(it)
                .title("Set Schedule")
                .customView(R.layout.create_event_date_dialog_item, true)
                .positiveText("OK")
                .onPositive { _, _ -> /*xml launches appropriate click listeners for dialog*/ }
                .show()
        }

        dateView = dialog?.customView?.findViewById(R.id.create_event_date_view) as TextView
        timeView = dialog.customView?.findViewById(R.id.create_event_time_view) as TextView
        dateView.text = date
        timeView.text = time
        (dialog.customView?.findViewById(R.id.date_dialog_root) as ConstraintLayout).setOnClickListener { launchDatePicker() }
        (dialog.customView?.findViewById(R.id.time_dialog_root) as ConstraintLayout).setOnClickListener { launchTimePicker() }
    }

    private fun evaluateAddClick() {
        if (TextUtils.isEmpty(create_event_title_editText.text.trim()) && TextUtils.isEmpty(create_event_description_editText.text.trim())
                && TextUtils.isEmpty(create_event_location_editText.text.trim())){
            Toast.makeText(context, "Please enter a title, description, and location!", Toast.LENGTH_SHORT).show()
            return
        } else if (TextUtils.isEmpty(create_event_title_editText.text.trim()) && TextUtils.isEmpty(create_event_description_editText.text.trim())) {
            Toast.makeText(context, "Please enter a title and description!", Toast.LENGTH_SHORT).show()
            return
        } else if (TextUtils.isEmpty(create_event_title_editText.text.trim()) && TextUtils.isEmpty(create_event_location_editText.text.trim())) {
            Toast.makeText(context, "Please enter a title and location!", Toast.LENGTH_SHORT).show()
            return
        } else if (TextUtils.isEmpty(create_event_description_editText.text.trim()) && TextUtils.isEmpty(create_event_location_editText.text.trim())) {
            Toast.makeText(context, "Please enter a description and location!", Toast.LENGTH_SHORT).show()
            return
        }
        else {
            if (TextUtils.isEmpty(create_event_title_editText.text.trim())) {
                Toast.makeText(context, "Please enter a title!", Toast.LENGTH_SHORT).show()
                return
            }
            if (TextUtils.isEmpty(create_event_description_editText.text.trim())) {
                Toast.makeText(context, "Please enter a description!", Toast.LENGTH_SHORT).show()
                return
            }
            if (TextUtils.isEmpty(create_event_location_editText.text.trim())) {
                Toast.makeText(context, "Please enter a location!", Toast.LENGTH_SHORT).show()
                return
            }
        }
        pushEventToDatabase()
    }

    private fun pushEventToDatabase() {
        //TODO - when the time comes, push event to firebase for following friends and seeing their stuff!
        fun addEventToRoomDatabase(eventRoomModel: EventRoomModel) {
            val eventVieModel = ViewModelProviders.of(this).get(EventViewModel::class.java)
            eventVieModel.insert(eventRoomModel)
            dismissSoftKeyboard()
            createEventCallback?.displayFloatingActionButton()
            findNavController().navigateUp()
        }

        fun pushPracticeToFirebase(practiceEvent: PracticeEvent) {
            db.collection("users").document(mAuth.currentUser!!.uid).collection("practiceEvents").add(practiceEvent)
                    .addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(context, "Practice Saved!", Toast.LENGTH_LONG).show()
                        } else {
                            Toast.makeText(context, "Error Saving Practice!", Toast.LENGTH_LONG).show()

                        }
                    }
        }

        fun pushPerformanceToFirebase(performanceEvent: PerformanceEvent) {
            db.collection("users").document(mAuth.currentUser!!.uid).collection("performanceEvents").add(performanceEvent)
                    .addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(context, "Performance Saved!", Toast.LENGTH_LONG).show()
                        } else {
                            Toast.makeText(context, "Error Saving Performance!", Toast.LENGTH_LONG).show()

                        }
                    }
        }

        val title = create_event_title_editText.text.trim().toString()
        val description = create_event_description_editText.text.trim().toString()
        val location = create_event_location_editText.text.trim().toString()
        val eventType = create_event_spinner.text.toString()
        val timeStamp = SimpleDateFormat().parse("$date $time")
        val dateTime = formatDateTime()

        if (eventType == "Practice") {
            //pushPracticeToFirebase(PracticeEvent(title, description, location, eventType, timeStamp))
        } else {
            //pushPerformanceToFirebase(PerformanceEvent(title, description, location, eventType, timeStamp))
        }
        addEventToRoomDatabase(EventRoomModel(title = title,
            description =  description,
            location = location,
            eventType = eventType,
            dateTime = dateTime))
    }

    private fun formatDateTime(): Date {
        /*val datePattern = "MM/dd/yyyy"
        var simpleDateFormat = SimpleDateFormat(datePattern)
        val date = simpleDateFormat.parse(date)

        val timePattern = "HH:mm a"
        simpleDateFormat = SimpleDateFormat(timePattern)
        val time = simpleDateFormat.parse(time)*/


        val simpleDateFormat = SimpleDateFormat("MM/dd/yyyy HH:mm a")
        return simpleDateFormat.parse("$date $time")
        //return simpleDateFormat.parse("$date $time")
    }

    private fun launchDatePicker() {
        var monthFinal = month.toString()
        var dayFinal: String
        val datePicker = context?.let {
            DatePickerDialog(it, DatePickerDialog.OnDateSetListener { _, y, m, d ->
                year = y
                month = m
                day = d
                val mReformatted = m + 1
                if (mReformatted < 10) monthFinal = "0$mReformatted"
                dayFinal = if (d < 10) "0$d" else "$d"
                date = "$monthFinal/$dayFinal/$y"
                dateView.text = date
            }
                , year, month, day)
        }
        datePicker?.show()
    }

    private fun launchTimePicker() {
        val timePicker = TimePickerDialog(context, TimePickerDialog.OnTimeSetListener { _, h, m ->
            hour = h
            minute = m
            time = computeHour(h, m)
            timeView.text = time
        }
                , hour, minute, false)
        timePicker.show()
    }

    private fun computeHour(hour: Int, xMinute: Int) : String {
        var amOrPm = "AM"
        var actualHour = hour
        val minute = if (xMinute < 10) "0$xMinute" else "$xMinute"
        if (hour > 12) {
            actualHour = hour - 12
            amOrPm = "PM"
            if (actualHour < 10) return "0$actualHour:$minute $amOrPm"
        }
        if (hour < 10) return "0$actualHour:$minute $amOrPm"
        return "$actualHour:$minute $amOrPm"
    }

    private fun dismissSoftKeyboard() {
        val inputManager = (activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager)
        inputManager?.hideSoftInputFromWindow(activity?.currentFocus?.windowToken, 0)
    }

    interface CreateEventCallback {
        fun displayFloatingActionButton()
    }

    fun setCreateEventActivityCallback(createEventCallback: CreateEventCallback?) { this.createEventCallback = createEventCallback }
}
