package com.stfalcon.weather.di

import com.stfalcon.weather.data.di.DataModule
import com.stfalcon.weather.presentation.fragments.detailsBottomSheetFragment.DetailsBottomSheetFragment
import com.stfalcon.weather.presentation.fragments.detailsBottomSheetFragment.DetailsViewModel
import com.stfalcon.weather.presentation.fragments.mainFragment.MainFragment
import com.stfalcon.weather.presentation.fragments.mainFragment.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, AppBindsModule::class, AppModule::class])
interface AppComponent {

    fun inject(mainFragment: MainFragment)

    fun inject(detailsBottomSheetFragment: DetailsBottomSheetFragment)

    fun detailsViewModel(): DetailsViewModel.Factory

    fun mainViewModel(): MainViewModel.Factory
}