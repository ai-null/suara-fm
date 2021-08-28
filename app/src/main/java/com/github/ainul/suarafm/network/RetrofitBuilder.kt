package com.github.ainul.suarafm.network

import com.github.ainul.core.data.remote.service.ListenApiService
import com.github.ainul.suarafm.BuildConfig
import com.github.ainul.suarafm.network.interceptor.AuthInterceptor
import com.github.ainul.suarafm.network.interceptor.HttpInterceptor
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitBuilder {
    private val okHttp = OkHttpClient().newBuilder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(HttpInterceptor.httpLoggingInterceptor())
        .addInterceptor(AuthInterceptor())
        .build()

    private val gson = GsonBuilder().create()

    fun create(): ListenApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttp)
            .build()

        return retrofit.create(ListenApiService::class.java)
    }
}