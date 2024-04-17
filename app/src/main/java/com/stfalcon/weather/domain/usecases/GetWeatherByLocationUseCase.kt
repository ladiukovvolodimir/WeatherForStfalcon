package com.stfalcon.weather.domain.usecases

import com.stfalcon.weather.domain.models.LocationInfo
import com.stfalcon.weather.domain.models.WeatherInfo
import com.stfalcon.weather.domain.repository.WeatherRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetWeatherByLocationUseCase @Inject constructor(private val repository: WeatherRepository) {

    suspend fun execute(locationInfo: LocationInfo): WeatherInfo? {
        return repository.getWeatherByLocation(locationInfo)
    }
}