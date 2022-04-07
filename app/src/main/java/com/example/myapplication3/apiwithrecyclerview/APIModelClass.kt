package com.example.myapplication3.apiwithrecyclerview

import com.google.gson.annotations.SerializedName

data class APIModelClass(
    val data: ArrayList<Data>,
    val page: Int,
    val per_page: Int,
    val support: Support,
    val total: Int,
    val total_pages: Int,
)

data class Data(
    val avatar: String = "",
    val email: String = "",
    @SerializedName("first_name")
    val firstName: String = "",
    val id: Int = 1,
    @SerializedName("last_name")
    val lastName: String = ""
)

data class Support(
    val text: String = "",
    val url: String = ""
)