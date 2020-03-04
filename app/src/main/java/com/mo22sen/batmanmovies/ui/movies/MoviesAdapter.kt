package com.mo22sen.batmanmovies.ui.movies

import androidx.recyclerview.widget.DiffUtil
import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.base.BaseAdapter
import com.mo22sen.batmanmovies.data.Movie
import com.mo22sen.batmanmovies.data.Search

class MoviesAdapter : BaseAdapter<Search>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Search>() {
            override fun areItemsTheSame(oldItem: Search, newItem: Search): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Search, newItem: Search): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_movie
    }

}