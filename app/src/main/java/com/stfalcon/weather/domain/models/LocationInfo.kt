package com.stfalcon.weather.domain.models

import java.io.Serializable

data class LocationInfo(
    val latitude: Double,
    val longitude: Double
) : Serializable