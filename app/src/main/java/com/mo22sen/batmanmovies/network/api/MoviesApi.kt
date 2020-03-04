package com.mo22sen.batmanmovies.network.api

import com.mo22sen.batmanmovies.data.Movie
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface MoviesApi {

    @GET
    suspend fun getMovies(
        @Url url : String = "",
        @Query("apikey") apiKey: String,
        @Query("s") s: String
    ): Movie
}