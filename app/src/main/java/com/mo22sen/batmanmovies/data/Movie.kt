package com.mo22sen.batmanmovies.data

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("Search")
    val search: List<Search>,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("Response")
    val response: String
)

data class Search(
    @SerializedName("Title")
    val title: String,
    @SerializedName("Year")
    val year: String,
    @SerializedName("imdbID")
    val imdbId: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Poster")
    val poster: String
)