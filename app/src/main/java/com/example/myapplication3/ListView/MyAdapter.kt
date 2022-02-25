package com.example.myapplication3.ListView

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.myapplication3.R
import com.example.myapplication3.ZERO

class MyAdapter(var mCtx: Context, var items: ArrayList<String>, var subItems: Array<String>, var images: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return items.count()
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return ZERO.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(R.layout.item_list, parent,false)
        val image: ImageView = view.findViewById(R.id.list_img)
        val textmain: TextView = view.findViewById(R.id.list_text)
        val textsub: TextView = view.findViewById(R.id.list_text2)
        textmain.setText(items[position])
        image.setImageResource(images[position])
        textsub.setText(subItems[position])
        return view
    }
}