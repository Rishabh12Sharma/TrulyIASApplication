package com.example.trulyiasapplication.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trulyiasapplication.DataModel.QuestionDataModel
import com.example.trulyiasapplication.WebServices.APIClient
import com.example.trulyiasapplication.WebServices.APIInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class QuizViewModel : ViewModel() {

    val quizList = MutableLiveData<QuestionDataModel>()
    val errorMessage = MutableLiveData<String>()

    fun getAllData(){
        //retrofit
        val call = APIClient.client!!.create(APIInterface::class.java).fetchData()
        call.enqueue( object :Callback<QuestionDataModel>{
            override fun onResponse(
                call: Call<QuestionDataModel>,
                response: Response<QuestionDataModel>
            ) {
                quizList.postValue(response.body()!!)
            }

            override fun onFailure(call: Call<QuestionDataModel>, t: Throwable) {
                errorMessage.postValue("Error")
            }

        })
    }
}

