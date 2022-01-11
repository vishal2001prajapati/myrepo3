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

class ItemAdapter(val itemList: ArrayList<RecycleModel>) :
    RecyclerView.Adapter<ItemAdapter.MyviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val viewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return MyviewHolder(viewHolder)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

        holder.item_text.text = itemList[position].str_text
        itemList[position].images?.let { holder.item_img.setImageResource(it) }
        holder.item_check.isChecked = itemList[position].chechbox
        holder.item_check.setOnClickListener {
            itemList[position].chechbox = !itemList[position].chechbox
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val item_text: TextView = itemView.findViewById(R.id.text_recycle)
        val item_img: ImageView = itemView.findViewById(R.id.img_recycle)
        val item_check: CheckBox = itemView.findViewById(R.id.recycler_check)

    }
}