package com.mo22sen.batmanmovies.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

private const val TABLE_NAME = "detail"

@Entity(tableName = TABLE_NAME)
data class DetailMovie(
    @SerializedName("Title")
    @ColumnInfo(name = "Title")
    val title: String,
    @SerializedName("Year")
    @ColumnInfo(name = "Year")
    val year: String,
    @SerializedName("Runtime")
    @ColumnInfo(name = "Runtime")
    val runTime: String,
    @SerializedName("Genre")
    @ColumnInfo(name = "Genre")
    val genre: String,
    @SerializedName("Director")
    @ColumnInfo(name = "Director")
    val director: String,
    @SerializedName("Actors")
    @ColumnInfo(name = "Actors")
    val actors: String,
    @SerializedName("Plot")
    @ColumnInfo(name = "Plot")
    val plot: String,
    @SerializedName("Country")
    @ColumnInfo(name = "Country")
    val country: String,
    @SerializedName("Poster")
    @ColumnInfo(name = "Poster")
    val poster: String,
    @SerializedName("imdbRating")
    @ColumnInfo(name = "imdbRating")
    val imdbRating: String,
    @PrimaryKey
    @SerializedName("imdbID")
    @ColumnInfo(name = "imdbID")
    val imdbId: String
)


