package com.home.led.`fun`

import android.app.Application
import com.home.led.`fun`.di.component.ApplicationComponent
import dagger.internal.DaggerCollections

class LedApplication : Application() {

    private lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

    }
}