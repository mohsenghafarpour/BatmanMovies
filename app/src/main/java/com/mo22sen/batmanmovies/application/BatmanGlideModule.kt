package com.mo22sen.batmanmovies.application

import android.content.Context
import android.util.Log
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.mo22sen.batmanmovies.BuildConfig

@GlideModule
class BatmanGlideModule : AppGlideModule() {

    override fun applyOptions(context: Context, builder: GlideBuilder) {
        // Log glide loads
        if (BuildConfig.DEBUG) builder.setLogLevel(Log.DEBUG)
    }
}