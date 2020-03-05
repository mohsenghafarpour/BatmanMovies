package com.mo22sen.batmanmovies.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.mo22sen.batmanmovies.base.BaseViewModel
import com.mo22sen.batmanmovies.data.Search
import com.mo22sen.batmanmovies.network.api.API_KEY
import kotlinx.coroutines.launch

class MoviesViewModel(private val model: MoviesModel) : BaseViewModel(model) {


    val movies: LiveData<List<Search>> = model.movies

    private fun getMoviesFromNetwork() = viewModelScope.launch {
        model.getMoviesFromNetwork(API_KEY, "batman")
    }

    init {
        getMoviesFromNetwork()
    }

    fun openDetailsMovie(item: Search) {
        navigateTo(MoviesFragmentDirections.actionMoviesToDetail(item))
    }

}