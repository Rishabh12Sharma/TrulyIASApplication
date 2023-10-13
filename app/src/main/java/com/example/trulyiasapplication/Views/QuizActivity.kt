package com.example.trulyiasapplication.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.trulyiasapplication.R
import com.example.trulyiasapplication.ViewModel.QuizViewModel

class QuizActivity : AppCompatActivity() {
    lateinit var viewModel:QuizViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        viewModel=ViewModelProvider(this)[QuizViewModel::class.java]
        viewModel.getAllData()

        //observables
        viewModel.quizList.observe(this, Observer {quizList->
            if(quizList !=null){
                for(quiz in quizList)
                {
                    Log.d("QuizItem",quiz.toString())
                }

            }

        })
        viewModel.errorMessage.observe(this, Observer {message->
            Toast.makeText(this,message , Toast.LENGTH_SHORT).show()
        })

    }
}