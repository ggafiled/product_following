package com.example.productfollowing

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlin.math.log

class HomeFragmentMenuAdapter(val menuList: ArrayList<MenuModel>): RecyclerView.Adapter<HomeFragmentMenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var _view = LayoutInflater.from(parent?.context).inflate(R.layout.home_item_recyclerview, parent,false)
        return ViewHolder(_view)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item: MenuModel = menuList[position]
        Log.e("HomeAdapter","item "+item.menu_name)
        holder?.txt_list_name?.text = item.menu_name
//        holder.img_list_icon.let {
//            Glide.with(it).load(item.icon_id).into(it)
//        }
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var txt_list_name: TextView = itemView.findViewById(R.id.txt_list_name)
        var img_list_icon: ImageView = itemView.findViewById(R.id.img_list_icon)
    }
}