package com.stfalcon.weather.domain.usecases

import com.stfalcon.weather.domain.models.LocationInfo
import com.stfalcon.weather.domain.models.WeatherForecastInfo
import com.stfalcon.weather.domain.repository.WeatherForecastRepository
import javax.inject.Inject

class GetWeatherForecastByLocationUseCase @Inject constructor(private val repository: WeatherForecastRepository) {

    suspend fun execute(locationInfo: LocationInfo): WeatherForecastInfo? {
        return repository.getWeatherForecastByLocation(locationInfo)
    }
}