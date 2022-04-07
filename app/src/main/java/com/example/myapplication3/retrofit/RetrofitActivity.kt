package com.example.myapplication3.retrofit

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.BASEURL
import com.example.myapplication3.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_retrofit.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit
    lateinit var email: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
        email = findViewById(R.id.apiEmail)
        getRetrofitObject()
        callingAPI()
    }

    private fun callingAPI() {
        val apiInterface = retrofit.create(ApiInterface::class.java).singleUser()
        apiInterface.enqueue(object : Callback<RetrofitDataClass> {
            override fun onResponse(call: Call<RetrofitDataClass>,response: Response<RetrofitDataClass>) {
                    response.body()?.userData?.let {
                        Picasso.get().load(it.userImage).into(apiImage)
                        apiFirstName.text = it.retrofitFirstName
                        apiLastName.text = it.retrofitLastName
                        apiEmail.text = it.userEmail
                    }
            }

            override fun onFailure(call: Call<RetrofitDataClass>, t: Throwable) {
                Toast.makeText(this@RetrofitActivity, "Response:$t", Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun getRetrofitObject(): Retrofit {
        retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASEURL).build()
        return retrofit
    }
}