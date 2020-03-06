package com.example.productfollowing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class ActivitiesFragment: Fragment() {

    private var bottomNavigation: ChipNavigationBar? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_activities,container,false)
        bottomNavigation = view?.findViewById(R.id.bottom_navigation)
    }

    override fun onResume() {
        super.onResume()
        bottomNavigation?.setItemSelected(R.id.action_activity)
    }
}