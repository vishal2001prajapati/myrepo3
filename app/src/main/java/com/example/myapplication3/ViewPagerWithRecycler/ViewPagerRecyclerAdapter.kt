package com.example.myapplication3.ViewPagerWithRecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.item_viewpager.view.*

class ViewPagerRecyclerAdapter(private val context: Context, private val modelArrayList: ArrayList<ViewPagerModel>) : PagerAdapter() { override fun getCount(): Int {
        return modelArrayList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.item_viewpager, container, false)
       val model = modelArrayList[position]
        val titel = model.str
        val image = model.img
        view.text_viewpager.text = titel
        view.img_viewpager.setImageResource(image)

        view.setOnClickListener {
            Toast.makeText(context, "$titel", Toast.LENGTH_LONG).show()
        }
        container.addView(view, position)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}