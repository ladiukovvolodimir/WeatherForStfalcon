package com.stfalcon.weather.domain.repository

import com.stfalcon.weather.domain.models.LocationInfo

interface LocationRepository {

    fun getCurrentLocation(): LocationInfo?
}