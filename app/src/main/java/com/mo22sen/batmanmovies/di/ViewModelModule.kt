package com.mo22sen.batmanmovies.di

import com.mo22sen.batmanmovies.ui.details.DetailViewModel
import com.mo22sen.batmanmovies.ui.main.MainViewModel
import com.mo22sen.batmanmovies.ui.movies.MoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
    viewModel { MoviesViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}