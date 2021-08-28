package com.github.ainul.suarafm.network.interceptor

import com.github.ainul.core.utils.Endpoint
import com.github.ainul.suarafm.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .header(Endpoint.header, BuildConfig.LISTEN_KEY)
            .build()

        return chain.proceed(request)
    }
}