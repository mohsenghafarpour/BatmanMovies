package com.mo22sen.batmanmovies.di

import com.mo22sen.batmanmovies.ui.details.DetailModel
import com.mo22sen.batmanmovies.ui.main.MainModel
import com.mo22sen.batmanmovies.ui.movies.MoviesModel
import com.mo22sen.batmanmovies.ui.splash.SplashModel
import com.mo22sen.batmanmovies.ui.splash.fragment.SplashDetailModel
import org.koin.dsl.module

val modelModule = module {
    factory { MainModel() }
    factory { MoviesModel(get()) }
    factory { DetailModel(get()) }
    factory { SplashModel() }
    factory { SplashDetailModel() }
}