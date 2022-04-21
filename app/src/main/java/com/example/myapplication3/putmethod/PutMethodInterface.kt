package com.example.myapplication3.putmethod

import com.example.myapplication3.MAINURLOFAPI
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.PUT

interface PutMethodInterface {
    @PUT(MAINURLOFAPI)
    fun updateData(@Body putMethodDataClass: PutMethodDataClass): Call<PutMethodDataClass>
}