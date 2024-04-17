package com.stfalcon.weather

import android.app.Application
import com.stfalcon.weather.di.AppComponent
import com.stfalcon.weather.di.AppModule
import com.stfalcon.weather.di.DaggerAppComponent

open class WeatherApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}