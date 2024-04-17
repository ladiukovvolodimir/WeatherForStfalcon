package com.stfalcon.weather.domain.repository

import com.stfalcon.weather.domain.models.LocationInfo
import com.stfalcon.weather.domain.models.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherByCityName(cityName: String): WeatherInfo?

    suspend fun getWeatherByLocation(location: LocationInfo): WeatherInfo?
}