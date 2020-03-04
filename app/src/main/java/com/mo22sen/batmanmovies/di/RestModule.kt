package com.mo22sen.batmanmovies.di

import com.mo22sen.batmanmovies.network.api.MoviesApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val restModule = module {
    factory<MoviesApi> { get<Retrofit>().create() }
}