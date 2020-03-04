package com.mo22sen.batmanmovies.data.repository

import com.mo22sen.batmanmovies.data.DetailMovie
import com.mo22sen.batmanmovies.data.Movie
import com.mo22sen.batmanmovies.network.Result
import com.mo22sen.batmanmovies.network.api.MoviesApi
import com.mo22sen.batmanmovies.utils.safeApiCall

class MoviesRepositoryImpl(private val moviesApi: MoviesApi) : MoviesRepository {

    override suspend fun getMoviesFromNetwork(apiKey: String, search: String): Result<Movie> =
        safeApiCall {
            val response = moviesApi.getMovies(apiKey = apiKey, search = search)
            return@safeApiCall Result.Success(response)
        }


    override suspend fun getDetailsMovieFromNetwork(
        apiKey: String,
        imdbId: String
    ): Result<DetailMovie> = safeApiCall {
        val response = moviesApi.getDetailsMovie(apiKey = apiKey, imdbId = imdbId)
        return@safeApiCall Result.Success(response)
    }
}