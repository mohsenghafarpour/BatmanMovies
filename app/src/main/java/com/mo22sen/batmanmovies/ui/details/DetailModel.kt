package com.mo22sen.batmanmovies.ui.details

import com.mo22sen.batmanmovies.data.repository.MoviesRepository
import money.minimum.payment.base.BaseModel

class DetailModel(private val moviesRepository: MoviesRepository) : BaseModel() {


    suspend fun detailMovie(apiKey: String, imdbID: String) =
        moviesRepository.getDetailMovie(apiKey, imdbID)

}