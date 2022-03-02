package com.example.myapplication3.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val actionBar = supportActionBar
        actionBar?.apply {
            title = getString(R.string.relativelayout)
            setDisplayHomeAsUpEnabled(true)
        }
        val list = ArrayList<RecycleModel>()
        var adapter: ItemAdapter? = null
        list.apply {
            add(RecycleModel(R.drawable.bookmark, "Raj"))
            add(RecycleModel(R.drawable.camera, "Vinayak",false))
            add(RecycleModel(R.drawable.bookmark, "Darshan",false))
            add(RecycleModel(R.drawable.camera, "Pradip",false))
            add(RecycleModel(R.drawable.bookmark, "Shailesh",false))
            add(RecycleModel(R.drawable.camera, "Ram",false))
            add(RecycleModel(R.drawable.camera, "Vaibhav",false))
            add(RecycleModel(R.drawable.bookmark, "Parth",false))
            add(RecycleModel(R.drawable.camera, "Yash",false))
            add(RecycleModel(R.drawable.bookmark, "Dhruval",false))
            add(RecycleModel(R.drawable.camera, "Nitin",false))
            add(RecycleModel(R.drawable.bookmark, "Nayan",false))
            add(RecycleModel(R.drawable.camera, "Prathmesh",false))
        }
        adapter = ItemAdapter(list)
        recycler_view.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}