package com.example.myapplication3.GridWithRecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.R

class GridWithRecycler : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    var arrayLis: ArrayList<GridModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_with_recycler)
        val actionBar = supportActionBar
        actionBar?.title = "Grid Using Recycler"
        actionBar?.setDisplayHomeAsUpEnabled(true)
        recyclerView = findViewById(R.id.grid_recycler)
        arrayLis.apply {
            add(GridModel("Antim", R.drawable.antim))
            add(GridModel("Chichore", R.drawable.chichore))
            add(GridModel("Keshri", R.drawable.keshri))
            add(GridModel("3idoit's", R.drawable.idoits))
            add(GridModel("Shershah", R.drawable.shershah))
            add(GridModel("Tiger Zinda Hai", R.drawable.tiger))
            add(GridModel("K.G.F.", R.drawable.kgf))
            add(GridModel("Tiger Zinda Hai", R.drawable.tiger))
            add(GridModel("Tanhaji", R.drawable.tanhaji))
            add(GridModel("Once Upon Time in Mumbai", R.drawable.time))
        }
        val adpter = GridAdapter(arrayLis)
        val layoutManager = GridLayoutManager(this, 3)
        recyclerView.apply {
            this.layoutManager = layoutManager
            this.itemAnimator = DefaultItemAnimator()
            this.adapter = adpter
        }

        recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                GridLayoutManager.VERTICAL
            )
        )
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}
