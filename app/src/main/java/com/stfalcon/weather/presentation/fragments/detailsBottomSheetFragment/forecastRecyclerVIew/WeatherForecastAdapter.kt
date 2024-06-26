package com.stfalcon.weather.presentation.fragments.detailsBottomSheetFragment.forecastRecyclerVIew

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stfalcon.weather.databinding.ItemWeatherForecastBinding
import com.stfalcon.weather.domain.models.WeatherInfo

class WeatherForecastAdapter(
    private val list: List<WeatherInfo>,
) : RecyclerView.Adapter<WeatherForecastHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WeatherForecastHolder = WeatherForecastHolder(
        ItemWeatherForecastBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(
        weatherForecastHolder: WeatherForecastHolder,
        position: Int
    ) {
        weatherForecastHolder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}