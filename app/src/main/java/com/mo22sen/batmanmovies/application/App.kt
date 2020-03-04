package com.mo22sen.batmanmovies.application

import android.app.Application
import com.mo22sen.batmanmovies.BuildConfig
import com.mo22sen.batmanmovies.di.appModule
import com.mo22sen.batmanmovies.di.modelModule
import com.mo22sen.batmanmovies.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        // Plant Timber logger in
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

        /**
         * all injection modules should be added here as a koin module.
         */
        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(
                appModule, viewModelModule, modelModule
            )
        }

    }
}