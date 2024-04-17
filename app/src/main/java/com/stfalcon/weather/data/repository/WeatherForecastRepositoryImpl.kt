package com.stfalcon.weather.data.repository

import com.stfalcon.weather.data.mapper.WeatherForecastInfoMapper
import com.stfalcon.weather.data.network.WeatherForecastApiService
import com.stfalcon.weather.domain.models.LocationInfo
import com.stfalcon.weather.domain.models.WeatherForecastInfo
import com.stfalcon.weather.domain.repository.WeatherForecastRepository
import javax.inject.Inject

class WeatherForecastRepositoryImpl @Inject constructor(
    private val remoteSource: WeatherForecastApiService, private val mapper: WeatherForecastInfoMapper
) : WeatherForecastRepository {

    override suspend fun getWeatherForecastByLocation(locationInfo: LocationInfo): WeatherForecastInfo? {
        val weatherForecastResponse = remoteSource.getWeatherForecastByLocation(
            latitude = locationInfo.latitude, longitude = locationInfo.longitude
        )

        return mapper.map(weatherForecastResponse)
    }

}