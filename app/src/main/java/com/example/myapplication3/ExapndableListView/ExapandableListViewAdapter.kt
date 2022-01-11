package com.example.myapplication3.ExapndableListView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import com.example.myapplication3.R

class ExpandableListViewAdapter(
    var context: Context,
    var header: MutableList<String>,
    var body: MutableList<MutableList<String>>
) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return header.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return body[p0].size
    }

    override fun getGroup(position: Int): String {
        return header[position]
    }

    override fun getChild(p0: Int, p1: Int): String {
        return this.body[p0][p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View? {
        (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(
            R.layout.layout_group,
            null
        ).apply {
            val title = this.findViewById<TextView>(R.id.text_season)
            title?.text = getGroup(p0)
            return this
        }
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View? {
        (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(
            R.layout.layout_child,
            null
        ).apply {
            val title = this.findViewById<TextView>(R.id.text_child)
            title?.text = getChild(p0, p1)
            return this
        }

    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }
}