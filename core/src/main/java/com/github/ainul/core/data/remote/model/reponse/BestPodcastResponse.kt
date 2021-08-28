/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */

package com.github.ainul.core.data.remote.model.reponse

import com.github.ainul.core.data.remote.model.PodcastDetail
import com.google.gson.annotations.SerializedName

data class BestPodcastResponse (
	@SerializedName("id") val id : Int,
	@SerializedName("name") val name : String,
	@SerializedName("total") val total : Int,
	@SerializedName("has_next") val hasNext : Boolean,
	@SerializedName("podcasts") val podcasts : List<PodcastDetail>,
	@SerializedName("parent_id") val parentId : Int,
	@SerializedName("page_number") val pageNumber : Int,
	@SerializedName("has_previous") val hasPrevious : Boolean,
	@SerializedName("listennotes_url") val listenNotesUrl : String,
	@SerializedName("next_page_number") val nextPageNumber : Int,
	@SerializedName("previous_page_number") val previousPageNumber : Int
)