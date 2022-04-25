package com.example.myapplication3.listuserwithretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.R
import com.squareup.picasso.Picasso

class UserListRetrofitAdapter(val userListData:ArrayList<Data>): RecyclerView.Adapter<UserListRetrofitAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_userlist_with_retrofit, parent, false)
        return MyViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            Picasso.get().load(userListData[position].imageUrl).into(userImage)
            userFirstName.text = userListData[position].firstName
            userLastName.text = userListData[position].lastName
            userEmailId.text = userListData[position].email
        }
    }

    override fun getItemCount(): Int {
       return userListData.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val userImage: ImageView = itemView.findViewById(R.id.listUserImage)
        val userFirstName: TextView = itemView.findViewById(R.id.listUserFirstNameText)
        val userLastName: TextView = itemView.findViewById(R.id.listUserLatNameText)
        val userEmailId: TextView = itemView.findViewById(R.id.UserEmailText)
    }
}