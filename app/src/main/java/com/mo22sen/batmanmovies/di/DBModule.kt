package com.mo22sen.batmanmovies.di

import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.room.Room
import com.mo22sen.batmanmovies.data.db.BatmanMoviesDB
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

const val DB_NAME = "application_db"


val dbModule = module {

    single<SharedPreferences> {
        PreferenceManager.getDefaultSharedPreferences(androidApplication())
    }


    single {
        Room.databaseBuilder(
            androidContext(),
            BatmanMoviesDB::class.java,
            DB_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    factory {
        get<BatmanMoviesDB>().movieDao()
    }


}