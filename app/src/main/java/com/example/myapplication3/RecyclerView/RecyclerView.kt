package com.example.myapplication3.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.Menu
import android.view.MenuItem
import android.view.inputmethod.EditorInfo
import android.widget.ArrayAdapter
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_recycler_view.*
import java.util.*
import java.util.Collections.addAll
import java.util.Locale.filter
import java.util.Locale.getDefault
import kotlin.collections.ArrayList

class RecyclerView : AppCompatActivity() {
    lateinit var search: androidx.appcompat.widget.SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val actionBar = supportActionBar
        actionBar?.apply {
            title = getString(R.string.recyclerview)
            setDisplayHomeAsUpEnabled(true)
        }
        search = findViewById(R.id.searchInfo)

        val list = ArrayList<RecycleModel>()
        var adapter: ItemAdapter? = null
        list.apply {
            add(RecycleModel(R.drawable.bookmark, "Raj"))
            add(RecycleModel(R.drawable.camera, "Vinayak", false))
            add(RecycleModel(R.drawable.bookmark, "Darshan", false))
            add(RecycleModel(R.drawable.camera, "Pradip", false))
            add(RecycleModel(R.drawable.bookmark, "Shailesh", false))
            add(RecycleModel(R.drawable.camera, "Ram", false))
            add(RecycleModel(R.drawable.camera, "Vaibhav", false))
            add(RecycleModel(R.drawable.bookmark, "Parth", false))
            add(RecycleModel(R.drawable.camera, "Yash", false))
            add(RecycleModel(R.drawable.bookmark, "Dhruval", false))
            add(RecycleModel(R.drawable.camera, "Nitin", false))
            add(RecycleModel(R.drawable.bookmark, "Nayan", false))
            add(RecycleModel(R.drawable.camera, "Prathmesh", false))
        }
        adapter = ItemAdapter(list)
        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.adapter = adapter
        search.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query?.lowercase()?.isNotEmpty() == true) {
                    val newList = list.filter {
                        it.str_text?.lowercase()?.startsWith(query.toString()) == true
                    } as ArrayList<RecycleModel>
                    adapter.filterData(newList)
                } else {
                    adapter.filterData(list)
                }
               return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

               return  false
            }

        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}