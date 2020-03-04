package com.mo22sen.batmanmovies.utils.ktx

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.mo22sen.batmanmovies.application.GlideApp


fun ImageView.load(
    url: String?,
    placeholder: Drawable? = null
) {
    val request =
        GlideApp.with(this)
            .load(url)

    request.apply {
        if (placeholder != null) this.placeholder(placeholder)
    }.into(this)
}

