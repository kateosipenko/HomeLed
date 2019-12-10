package com.home.led.`fun`.di.component

import com.home.led.`fun`.LedApplication
import com.home.led.`fun`.di.module.ViewModelModule
import com.home.led.`fun`.di.module.DatabaseModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ViewModelModule::class, DatabaseModule::class])
interface ApplicationComponent {
    fun inject(app: LedApplication)
}
