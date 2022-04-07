package com.example.myapplication3.retrofit

import com.google.gson.annotations.SerializedName

data class RetrofitDataClass(
    @SerializedName("data")
    val userData: Data,
    val support: Support
)

data class Data(
    @SerializedName("avatar")
    val userImage: String,
    @SerializedName("email")
    val userEmail: String,
    @SerializedName("first_name")
    val retrofitFirstName: String,
    val id: Int,
    @SerializedName("last_name")
    val retrofitLastName: String
)

data class Support(
    val text: String,
    val url: String
)