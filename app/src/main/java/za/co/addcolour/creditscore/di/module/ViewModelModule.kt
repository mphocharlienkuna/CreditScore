package za.co.addcolour.creditscore.di.module

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import za.co.addcolour.creditscore.MainViewModel

val viewModelModule = module {
    viewModel { MainViewModel(get(), get()) }
}