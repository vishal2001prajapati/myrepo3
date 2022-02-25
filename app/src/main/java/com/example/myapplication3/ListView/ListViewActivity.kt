package com.example.myapplication3.ListView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ListView
import com.example.myapplication3.R

class ListViewActivity : AppCompatActivity() {

    val mainitem:  ArrayList<String> = arrayListOf("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9", "Item10")
    val subitem = arrayOf("SUBItem1", "SUBItem2", "SUBItem3", "SUBItem4", "SUBItem5", "SUBItem6", "SUBItem7", "SUBItem8", "SUBItem9", "SUBItem10")
    val image = arrayOf<Int>(R.drawable.bookmark, R.drawable.camera, R.drawable.bookmark, R.drawable.camera, R.drawable.bookmark, R.drawable.camera, R.drawable.bookmark, R.drawable.camera, R.drawable.bookmark, R.drawable.camera)
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val actionBar = supportActionBar
        actionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }
        listView = findViewById(R.id.list_view)
        listView.adapter = MyAdapter(applicationContext, mainitem, subitem, image)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}