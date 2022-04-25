package com.example.myapplication3.listuserwithretrofit

import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.LISTUSERBASEURL
import com.example.myapplication3.MAINURL
import com.example.myapplication3.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_retrofit_with_list_user.listUserRecyclerView
import kotlinx.android.synthetic.main.item_userlist_with_retrofit.listUserFirstNameText
import org.json.JSONArray
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitWithListUserActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit
    lateinit var list : List<Data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_with_list_user)
        retrofitObject()
        callAPI()
    }

    private fun callAPI() {
        val apiInterface = retrofit.create(UserListInterface::class.java).listOfUser()
        apiInterface.enqueue(object: Callback<UserListDataClass>{
            override fun onResponse(call: Call<UserListDataClass>, response: Response<UserListDataClass>) {
                response.body()?.userListData?.let {
                    list = it
                }
                val adapter = UserListRetrofitAdapter(list as ArrayList<Data>)
                listUserRecyclerView.adapter = adapter
            }

            override fun onFailure(call: Call<UserListDataClass>, t: Throwable) {
                Toast.makeText(this@RetrofitWithListUserActivity, "Response:$t", Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun retrofitObject(): Retrofit {
        retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(LISTUSERBASEURL).build()
        return retrofit
    }
}