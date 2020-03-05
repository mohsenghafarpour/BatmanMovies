package com.mo22sen.batmanmovies.di

import com.mo22sen.batmanmovies.ui.details.DetailViewModel
import com.mo22sen.batmanmovies.ui.main.MainViewModel
import com.mo22sen.batmanmovies.ui.movies.MoviesViewModel
import com.mo22sen.batmanmovies.ui.splash.SplashViewModel
import com.mo22sen.batmanmovies.ui.splash.fragment.SplashDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
    viewModel { MoviesViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { SplashViewModel(get()) }
    viewModel { SplashDetailViewModel(get()) }
}