package com.example.productfollowing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arlib.floatingsearchview.FloatingSearchView
import com.arlib.floatingsearchview.FloatingSearchView.OnQueryChangeListener
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion
import com.ismaeldivita.chipnavigation.ChipNavigationBar


class HomeFragment: Fragment() {

    private val floating_search_view: FloatingSearchView? = null
    private var bottomNavigation: ChipNavigationBar? = null
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
//        val v: View = inflater.inflate(R.layout.activity_main, container, false)
//        bottomNavigation = view?.findViewById(R.id.bottom_navigation)
//        recyclerView = view!!.findViewById(R.id.my_recycler_view)
//        recyclerView.layoutManager = LinearLayoutManager(context)
//        floating_search_view = view?.findViewById(R.id.floating_search_view)
//        floating_search_view?.setOnQueryChangeListener(OnQueryChangeListener { oldQuery, newQuery ->
//            //get suggestions based on newQuery
//            //pass them on to the search view
//        })
    }

//    override fun onResume() {
//        super.onResume()
//        bottomNavigation?.setItemSelected(R.id.action_home)
//    }

}