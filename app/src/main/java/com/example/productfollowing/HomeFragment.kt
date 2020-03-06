package com.example.productfollowing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arlib.floatingsearchview.FloatingSearchView
import com.arlib.floatingsearchview.FloatingSearchView.OnQueryChangeListener
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion
import com.ismaeldivita.chipnavigation.ChipNavigationBar


class HomeFragment: Fragment() {

    private val floating_search_view: FloatingSearchView? = null
    private var bottomNavigation: ChipNavigationBar? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
        bottomNavigation = view?.findViewById(R.id.bottom_navigation)
        floating_search_view = view?.findViewById(R.id.floating_search_view)
        floating_search_view?.setOnQueryChangeListener(OnQueryChangeListener { oldQuery, newQuery ->
            //get suggestions based on newQuery
            //pass them on to the search view
        })
    }

    override fun onResume() {
        super.onResume()
        bottomNavigation?.setItemSelected(R.id.action_home)
    }

}