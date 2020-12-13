package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

// Custom application class used in all the app

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}