package com.example.myapplication3.apicalling

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_api_main.*
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL

class ApiMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_main)
        btnSubmit.setOnClickListener {
            Toast.makeText(this, textEmail.text.toString(), Toast.LENGTH_LONG).show()
            Thread(Runnable {
                try {
                    sendPostRequest(textEmail.text.toString(), textPassword.text.toString())
                } catch (exception: Exception) {
                    exception.printStackTrace()
                }
            }).start()
        }
    }

    private fun sendPostRequest(email: String, password: String) {
        val cred = JSONObject()
        cred.apply {
            put("email", email)
            put("password", password)
        }

        val url = URL("https://reqres.in/api/login")
        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "POST"
            setRequestProperty("Content-Type", "application/json") // get and set ,
            val wr = OutputStreamWriter(outputStream)

            wr.apply {
               write(cred.toString())  // post data
               flush()
            }
            println("URL : $url")
            println("cred : $cred")
            println("Response Code is : $responseCode")
            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuffer()
                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                println("Response : $response")
            }
        }
    }
}