package com.mo22sen.batmanmovies.utils

import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.network.Result
import com.mo22sen.batmanmovies.utils.ktx.logE
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun <T : Any> safeApiCall(
    call: suspend () -> Result<T>
): Result<T> {
    return withContext(Dispatchers.Main) {
        try {
            withContext(Dispatchers.IO) {
                call()
            }
        } catch (e: Exception) {
            logE(e)
            Result.Error(R.string.app_name, 0)
        }
    }
}
