package com.example.myapplication3.RecyclerView

import android.annotation.SuppressLint
import android.media.Image
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.item_recyclerview.view.*

class ItemAdapter(var itemList: ArrayList<RecycleModel>): RecyclerView.Adapter<ItemAdapter.MyviewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return MyviewHolder(viewHolder)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        itemList[position].images?.let { holder.itemimg.setImageResource(it) }
        holder.apply {
            itemtext.text = itemList[position].str_text
            itemcheck.apply {
                isChecked = itemList[position].chechbox
                setOnClickListener {
                    itemList[position].chechbox = !itemList[position].chechbox
                    notifyDataSetChanged()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun filterData(newItemList: ArrayList<RecycleModel>) {
        itemList = newItemList
        notifyDataSetChanged()
    }

    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemtext: TextView = itemView.findViewById(R.id.text_recycle)
        val itemimg: ImageView = itemView.findViewById(R.id.img_recycle)
        val itemcheck: CheckBox = itemView.findViewById(R.id.recycler_check)
    }
}