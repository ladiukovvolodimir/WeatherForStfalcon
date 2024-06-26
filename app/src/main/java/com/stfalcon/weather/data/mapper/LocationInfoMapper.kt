package com.stfalcon.weather.data.mapper

import android.location.Location
import com.stfalcon.weather.domain.models.LocationInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocationInfoMapper @Inject constructor() {

    fun map(location: Location): LocationInfo {
        return LocationInfo(
            latitude = location.latitude, longitude = location.longitude
        )
    }
}