package com.mo22sen.batmanmovies.utils.ktx

import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController


fun NavController.navigateUpOrFinish(activity: FragmentActivity?): Boolean {
    return if (navigateUp()) {
        true
    } else {
        activity?.finish()
        true
    }
}
