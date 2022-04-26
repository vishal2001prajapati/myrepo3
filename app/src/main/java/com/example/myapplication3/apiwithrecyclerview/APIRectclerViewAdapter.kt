package com.example.myapplication3.apiwithrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.R
import com.squareup.picasso.Picasso

class APIRectclerViewAdapter(var apiListItem: ArrayList<Data>): RecyclerView.Adapter<APIRectclerViewAdapter.APIViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): APIViewHolder {
        var viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_api_recyclerview, parent, false)
        return APIViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: APIViewHolder, position: Int) {
        var itemData = apiListItem[position]
        val element: Data = apiListItem[position]
        holder.apply {
            with(itemData){
                Picasso.get().load(element.avatar).into(holder.userAvatar)
                userFirstName.text = firstName
                userLastName.text = lastName
                userEmail.text = email
            }
        }
    }

    override fun getItemCount(): Int {
        return apiListItem.size
    }

    class APIViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var userAvatar: ImageView = itemView.findViewById(R.id.imgAvatar)
        var userFirstName: TextView = itemView.findViewById(R.id.firstName)
        var userLastName: TextView = itemView.findViewById(R.id.lastName)
        var userEmail: TextView = itemView.findViewById(R.id.apiEmail)
    }

     fun updateList(anotherArray: ArrayList<Data>) {
         apiListItem.addAll(anotherArray)
         notifyDataSetChanged()
     }
}