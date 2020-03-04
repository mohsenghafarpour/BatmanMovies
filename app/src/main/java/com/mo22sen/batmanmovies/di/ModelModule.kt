package com.mo22sen.batmanmovies.di

import com.mo22sen.batmanmovies.ui.main.MainModel
import com.mo22sen.batmanmovies.ui.movies.MoviesModel
import org.koin.dsl.module

val modelModule = module {
    factory { MainModel() }
    factory { MoviesModel(get()) }
}