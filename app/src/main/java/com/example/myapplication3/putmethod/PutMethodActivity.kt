package com.example.myapplication3.putmethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication3.BASEURLOFPUTMETHOD
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_put_method.apiUserJob
import kotlinx.android.synthetic.main.activity_put_method.apiUserName
import kotlinx.android.synthetic.main.activity_put_method.btnSubmit
import kotlinx.android.synthetic.main.activity_put_method.jobText
import kotlinx.android.synthetic.main.activity_put_method.nameText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PutMethodActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_put_method)
        putMethodObject()
        btnSubmit.setOnClickListener {
            apiCallPutMethod()
        }
    }

    private fun apiCallPutMethod() {
        val apiInterface = retrofit.create(PutMethodInterface::class.java).updateData(PutMethodDataClass(apiUserName.text.toString(), apiUserJob.text.toString()))
        apiInterface.enqueue(object : Callback<PutMethodDataClass> {
            override fun onResponse(call: Call<PutMethodDataClass>, response: Response<PutMethodDataClass>) {
                callData(response)
                println(response.code())
            }

            override fun onFailure(call: Call<PutMethodDataClass>, t: Throwable) {
                Toast.makeText(this@PutMethodActivity, "Response:$t", Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun callData(response: Response<PutMethodDataClass>) {
        val responseFromAPI: PutMethodDataClass? = response.body()
        nameText.text = responseFromAPI?.name
        jobText.text = responseFromAPI?.job
    }

    private fun putMethodObject(): Retrofit {
        retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASEURLOFPUTMETHOD).build()
        return retrofit
    }
}