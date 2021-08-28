package com.github.ainul.suarafm.network

import com.github.ainul.suarafm.BuildConfig
import com.github.ainul.suarafm.network.interceptor.HttpInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

object RetrofitBuilder {
    val okHttp = OkHttpClient().newBuilder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(HttpInterceptor.httpLoggingInterceptor())
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
}