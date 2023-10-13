package com.example.trulyiasapplication.DataModel

data class Question(
    val subject:String,
    val title: String,
    val content: String,
    val option1:String,
    val option2:String,
    val option3:String,
    val option4:String,
    val correctAnswer: String
)
data class ContentResponse(
    val rendered: String
)
data class PostResponse(
    val id: Int,
    val content: ContentResponse
)