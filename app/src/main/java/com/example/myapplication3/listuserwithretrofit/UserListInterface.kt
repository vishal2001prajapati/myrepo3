package com.example.myapplication3.listuserwithretrofit

import android.telecom.Call
import com.example.myapplication3.MAINURL
import retrofit2.http.GET

interface UserListInterface {
    @GET(MAINURL)
    fun listOfUser(): retrofit2.Call<UserListDataClass>
}