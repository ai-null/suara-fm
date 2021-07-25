/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */

package com.github.ainul.suarafm.data.model

import com.google.gson.annotations.SerializedName

data class Extra (
	@SerializedName("url1") val url1 : String,
	@SerializedName("url2") val url2 : String,
	@SerializedName("url3") val url3 : String,
	@SerializedName("google_url") val googleUrl : String,
	@SerializedName("spotify_url") val spotifyUrl : String,
	@SerializedName("youtube_url") val youtubeUrl : String,
	@SerializedName("linkedin_url") val linkedinUrl : String,
	@SerializedName("wechat_handle") val wechatHandle : String,
	@SerializedName("patreon_handle") val patreonHandle : String,
	@SerializedName("twitter_handle") val twitterHandle : String,
	@SerializedName("facebook_handle") val facebookHandle : String,
	@SerializedName("instagram_handle") val instagramHandle : String
)