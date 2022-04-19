package com.example.myapplication3.retrofit


import com.example.myapplication3.MAINURL
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
   @GET(MAINURL)
    fun singleUser(): Call<RetrofitDataClass>
}