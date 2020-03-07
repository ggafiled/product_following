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

    private var floating_search_view: FloatingSearchView? = null
    private var bottomNavigation: ChipNavigationBar? = null
    private lateinit var recyclerView: RecyclerView
    var mennuAdapter: HomeFragmentMenuAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottomNavigation = view?.findViewById(R.id.bottom_navigation)
        floating_search_view = view?.findViewById(R.id.floating_search_view)
        floating_search_view?.setOnQueryChangeListener(OnQueryChangeListener { oldQuery, newQuery ->
            //get suggestions based on newQuery
            //pass them on to the search view
        })
        var menuList: ArrayList<MenuModel> = arrayListOf()
        menuList.add(MenuModel(0,"เพิ่มรายการอุปกรณ์",R.drawable.add))
        menuList.add(MenuModel(1,"อุปกรณ์",R.drawable.devices))
        menuList.add(MenuModel(2,"รายการรออนุมัติ",R.drawable.order_list))
        menuList.add(MenuModel(3,"ตรวจสอบ",R.drawable.audit))
        menuList.add(MenuModel(4,"โอนรายการยืม",R.drawable.transfer))
        menuList.add(MenuModel(5,"คืนอุปกรณ์",R.drawable.return_devices))
        menuList.add(MenuModel(6,"รายการขอเบิก",R.drawable.request))
        menuList.add(MenuModel(7,"แจ้งซ่อม",R.drawable.fix))
        menuList.add(MenuModel(8,"จำหน่ายอุปกรณ์ออก",R.drawable.release))

        recyclerView = view!!.findViewById(R.id.recycler_view)
        val manager = LinearLayoutManager(context)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(true)
        mennuAdapter = HomeFragmentMenuAdapter(menuList!!)
        recyclerView.adapter = mennuAdapter
    }

    override fun onResume() {
        super.onResume()
        bottomNavigation?.setItemSelected(R.id.action_home)
    }

}