package com.example.myapplication3.ExpandableRecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_expandable_recycler_view.*

class ExpandableRecyclerViewActivity : AppCompatActivity() {

    var modelList = ArrayList<ExpandableRecyclerModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_recycler_view)
        showData()
        val adapter = ExpandableRecyclerViewAdapter(modelList)
        recycler_viewofexpandable.adapter = adapter
    }

    private fun showData() {
        modelList.apply {
            add(ExpandableRecyclerModel("C", getString(R.string.language_c)))
            add(ExpandableRecyclerModel("Java", getString(R.string.language_java)))
            add(ExpandableRecyclerModel("Kotlin", getString(R.string.language_kotlin)))
            add(ExpandableRecyclerModel("Python", getString(R.string.language_python)))
        }
    }
}