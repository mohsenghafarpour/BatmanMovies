package com.mo22sen.batmanmovies.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mo22sen.batmanmovies.data.Movie
import com.mo22sen.batmanmovies.data.Search

@Database(
    entities = [
        Search::class
    ], version = 1, exportSchema = false
)

abstract class BatmanMoviesDB : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}