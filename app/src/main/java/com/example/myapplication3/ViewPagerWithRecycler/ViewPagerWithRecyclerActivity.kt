package com.example.myapplication3.ViewPagerWithRecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
//import com.example.myapplication3.ListView.MyAdapter
import com.example.myapplication3.R

class ViewPagerWithRecyclerActivity : AppCompatActivity() {
   private lateinit var myModelList: ArrayList<ViewPagerModel>
//   private lateinit var myAdapter: MyAdapter
   private lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_with_recycler)
        viewPager = findViewById(R.id.viewpager_recycler)

        show()

    }

    private fun show() {
        myModelList = ArrayList()
        myModelList.apply {
            add(ViewPagerModel("Antim", R.drawable.antim))
            add(ViewPagerModel("Keshri", R.drawable.keshri))
            add(ViewPagerModel("K.G.F", R.drawable.kgf))
            add(ViewPagerModel("3 idiots", R.drawable.idoits))
           add(ViewPagerModel("Shershah", R.drawable.shershah))
//            add(ViewPagerModel("tanhaji the unsung warrior", R.drawable.tanhaji))
//            add(ViewPagerModel("Tiger Zinda Hai", R.drawable.tiger))
        }

       val adapter = ViewPagerRecyclerAdapter(this,myModelList)
        viewPager.adapter = adapter
        viewPager.setPadding(100,0,0,0)


    }
}