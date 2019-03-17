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
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.isSectionVisible
import com.android.joshuamarotta.metronote.Utils.KotlinUtils.setupActionBar
import com.android.joshuamarotta.metronote.adapters.ProfileFragmentBottomListAdapter
import com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate
import com.android.joshuamarotta.metronote.viewmodels.ProfileViewModel
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment(), OnReselectedDelegate {

    private lateinit var storage: FirebaseStorage
    private lateinit var profileFragmentViewModel: ProfileViewModel
    private lateinit var rootView: View
    private lateinit var recyclerView: RecyclerView
    private var adapter: ProfileFragmentBottomListAdapter? = null

    private val profileFragmentClickFunction: (Int) -> Unit = {
        val bundle = Bundle()
        bundle.putInt("viewPagerTabToLaunch", it)
        findNavController().navigate(R.id.action_profileFragment_to_eventsFragment, bundle)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        storage = FirebaseStorage.getInstance()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_profile, container, false)
        recyclerView = rootView.profile_fragment_event_horizontal_recycler_view
        adapter = context?.let { ProfileFragmentBottomListAdapter(it, profileFragmentClickFunction) }
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        profileFragmentViewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        profileFragmentViewModel.bigThreeProperties.observe(
            this,
            Observer { bigThreeProperties -> bigThreeProperties?.let { adapter?.setBigThreeProperties(it) } })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (isSectionVisible()) setupActionBar()
    }

    private fun setupActionBar() = setupActionBar(getString(R.string.title_profile_fragment))

    override fun onReselected() = setupActionBar()
}