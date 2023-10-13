package com.example.trulyiasapplication.DataModel

data class PotentialAction(
    val type: String,
    val queryinput: String?,
    val target: List<String>
)