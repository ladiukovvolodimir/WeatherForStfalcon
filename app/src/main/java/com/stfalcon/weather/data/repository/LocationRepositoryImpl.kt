package com.stfalcon.weather.data.repository

import com.stfalcon.weather.data.location.LocationDataSource
import com.stfalcon.weather.data.mapper.LocationInfoMapper
import com.stfalcon.weather.domain.models.LocationInfo
import com.stfalcon.weather.domain.repository.LocationRepository
import javax.inject.Inject

class LocationRepositoryImpl @Inject constructor(
    private val dataSource: LocationDataSource,
    private val mapper: LocationInfoMapper
) : LocationRepository {

    override fun getCurrentLocation(): LocationInfo? {
        val location = dataSource.getCurrentLocation()
        return location?.let { mapper.map(it) }
    }
}