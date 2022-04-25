package com.example.myapplication3.listuserwithretrofit

import com.google.gson.annotations.SerializedName

data class UserListDataClass(
    @SerializedName("data")
    val userListData: List<Data>,
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    val support: Support,
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int
)

data class Data(
    @SerializedName("avatar")
    val imageUrl: String,
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    val id: Int,
    @SerializedName("last_name")
    val lastName: String
)

data class Support(
    val text: String,
    val url: String
)