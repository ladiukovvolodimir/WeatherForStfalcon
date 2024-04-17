package com.stfalcon.weather.presentation.fragments.detailsBottomSheetFragment.parametersRecyclerVIew

import androidx.recyclerview.widget.RecyclerView
import com.stfalcon.weather.databinding.ItemWeatherParameterBinding

class WeatherParametersHolder(
    private val binding: ItemWeatherParameterBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(weatherParameter: WeatherParameter) {
        with(binding) {
            parameterNameTextView.text = weatherParameter.name
            valueTextView.text = weatherParameter.value
        }
    }
}