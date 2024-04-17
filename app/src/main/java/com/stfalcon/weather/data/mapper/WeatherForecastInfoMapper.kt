package com.stfalcon.weather.data.mapper

import com.stfalcon.weather.data.network.response.WeatherForecastResponse
import com.stfalcon.weather.domain.models.WeatherForecastInfo
import javax.inject.Inject

class WeatherForecastInfoMapper @Inject constructor(
    private val weatherInfoMapper: WeatherInfoMapper
) {
    fun map(weatherForecastResponse: WeatherForecastResponse) : WeatherForecastInfo {
        with (weatherForecastResponse) {
            return WeatherForecastInfo(
                list = list?.filterNotNull()?.map { weatherInfoMapper.map(it) } ?: listOf()
            )
        }
    }
}