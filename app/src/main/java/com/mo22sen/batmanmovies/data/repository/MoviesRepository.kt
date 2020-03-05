package com.mo22sen.batmanmovies.data.repository

import androidx.lifecycle.LiveData
import com.mo22sen.batmanmovies.data.DetailMovie
import com.mo22sen.batmanmovies.data.Movie
import com.mo22sen.batmanmovies.data.Search
import com.mo22sen.batmanmovies.network.Result

interface MoviesRepository {

    suspend fun getMoviesFromNetwork(apiKey: String, search: String): Result<Movie>

    fun getMovies(): LiveData<List<Search>>

    suspend fun getDetailsMovieFromNetwork(apiKey: String, imdbId: String): Result<DetailMovie>

    suspend fun getDetailMovie(apiKey: String, imdbID: String): DetailMovie?
}