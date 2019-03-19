package com.android.joshuamarotta.metronote.activities

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.bottomnavigation.LabelVisibilityMode
import android.support.design.internal.NavigationMenu
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.FrameLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigator
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.fragments.CreateEventFragment
import com.android.joshuamarotta.metronote.fragments.DashboardFragment
import com.android.joshuamarotta.metronote.fragments.HomeFragment
import com.android.joshuamarotta.metronote.fragments.ProfileFragment
import com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate
import io.github.yavski.fabspeeddial.FabSpeedDial
import io.github.yavski.fabspeeddial.SimpleMenuListenerAdapter
import kotlinx.android.synthetic.main.activity_home.*
import android.support.v7.preference.PreferenceManager
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.HasSupportFragmentInjector
import shortbread.Shortcut
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), CreateEventFragment.CreateEventCallback {

    private var menu: Menu? = null
    private val sectionHomeWrapper: FrameLayout by lazy { section_home_wrapper }
    private val sectionDashboardWrapper: FrameLayout by lazy { section_dashboard_wrapper }
    private val sectionNotificationsWrapper: FrameLayout by lazy { section_notification_wrapper }

    private val navHomeController: NavController by lazy { findNavController(R.id.section_home) }
    private val navHomeFragment: Fragment by lazy { section_home }
    private val navDashboardController: NavController by lazy { findNavController(R.id.section_dashboard) }
    private val navDashboardFragment: Fragment by lazy { section_dashboard }
    private val navNotificationController: NavController by lazy { findNavController(R.id.section_notification) }
    private val navNotificationFragment: Fragment by lazy { section_notification }

    private var currentController: NavController? = null
    private var floatingActionButton: FabSpeedDial? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //TODO - set preference gathering in splash screen activity
        val SP = PreferenceManager.getDefaultSharedPreferences(baseContext)
        //val strUserName = SP.getBoolean("checkBoxPreference", "NA")

        currentController = navHomeController
        initBottomNavigationView()
        initAndHandleFloatingActionButton()
        sectionHomeWrapper.visibility = View.VISIBLE
        sectionDashboardWrapper.visibility = View.INVISIBLE
        sectionNotificationsWrapper.visibility = View.INVISIBLE
    }

    private fun initAndHandleFloatingActionButton() {
        floatingActionButton = home_activity_fab
        floatingActionButton?.bringToFront()
        floatingActionButton?.setMenuListener(object: SimpleMenuListenerAdapter() {
            override fun onPrepareMenu(navigationMenu: NavigationMenu?): Boolean {
                shadowView.visibility = View.VISIBLE
                return true
            }
            override fun onMenuClosed() { shadowView.visibility = GONE }


            override fun onMenuItemSelected(menuItem: MenuItem?): Boolean {
                when(menuItem?.itemId) {
                    R.id.fab_add_event -> {
                        return transactCreateEventFragment()
                    }
                    R.id.fab3 -> { return false }
                }
                return false
            }
        })
    }

    @Shortcut(id = "createEvent", icon = R.drawable.ic_add_black_24dp, shortLabel = "Create Event")
    fun transactCreateEventFragment(): Boolean {
        navHomeController.navigate(R.id.action_homeFragment_to_createEventFragment)
        closeAndHideFloatingActionButton()
        return false
    }

    private fun navigateUp() {
        if (currentController?.navigateUp() != true) {
            finish()
        }
    }

    //TODO - clean up backstack logic
    override fun onBackPressed() {
        if (currentController?.currentDestination?.id == R.id.createEventFragment) {
            val fragmentList = navHomeFragment.childFragmentManager.fragments
             if (fragmentList.size == 1) {
                 if (fragmentList[0] is CreateEventFragment) (fragmentList[0] as CreateEventFragment).onBackPressed()
             }
        }
        navigateUp()
       /* currentController?.let {
            if (it.popBackStack().not()){
                when (currentController?.currentDestination?.id) {
                    R.id.profileFragment, R.id.dashboardFragment -> bottom_navigation_view.selectedItemId = R.id.navigation_home
                    R.id.homeFragment -> finish()
                }
            } else {
                //finish()
            }
        }.or { finish() } */// may not be needed!
    }

    private fun onReselected(itemId: Int) {
        when (itemId) {
            R.id.navigation_home -> {
                val fragmentClassName = (navHomeController.currentDestination as FragmentNavigator.Destination).className
                navHomeFragment.childFragmentManager.fragments.asReversed().forEach {
                    if (it.javaClass.canonicalName == fragmentClassName && it is OnReselectedDelegate) {
                        //Handles tab logic
                        it.onReselected()
                        when (it) {
                            !is HomeFragment -> {
                                hideRootMenuItems()
                                closeAndHideFloatingActionButton()
                            }
                            else ->  {
                                showRootMenuItems()
                                closeAndShowFloatingActionButton()
                            }
                        }
                        return@forEach
                    }
                }
            }
            R.id.navigation_explore -> {
                val fragmentClassName = (navDashboardController.currentDestination as FragmentNavigator.Destination).className
                navDashboardFragment.childFragmentManager.fragments.asReversed().forEach {
                    if (it.javaClass.canonicalName == fragmentClassName && it is OnReselectedDelegate) {
                        //Handles tab logic
                        it.onReselected()
                        when (it) {
                            !is DashboardFragment -> hideRootMenuItems()
                            else -> showRootMenuItems()
                        }
                        return@forEach
                    }
                }
            }
            R.id.navigation_profile -> {
                val fragmentClassName = (navNotificationController.currentDestination as FragmentNavigator.Destination).className
                navNotificationFragment.childFragmentManager.fragments.asReversed().forEach {
                    if (it.javaClass.canonicalName == fragmentClassName && it is OnReselectedDelegate) {
                        //Handles tab logic
                        it.onReselected()
                        when (it) {
                            !is ProfileFragment -> hideRootMenuItems()
                            else -> showRootMenuItems()
                        }
                        return@forEach
                    }
                }
            }
        }
    }

    private fun hideRootMenuItems() { menu?.findItem(R.id.menu_options_item_settings)?.isVisible = false }

    private fun showRootMenuItems() { menu?.findItem(R.id.menu_options_item_settings)?.isVisible = true }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menu = menu
        menuInflater.inflate(R.menu.menu_home_fragment, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
            R.id.menu_options_item_settings -> {
                startActivity(Intent(this, PreferencesActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("RestrictedApi")
    private fun initBottomNavigationView() {
        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var returnValue = false

            when (item.itemId) {
                R.id.navigation_home -> {
                    handleHomeNavigationSelected()
                    returnValue = true
                }
                R.id.navigation_explore -> {
                    handleExploreNavigationSelected()
                    returnValue = true
                }
                R.id.navigation_profile -> {
                    handleProfileNavigationSelected()
                    returnValue = true
                }
            }
            onReselected(item.itemId)
            return@OnNavigationItemSelectedListener returnValue
        }

        bottom_navigation_view.apply {
            enableShiftingMode(false)
            enableItemShiftingMode(false)
            labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_SELECTED
            onNavigationItemSelectedListener = mOnNavigationItemSelectedListener
        }
    }

    private fun handleProfileNavigationSelected() {
        closeAndHideFloatingActionButton()
        currentController = navNotificationController
        sectionHomeWrapper.visibility = View.INVISIBLE
        sectionDashboardWrapper.visibility = View.INVISIBLE
        sectionNotificationsWrapper.visibility = VISIBLE
    }

    private fun handleExploreNavigationSelected() {
        closeAndHideFloatingActionButton()
        currentController = navDashboardController
        sectionHomeWrapper.visibility = View.INVISIBLE
        sectionDashboardWrapper.visibility = VISIBLE
        sectionNotificationsWrapper.visibility = View.INVISIBLE
    }

    private fun handleHomeNavigationSelected() {
        currentController = navHomeController
        sectionHomeWrapper.visibility = VISIBLE
        sectionDashboardWrapper.visibility = View.INVISIBLE
        sectionNotificationsWrapper.visibility = View.INVISIBLE
    }

    fun showFloatingActionButton() = closeAndShowFloatingActionButton()

    private fun closeAndShowFloatingActionButton() =
        floatingActionButton?.apply {
            if (isMenuOpen) closeMenu()
            if (visibility == GONE) visibility = VISIBLE
        }

    private fun closeAndHideFloatingActionButton() =
        floatingActionButton?.apply {
            if (isMenuOpen) closeMenu()
            if (visibility == VISIBLE) visibility = GONE
        }

    override fun displayFloatingActionButton() { closeAndShowFloatingActionButton() }
}
