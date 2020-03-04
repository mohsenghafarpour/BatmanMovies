package com.mo22sen.batmanmovies.ui.movies

import androidx.lifecycle.viewModelScope
import com.mo22sen.batmanmovies.base.BaseViewModel
import kotlinx.coroutines.launch

class MoviesViewModel(model: MoviesModel) : BaseViewModel(model) {


    init {
        viewModelScope.launch {
            model.getMoviesFromNetwork("3e974fca", "batman")
        }
    }
}