package com.example.trulyiasapplication.DataModel

data class Links(
    val about: List<About>,
    val author: List<Author>,
    val collection: List<Collection>,
    val curies: List<Cury>,
    val predecessorversion: List<PredecessorVersion>,
    val replies: List<Reply>,
    val self: List<Self>,
    val versionhistory: List<VersionHistory>,
    val wpattachment: List<WpAttachment>,
    val wpterm: List<WpTerm>
)