package com.mo22sen.batmanmovies.ui.movies

import com.mo22sen.batmanmovies.data.repository.MoviesRepository
import money.minimum.payment.base.BaseModel

class MoviesModel(private val moviesRepository: MoviesRepository) : BaseModel() {

    suspend fun getMoviesFromNetwork(apiKey : String , search : String)=
        moviesRepository.getMoviesFromNetwork(apiKey,search)

    val movies = moviesRepository.getMovies()

}