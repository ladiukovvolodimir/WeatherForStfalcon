package com.stfalcon.weather.domain.usecases

import com.stfalcon.weather.domain.models.WeatherInfo
import com.stfalcon.weather.domain.repository.WeatherRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetWeatherByCityNameUseCase @Inject constructor(private val repository: WeatherRepository) {

    suspend fun execute(cityName: String): WeatherInfo? {
        return repository.getWeatherByCityName(cityName)
    }
}