package com.example.myapplication3.ExpandableRecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.ConstrainLayout
import com.example.myapplication3.ListView.Model
import com.example.myapplication3.R

class ExpandableRecyclerViewAdapter(val modellist: List<ExpandableRecyclerModel>) : RecyclerView.Adapter<ExpandableRecyclerViewAdapter.MyviewHolder>() {

    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemTitle: TextView = itemView.findViewById(R.id.text_expandablerecycler)
        var itemDescription: TextView = itemView.findViewById(R.id.text_description)
        var constrainLayout: View? = itemView.findViewById(R.id.item_constrainlayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_expandablerecycler, parent, false)
        return MyviewHolder(view)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val model = modellist[position]
        holder.apply {
            itemTitle.text = model.name
            itemDescription.text = model.discription
            val isExpandable: Boolean = modellist[position].expandable
            itemDescription?.visibility = if (isExpandable) {
                View.GONE
            } else {
                View.VISIBLE
            }
            constrainLayout?.setOnClickListener {
                val dispaly = modellist[position]
                dispaly.expandable = !model.expandable
                notifyItemChanged(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return modellist.size
    }
}