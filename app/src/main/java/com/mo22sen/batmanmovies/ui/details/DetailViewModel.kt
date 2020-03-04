package com.mo22sen.batmanmovies.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mo22sen.batmanmovies.base.BaseViewModel
import com.mo22sen.batmanmovies.data.Search
import com.mo22sen.batmanmovies.network.Result
import com.mo22sen.batmanmovies.network.api.API_KEY
import com.mo22sen.batmanmovies.utils.Event
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DetailViewModel(private val model: DetailModel) : BaseViewModel(model) {

    private val _snackMessage = MutableLiveData<Event<Int>>()
    val snackMessage: LiveData<Event<Int>>
        get() = _snackMessage

    private val imdbId = MutableLiveData<String>()

    fun setData(data: Search) {
        imdbId.postValue(data.imdbId)
    }

    init {
        viewModelScope.launch {
            delay(100)
            val id = imdbId.value ?: ""
            getDetailsMovieFromNetwork(API_KEY, id)
        }
    }

    private fun getDetailsMovieFromNetwork(apiKey: String, imdbId: String) = viewModelScope.launch {
        when (val result = model.getDetailsMovieFromNetwork(apiKey, imdbId)) {
            is Result.Success -> {
            }
            is Result.Error -> _snackMessage.postValue(Event(result.stringRes))
        }
    }

}