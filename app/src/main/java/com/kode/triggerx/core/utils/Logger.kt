package com.kode.triggerx.core.utils

import android.util.Log
import com.kode.triggerx.core.constants.AppConstants

object Logger {

    fun d(message: String) {
        Log.d(AppConstants.LOG_TAG, message)
    }

    fun e(message: String) {
        Log.e(AppConstants.LOG_TAG, message)
    }
}