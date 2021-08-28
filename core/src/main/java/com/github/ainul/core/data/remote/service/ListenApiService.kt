package com.github.ainul.core.data.remote.service

import com.github.ainul.core.data.remote.model.reponse.SearchResponse
import com.github.ainul.core.utils.Endpoint
import retrofit2.http.GET
import retrofit2.http.Query

interface ListenApiService {
    @GET(Endpoint.Search.search)
    fun search(@Query(value = "q") keyword: String): SearchResponse
}