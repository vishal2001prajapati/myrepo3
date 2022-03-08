package com.example.myapplication3.ViewPagerWithRecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.example.myapplication3.R

class ViewPagerRecyclerAdapter(private val context: Context, private val modelArrayList: ArrayList<ViewPagerModel>) : PagerAdapter() {

    override fun getCount(): Int {
        return modelArrayList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.item_viewpager, container, false)
        val textView: TextView = view.findViewById(R.id.text_viewpager)
        val imageView: ImageView = view.findViewById(R.id.img_viewpager)
        textView.text = modelArrayList[position].str
        imageView.setImageResource(modelArrayList[position].img)
        view.setOnClickListener {
            Toast.makeText(context, "$modelArrayList[position].str", Toast.LENGTH_LONG).show()
        }
        container.addView(view, position)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}