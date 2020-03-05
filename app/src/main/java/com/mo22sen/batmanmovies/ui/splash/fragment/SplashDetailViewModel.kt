package com.mo22sen.batmanmovies.ui.splash.fragment

import androidx.lifecycle.viewModelScope
import com.mo22sen.batmanmovies.base.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashDetailViewModel(model: SplashDetailModel) : BaseViewModel(model) {

    fun checkDestination() = viewModelScope.launch {
        delay(2000)
        navigateToWithFinish(SplashDetailFragmentDirections.actionSplashToMain())
    }
}