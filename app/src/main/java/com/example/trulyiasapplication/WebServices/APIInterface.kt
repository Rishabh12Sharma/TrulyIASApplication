package com.example.trulyiasapplication.WebServices

import com.example.trulyiasapplication.DataModel.QuestionDataModel
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("wp-json/wp/v2/posts")
    fun fetchData(): Call<QuestionDataModel>
}

