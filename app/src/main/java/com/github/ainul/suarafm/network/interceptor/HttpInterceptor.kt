package com.github.ainul.suarafm.network.interceptor

import android.util.Log
import com.github.ainul.suarafm.BuildConfig
import okhttp3.logging.HttpLoggingInterceptor

object HttpInterceptor {
    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
            override fun log(message: String) {
                Log.d("INTERCEPTOR", "okhttp $message")
            }
        }).apply {
            level = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else
                HttpLoggingInterceptor.Level.NONE
        }
    }
}