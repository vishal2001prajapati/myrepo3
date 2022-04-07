package com.example.myapplication3.apiwithrecyclerview

import com.google.gson.annotations.SerializedName

data class APIModelClass(
    val data: ArrayList<Data>,
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    val support: Support,
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
)

data class Data(
    val avatar: String = "",
    val email: String = "",
    @SerializedName("")
    val firstName: String = "first_name",
    val id: Int = 1,
    @SerializedName("last_name")
    val lastName: String = ""
)

data class Support(
    val text: String = "",
    val url: String = ""
)