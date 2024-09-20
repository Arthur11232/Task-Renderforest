package com.alexandryan.userinfo.presentation.base

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alexandryan.userinfo.data.exceptions.ExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.coroutines.cancellation.CancellationException

abstract class BaseViewModel: ViewModel() {
    @Inject
    lateinit var exceptionHandler: ExceptionHandler

    protected fun <T> launchInIO(
        block: suspend CoroutineScope.() -> T): Job {
        return viewModelScope.launch {
            withIOContext(block)
        }
    }

    private suspend fun <T> withIOContext(
        block: suspend CoroutineScope.() -> T,
    ) {
        try {
            withContext(Dispatchers.IO, block)
        } catch (exception: Exception) {
            Log.v("Response exeption", exception.message.toString())
            if (exception !is CancellationException) {
                onError(exception)
            }
        }
    }

    private fun onError(exception: Exception) {
        exceptionHandler.handleException(exception)
    }
}