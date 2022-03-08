package com.example.myapplication3.ExpandableRecyclerView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.R

class ExpandableRecyclerViewActivity : AppCompatActivity() {

    var modelList = ArrayList<ExpandableRecyclerModel>()
    lateinit var recycler_viewofexpandable: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_recycler_view)
        recycler_viewofexpandable = findViewById(R.id.recycler_viewofexpandable)
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