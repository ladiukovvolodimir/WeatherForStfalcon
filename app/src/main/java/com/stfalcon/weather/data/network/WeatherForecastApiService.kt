package com.stfalcon.weather.data.network

import com.stfalcon.weather.data.network.response.WeatherForecastResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherForecastApiService {

    @GET("forecast")
    suspend fun getWeatherForecastByLocation(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double
    ): WeatherForecastResponse
}