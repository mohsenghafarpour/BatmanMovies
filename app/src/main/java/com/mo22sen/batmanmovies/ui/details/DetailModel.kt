package com.mo22sen.batmanmovies.ui.details

import com.mo22sen.batmanmovies.data.repository.MoviesRepository
import money.minimum.payment.base.BaseModel

class DetailModel(private val moviesRepository: MoviesRepository) : BaseModel() {


    suspend fun getDetailsMovieFromNetwork(apiKey: String, imdbId: String) =
        moviesRepository.getDetailsMovieFromNetwork(apiKey, imdbId)
}