package com.mo22sen.batmanmovies.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mo22sen.batmanmovies.base.BaseViewModel
import com.mo22sen.batmanmovies.data.Movie
import com.mo22sen.batmanmovies.network.Result
import com.mo22sen.batmanmovies.utils.Event
import kotlinx.coroutines.launch

class MoviesViewModel(private val model: MoviesModel) : BaseViewModel(model) {

    private val _movies = MutableLiveData<Movie>()
    val movies: LiveData<Movie>
        get() = _movies

    private val _snackMessage = MutableLiveData<Event<Int>>()
    val snackMessage: LiveData<Event<Int>>
        get() = _snackMessage

    init {
        getMoviesFromNetwork()
    }

    private fun getMoviesFromNetwork() = viewModelScope.launch {
        when (val result = model.getMoviesFromNetwork("3e974fca", "batman")) {
            is Result.Success -> _movies.postValue(result.data)
            is Result.Error -> _snackMessage.postValue(Event(result.stringRes))
        }

    }

}