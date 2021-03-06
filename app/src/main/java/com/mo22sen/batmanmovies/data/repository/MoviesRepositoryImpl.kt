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
            movieDao.upsertMovies(response.search)
            return@safeApiCall Result.Success(response)
        }

    override fun getMovies(): LiveData<List<Search>> = movieDao.getMovies()

    override suspend fun getDetailsMovieFromNetwork(
        apiKey: String,
        imdbId: String
    ): Result<DetailMovie> = safeApiCall {
        return@safeApiCall Result.Success(
            moviesApi.getDetailsMovie(
                apiKey = apiKey,
                imdbId = imdbId
            )
        )
    }

    override suspend fun getDetailMovie(apiKey: String, imdbID: String): DetailMovie? {
        return movieDao.getDetailMovie(imdbID)
            ?: return when (val result = getDetailsMovieFromNetwork(apiKey, imdbID)) {
                is Result.Success ->
                    result.data.also { movieDao.upsertDetailMovie(it) }
                is Result.Error ->
                    null
            }
    }
}