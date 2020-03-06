package com.example.productfollowing

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.mancj.materialsearchbar.MaterialSearchBar


class HomeFragment: Fragment() {

    private val lastSearches: List<String>? = null
    private val searchBar: MaterialSearchBar? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)

        searchBar = view?.findViewById(R.id.searchBar) as MaterialSearchBar
    }

}