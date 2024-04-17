package com.stfalcon.weather.domain.usecases

import com.stfalcon.weather.domain.models.LocationInfo
import com.stfalcon.weather.domain.repository.LocationRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetLocationUseCase @Inject constructor(private val repository: LocationRepository) {

    fun execute(): LocationInfo? {
        return repository.getCurrentLocation()
    }
}