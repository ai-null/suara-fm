/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */

package com.github.ainul.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class PodcastDetail (
	@SerializedName("id") val id : String,
	@SerializedName("rss") val rss : String,
	@SerializedName("type") val type : String,
	@SerializedName("email") val email : String,
	@SerializedName("extra") val extra : Extra,
	@SerializedName("image") val image : String,
	@SerializedName("title") val title : String,
	@SerializedName("country") val country : String,
	@SerializedName("website") val website : String,
	@SerializedName("language") val language : String,
	@SerializedName("genre_ids") val genreIds : List<Int>,
	@SerializedName("itunes_id") val itunesId : Int,
	@SerializedName("publisher") val publisher : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("is_claimed") val isClaimed : Boolean,
	@SerializedName("description") val description : String,
	@SerializedName("listen_score") val listenScore : Int,
	@SerializedName("total_episodes") val totalEpisodes : Int,
	@SerializedName("listennotes_url") val listenNotesUrl : String,
	@SerializedName("explicit_content") val explicitContent : Boolean,
	@SerializedName("latest_pub_date_ms") val latestPubDateMs : Int,
	@SerializedName("earliest_pub_date_ms") val earliestPubDateMs : Int,
	@SerializedName("listen_score_global_rank") val listenScoreGlobalRank : String
)