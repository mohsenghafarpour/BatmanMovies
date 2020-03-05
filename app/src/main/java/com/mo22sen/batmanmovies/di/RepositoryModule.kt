package com.mo22sen.batmanmovies.di

import com.mo22sen.batmanmovies.data.repository.MoviesRepository
import com.mo22sen.batmanmovies.data.repository.MoviesRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<MoviesRepository> { MoviesRepositoryImpl(get(),get()) }
}