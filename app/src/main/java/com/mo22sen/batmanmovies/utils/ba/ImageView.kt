package com.mo22sen.batmanmovies.utils.ba

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.mo22sen.batmanmovies.utils.ktx.load
import com.mo22sen.batmanmovies.utils.ktx.loadRounded
import com.mo22sen.batmanmovies.utils.ktx.px


@BindingAdapter("image", "placeholder", requireAll = false)
fun ImageView.imageUrl(url: String?, placeholder: Drawable?) {
    load(url, placeholder)
}


@BindingAdapter("imageRounded", "radius", "centerCrop", requireAll = false)
fun ImageView.setImageRounded(
    url: String?,
    radius: Int?,
    centerCrop: Boolean?
    ) {
    loadRounded(url, radius?.px ?: 0, centerCrop = centerCrop ?: false)
}