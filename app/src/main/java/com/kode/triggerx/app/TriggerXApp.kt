package com.kode.triggerx.app

import android.app.Application
import com.kode.triggerx.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TriggerXApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TriggerXApp)
            modules(
                appModule
            )
        }
    }
}