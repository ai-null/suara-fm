package com.github.ainul.core.data.remote.model.reponse

import com.google.gson.annotations.SerializedName

data class JustListenResponse(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("thumbnail")
    val thumbnail: String? = null,

    @field:SerializedName("explicit_content")
    val explicitContent: Boolean? = null,

    @field:SerializedName("listennotes_edit_url")
    val listenNotesEditUrl: String? = null,

    @field:SerializedName("link")
    val link: String? = null,

    @field:SerializedName("audio_length_sec")
    val audioLengthSec: Int? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("listennotes_url")
    val listennotesUrl: String? = null,

    @field:SerializedName("guid_from_rss")
    val guidFromRss: String? = null,

    @field:SerializedName("podcast")
    val podcast: JustListenPodcast? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("audio")
    val audio: String? = null,

    @field:SerializedName("pub_date_ms")
    val pubDateMs: Long? = null,

    @field:SerializedName("maybe_audio_invalid")
    val maybeAudioInvalid: Boolean? = null
)

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
