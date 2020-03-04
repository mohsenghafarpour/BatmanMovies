package com.mo22sen.batmanmovies.utils.ba

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mo22sen.batmanmovies.base.BaseAdapter


@Suppress("UNCHECKED_CAST")
@BindingAdapter("data")
fun <T> RecyclerView.setRecyclerViewData(data: MutableList<T>?) {
    if (adapter is BaseAdapter<*>) {
        (adapter as BaseAdapter<T>).submitList(data)
    }
}
