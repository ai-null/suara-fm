package com.github.ainul.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class JustListenPodcast(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("thumbnail")
    val thumbnail: String? = null,

    @field:SerializedName("listen_score_global_rank")
    val listenScoreGlobalRank: Any? = null,

    @field:SerializedName("listen_score")
    val listenScore: Any? = null,

    @field:SerializedName("publisher")
    val publisher: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("listennotes_url")
    val listenNotesUrl: String? = null
)