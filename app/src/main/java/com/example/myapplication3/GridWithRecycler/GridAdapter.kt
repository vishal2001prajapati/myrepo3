package com.example.myapplication3.GridWithRecycler

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.R

class GridAdapter(val itemList: ArrayList<GridModel>) : RecyclerView.Adapter<GridAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_recycler, parent, false)
        return MyViewHolder(viewHolder)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            itemText.text = itemList[position].text
            itemImg.setImageResource(itemList[position].images)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemText: TextView = itemView.findViewById(R.id.grid_text)
        val itemImg: ImageView = itemView.findViewById(R.id.image_grid)
    }
}