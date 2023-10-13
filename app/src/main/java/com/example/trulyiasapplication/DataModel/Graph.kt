package com.example.trulyiasapplication.DataModel

data class Graph(
    val id: String,
    val type: String,
    val author: AuthorX?,
    val breadcrumb: Breadcrumb?,
    val dateModified: String?,
    val datePublished: String?,
    val description: String?,
    val image: Image?,
    val inLanguage: String?,
    val isPartOf: IsPartOf?,
    val itemListElement: List<ItemElement>?,
    val name: String?,
    val potentialAction: List<PotentialAction>?,
    val sameAs: List<String>?,
    val url: String?
)