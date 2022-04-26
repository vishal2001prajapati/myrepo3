package com.example.myapplication3.apiwithrecyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication3.AVATAR
import com.example.myapplication3.EMAIL
import com.example.myapplication3.FIRSTNAME
import com.example.myapplication3.GET
import com.example.myapplication3.JSONDATA
import com.example.myapplication3.LASTNAME
import com.example.myapplication3.R
import com.example.myapplication3.URLOFAPI
import com.example.myapplication3.ZERO
import kotlinx.android.synthetic.main.activity_apiwith_recycler_view.apiRecyclerView
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class APIWithRecyclerViewActivity : AppCompatActivity() {

    var array = ArrayList<Data>()
    lateinit var adapter: APIRectclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apiwith_recycler_view)
        apiRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        adapter = APIRectclerViewAdapter(array)
        apiRecyclerView.adapter = adapter
        Thread(Runnable {
            try {
                getRequest()
            } catch (exception: Exception) {
                println(exception.printStackTrace())
            }
        }).start()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun getRequest() {
        val url = URL(URLOFAPI)
        with(url.openConnection() as HttpURLConnection) {
            val anotherArray = arrayListOf<Data>()
            requestMethod = GET
            println("URL is: $url")
            println("Response Code: $responseCode")
            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuffer()
                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                it.close()
                val jsonObj = JSONObject(response.toString())
                val jsonArray = jsonObj.getJSONArray(JSONDATA)
                for (position in ZERO until (jsonArray.length())) {
                    anotherArray.add(Data(email = jsonArray.getJSONObject(position).getString(EMAIL), firstName = jsonArray.getJSONObject(position).getString(FIRSTNAME), lastName = jsonArray.getJSONObject(position).getString(LASTNAME), avatar = jsonArray.getJSONObject(position).getString(AVATAR)))
                }
                adapter.updateList(anotherArray)
                println("Response : $response")
            }
        }
    }
}