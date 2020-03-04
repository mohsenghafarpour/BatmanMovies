package com.mo22sen.batmanmovies.network.api

import com.mo22sen.batmanmovies.data.DetailMovie
import com.mo22sen.batmanmovies.data.Movie
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

const val API_KEY = "3e974fca"

interface MoviesApi {

    @GET
    suspend fun getMovies(
        @Url url: String = "",
        @Query("apikey") apiKey: String,
        @Query("s") search: String
    ): Movie


    @GET
    suspend fun getDetailsMovie(
        @Url url: String = "",
        @Query("apikey") apiKey: String,
        @Query("i") imdbId: String
    ): DetailMovie

}