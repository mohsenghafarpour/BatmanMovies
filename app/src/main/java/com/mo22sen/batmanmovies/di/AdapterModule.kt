package com.mo22sen.batmanmovies.di

import com.mo22sen.batmanmovies.ui.movies.MoviesAdapter
import org.koin.dsl.module

val adapterModule = module {
    factory { MoviesAdapter() }
}