package com.example.myapplication3.ExapndableListView

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ExpandableListView
import com.example.myapplication3.R
import java.util.*

class ExpandableListViewActivity : AppCompatActivity() {

  private  val header: MutableList<String> = ArrayList()
  private  val body: MutableList<MutableList<String>> = ArrayList()
    lateinit var expandableListView: ExpandableListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_list_view)
        expandableListView = findViewById(R.id.expandable_view)
        title = getString(R.string.state)
        val gujarat: ArrayList<String> = ArrayList()
        gujarat.apply {
            add("Bhavnagar")
            add("Ahmedabad")
            add("Gandhinagar")
            add("Jamnagar")
        }
        val rajasthan: MutableList<String> = ArrayList()
        rajasthan.apply {
            add("Jaypur")
            add("Jalor")
            add("Kota")
            add("Udaypur")
        }
        val maharashtra: MutableList<String> = ArrayList()
        maharashtra.apply {
            add("Nagpur")
            add("Thane")
            add("Solapur")
            add("Pune")
        }
        val punjab: MutableList<String> = ArrayList()
        punjab.apply {
            add("Ludhiana")
            add("Amritsar")
            add("Patiala")
        }
        header.apply {
            add("Gujarat")
            add("Rajasthan")
            add("Maharashtra")
            add("Punjab")
        }
        body.apply {
            add(gujarat)
            add(rajasthan)
            add(maharashtra)
            add(punjab)
        }
        val adapter = ExpandableListViewAdapter(this, header, body)
        expandableListView.setAdapter(adapter)
    }
}