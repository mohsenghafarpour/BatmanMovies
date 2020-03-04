package com.mo22sen.batmanmovies.utils.ba

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.mo22sen.batmanmovies.utils.ktx.load


@BindingAdapter("image", "placeholder", requireAll = false)
fun ImageView.imageUrl(url: String?, placeholder: Drawable?) {
    load(url, placeholder)
}
