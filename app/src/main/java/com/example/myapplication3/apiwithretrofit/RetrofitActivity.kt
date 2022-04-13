package com.example.myapplication3.apiwithretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication3.R
import retrofit2.Retrofit

class RetrofitActivity : AppCompatActivity() {

   private lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retofit)

    }
    private fun getRetrofit(): Retrofit {
        retrofit = Retrofit.Builder().baseUrl("https://reqres.in/").build()


        return  retrofit
    }
}