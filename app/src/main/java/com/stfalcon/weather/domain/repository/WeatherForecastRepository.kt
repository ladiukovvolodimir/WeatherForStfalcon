package com.stfalcon.weather.domain.repository

import com.stfalcon.weather.domain.models.LocationInfo
import com.stfalcon.weather.domain.models.WeatherForecastInfo

interface WeatherForecastRepository {

    suspend fun getWeatherForecastByLocation(locationInfo: LocationInfo): WeatherForecastInfo?
}