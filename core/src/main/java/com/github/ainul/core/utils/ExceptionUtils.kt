package com.github.ainul.core.utils

import java.io.IOException
import java.net.SocketTimeoutException

object ExceptionUtils {
    const val CONNECTION_TIMEOUT_MSG = "Connection timeout"
    const val NO_INTERNET_CONNECTION_MSG = "No internet connection"
    const val UNEXPECTED_ERROR_MSG = "An unexpected error occurred"
    const val UNKNOWN_ERROR_RESPONSE_MSG = "Unknown error response"
    const val NETWORK_CALL_CANCELED_MSG = "Call was cancelled forcefully"

    fun checkExceptionMessage(t: Throwable?): String {
        return when (t) {
            is NoInternetConnection -> NO_INTERNET_CONNECTION_MSG
            is SocketTimeoutException -> CONNECTION_TIMEOUT_MSG
            else -> UNEXPECTED_ERROR_MSG
        }
    }

    class NoInternetConnection : IOException(NO_INTERNET_CONNECTION_MSG)
}