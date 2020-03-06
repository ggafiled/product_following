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
import com.ismaeldivita.chipnavigation.ChipNavigationBar


class HomeFragment: Fragment() {

    private val floating_search_view: FloatingSearchView? = null
    private var bottomNavigation: ChipNavigationBar? = null
    private lateinit var recyclerView: RecyclerView
    var mennuAdapter: HomeFragmentMenuAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
        val v: View = inflater.inflate(R.layout.activity_main, container, false)
        bottomNavigation = view?.findViewById(R.id.bottom_navigation)
        recyclerView = view!!.findViewById(R.id.recycler_view)
        floating_search_view = view?.findViewById(R.id.floating_search_view)
        floating_search_view?.setOnQueryChangeListener(OnQueryChangeListener { oldQuery, newQuery ->
            //get suggestions based on newQuery
            //pass them on to the search view
        })
        val menuList: ArrayList<MenuModel>
        menuList.add(MenuModel(0,"Devices1",R.id.action_home))
        menuList.add(MenuModel(1,"Devices2",R.id.action_home))
        menuList.add(MenuModel(2,"Devices3",R.id.action_home))
        menuList.add(MenuModel(3,"Devices4",R.id.action_home))
        menuList.add(MenuModel(4,"Devices5",R.id.action_home))
        menuList.add(MenuModel(5,"Devices6",R.id.action_home))
        menuList.add(MenuModel(6,"Devices7",R.id.action_home))
        menuList.add(MenuModel(7,"Devices8",R.id.action_home))
        menuList.add(MenuModel(8,"Devices9",R.id.action_home))

        mennuAdapter = HomeFragmentMenuAdapter(menuList)
        mennuAdapter?.notifyDataSetChanged()

        val llm = LinearLayoutManager(activity)
        llm.orientation = LinearLayoutManager.VERTICAL
        recyclerView.setLayoutManager(llm)
        recyclerView.adapter = mennuAdapter


    }

    override fun onResume() {
        super.onResume()
        bottomNavigation?.setItemSelected(R.id.action_home)
    }

    fun createMenuForGeneral(): ArrayList<MenuModel>? {
        var menuList: ArrayList<MenuModel>? = null
        menuList?.add(MenuModel(0,"Devices1",R.id.action_home))
        menuList?.add(MenuModel(1,"Devices2",R.id.action_home))
        menuList?.add(MenuModel(2,"Devices3",R.id.action_home))
        menuList?.add(MenuModel(3,"Devices4",R.id.action_home))
        menuList?.add(MenuModel(4,"Devices5",R.id.action_home))
        menuList?.add(MenuModel(5,"Devices6",R.id.action_home))
        menuList?.add(MenuModel(6,"Devices7",R.id.action_home))
        menuList?.add(MenuModel(7,"Devices8",R.id.action_home))
        menuList?.add(MenuModel(8,"Devices9",R.id.action_home))
        return menuList
    }

}