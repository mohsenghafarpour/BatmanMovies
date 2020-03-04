package com.mo22sen.batmanmovies.data.repository

import com.mo22sen.batmanmovies.data.Movie
import com.mo22sen.batmanmovies.network.Result

interface MoviesRepository {

    suspend fun getMoviesFromNetwork(apiKey: String, search: String): Result<Movie>
}