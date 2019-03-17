package com.android.joshuamarotta.metronote.fragments


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.isSectionVisible
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.setActionBarTitle
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.setupActionBar
import com.android.joshuamarotta.metronote.adapters.EventsFragmentPagerAdapter
import com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate
import com.android.joshuamarotta.metronote.viewmodels.EventsFragmentViewModel

class EventsFragment : Fragment(), OnReselectedDelegate {

    private lateinit var eventsFragmentViewModel: EventsFragmentViewModel

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    private val viewPagerAdapter: EventsFragmentPagerAdapter by lazy { EventsFragmentPagerAdapter(childFragmentManager) }
    private var viewPagerTabOnLaunch = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater.inflate(R.layout.fragment_events, container, false)
        viewPager = rootView.findViewById(R.id.fragment_events_view_pager)
        viewPagerTabOnLaunch = getArgs()
        tabLayout = rootView.findViewById(R.id.fragment_events_tab_layout)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        tabLayout.apply {
            //tabMode = TabLayout.MODE_FIXED
            tabTextColors = context.getColorStateList(R.color.white)
            setupWithViewPager(viewPager, true)
        }

        viewPager.apply {
            adapter = viewPagerAdapter
            currentItem = viewPagerTabOnLaunch
            addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
                override fun onPageScrollStateChanged(p0: Int) { }

                override fun onPageScrolled(p0: Int, p1: Float, p2: Int) { }

                override fun onPageSelected(page: Int) {
                    val actionBarTitle = when (page) {
                        0 -> "Profile"
                        1 -> "Profile"
                        else -> "Profile"
                    }
                    setActionBarTitle(actionBarTitle)
                }
            })
        }

        eventsFragmentViewModel = ViewModelProviders.of(this).get(EventsFragmentViewModel::class.java)
        eventsFragmentViewModel.viewPagerFragments.observe(this, Observer { viewPagerFragments -> viewPagerAdapter.addFragments(viewPagerFragments) })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { if (isSectionVisible()) setupActionBar() }

    private fun setupActionBar() {
        val actionBarTitle = when(viewPager.currentItem) {
            0 -> "Performances"
            1 -> "Practices"
            else -> "TBD!"
        }
        setupActionBar(actionBarTitle, displayHome = true)
        (activity as? AppCompatActivity)?.supportActionBar?.elevation = 0f
    }

    override fun onReselected() = setupActionBar()

    override fun onPrepareOptionsMenu(menu: Menu?) {
        menu?.apply {
            findItem(R.id.menu_options_item_settings)?.isVisible = false
            findItem(R.id.menu_options_item_delete_event)?.isVisible = false
        }
    }

    private fun getArgs() = arguments?.let { EventsFragmentArgs.fromBundle(it).viewPagerTabToLaunch } ?: 0
}
