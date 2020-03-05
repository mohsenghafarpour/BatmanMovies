package com.mo22sen.batmanmovies.data.repository

import androidx.lifecycle.LiveData
import com.mo22sen.batmanmovies.data.DetailMovie
import com.mo22sen.batmanmovies.data.Movie
import com.mo22sen.batmanmovies.data.Search
import com.mo22sen.batmanmovies.data.db.MovieDao
import com.mo22sen.batmanmovies.network.Result
import com.mo22sen.batmanmovies.network.api.MoviesApi
import com.mo22sen.batmanmovies.utils.safeApiCall

class MoviesRepositoryImpl(
    private val moviesApi: MoviesApi,
    private val movieDao: MovieDao
) : MoviesRepository {

    override suspend fun getMoviesFromNetwork(apiKey: String, search: String): Result<Movie> =
        safeApiCall {
            val response = moviesApi.getMovies(apiKey = apiKey, search = search)
            movieDao.clearMovies()
            movieDao.upsertServices(response.search)
            return@safeApiCall Result.Success(response)
        }

    override fun getMovies(): LiveData<List<Search>> = movieDao.getMovies()

    override suspend fun getDetailsMovieFromNetwork(
        apiKey: String,
        imdbId: String
    ): Result<DetailMovie> = safeApiCall {
        val response = moviesApi.getDetailsMovie(apiKey = apiKey, imdbId = imdbId)
        return@safeApiCall Result.Success(response)
    }
}