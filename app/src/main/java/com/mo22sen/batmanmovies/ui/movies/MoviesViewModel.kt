package com.mo22sen.batmanmovies.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mo22sen.batmanmovies.base.BaseViewModel
import com.mo22sen.batmanmovies.data.Search
import com.mo22sen.batmanmovies.network.Result
import com.mo22sen.batmanmovies.network.api.API_KEY
import com.mo22sen.batmanmovies.utils.Event
import com.mo22sen.batmanmovies.utils.ktx.logD
import kotlinx.coroutines.launch

class MoviesViewModel(private val model: MoviesModel) : BaseViewModel(model) {


    val movies: LiveData<List<Search>> = model.movies

    private val _snackMessage = MutableLiveData<Event<Int>>()
    val snackMessage: LiveData<Event<Int>>
        get() = _snackMessage

    init {
        getMoviesFromNetwork()
    }

    private fun getMoviesFromNetwork() = viewModelScope.launch {
        when (val result = model.getMoviesFromNetwork(API_KEY, "batman")) {
            is Result.Success -> {
                logD("successfully")
            }
            is Result.Error -> _snackMessage.postValue(Event(result.stringRes))
        }

    }

    fun openDetailsMovie(item: Search) {
        navigateTo(MoviesFragmentDirections.actionMoviesToDetail(item))
    }

}