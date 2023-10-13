package com.example.trulyiasapplication.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class QuizViewModelFactory:ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(QuizViewModel::class.java)){
            QuizViewModel() as T
        }else{
            throw IllegalAccessException("View Model Not Found")
        }
    }
}