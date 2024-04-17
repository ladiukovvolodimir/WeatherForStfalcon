package com.stfalcon.weather.di

import com.stfalcon.weather.data.repository.LocationRepositoryImpl
import com.stfalcon.weather.data.repository.WeatherForecastRepositoryImpl
import com.stfalcon.weather.data.repository.WeatherRepositoryImpl
import com.stfalcon.weather.domain.repository.LocationRepository
import com.stfalcon.weather.domain.repository.WeatherForecastRepository
import com.stfalcon.weather.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module

@Module
abstract class AppBindsModule {

    @Binds
    abstract fun bindWeatherRepositoryImpl_to_WeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository

    @Binds
    abstract fun bindWeatherForecastRepositoryImpl_to_WeatherForecastRepository(weatherForecastRepositoryImpl: WeatherForecastRepositoryImpl): WeatherForecastRepository

    @Binds
    abstract fun bindLocationRepositoryImpl_to_LocationRepository(locationRepositoryImpl: LocationRepositoryImpl): LocationRepository
}