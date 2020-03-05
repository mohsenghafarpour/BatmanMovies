package com.mo22sen.batmanmovies.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mo22sen.batmanmovies.base.BaseViewModel
import com.mo22sen.batmanmovies.data.DetailMovie
import com.mo22sen.batmanmovies.data.Search
import com.mo22sen.batmanmovies.network.api.API_KEY
import kotlinx.coroutines.launch

class DetailViewModel(private val model: DetailModel) : BaseViewModel(model) {

    private val _detail = MutableLiveData<DetailMovie>()
    val detail: LiveData<DetailMovie>
        get() = _detail


    fun setData(data: Search) = viewModelScope.launch {
        model.detailMovie(API_KEY, data.imdbId)?.let {
            _detail.postValue(it)
        }

    }

}