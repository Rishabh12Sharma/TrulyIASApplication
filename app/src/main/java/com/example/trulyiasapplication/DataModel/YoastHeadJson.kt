package com.example.trulyiasapplication.DataModel

data class YoastHeadJson(
    val article_modified_time: String?,
    val article_published_time: String,
    val article_publisher: String,
    val author: String,
    val canonical: String,
    val og_description: String,
    val og_image: List<OgImage>?,
    val og_locale: String,
    val og_site_name: String,
    val og_title: String,
    val og_type: String,
    val og_url: String,
    val robots: Robots,
    val schema: Schema,
    val title: String,
    val twitter_misc: TwitterMisc
)