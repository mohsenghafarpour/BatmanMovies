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
    @SerializedName("Rated")
    @ColumnInfo(name = "Rated")
    val rated: String,
    @SerializedName("Released")
    @ColumnInfo(name = "Released")
    val released: String,
    @SerializedName("Runtime")
    @ColumnInfo(name = "Runtime")
    val runTime: String,
    @SerializedName("Genre")
    @ColumnInfo(name = "Genre")
    val genre: String,
    @SerializedName("Director")
    @ColumnInfo(name = "Director")
    val director: String,
    @SerializedName("Writer")
    @ColumnInfo(name = "Writer")
    val writer: String,
    @SerializedName("Actors")
    @ColumnInfo(name = "Actors")
    val actors: String,
    @SerializedName("Plot")
    @ColumnInfo(name = "Plot")
    val plot: String,
    @SerializedName("Language")
    @ColumnInfo(name = "Language")
    val language: String,
    @SerializedName("Country")
    @ColumnInfo(name = "Country")
    val country: String,
    @SerializedName("Awards")
    @ColumnInfo(name = "Awards")
    val awards: String,
    @SerializedName("Poster")
    @ColumnInfo(name = "Poster")
    val poster: String,
    @SerializedName("Metascore")
    @ColumnInfo(name = "Metascore")
    val metaScore: String,
    @SerializedName("imdbRating")
    @ColumnInfo(name = "imdbRating")
    val imdbRating: String,
    @SerializedName("imdbVotes")
    @ColumnInfo(name = "imdbVotes")
    val imdbVotes: String,
    @PrimaryKey
    @SerializedName("imdbID")
    @ColumnInfo(name = "imdbID")
    val imdbId: String,
    @SerializedName("Type")
    @ColumnInfo(name = "Type")
    val type: String,
    @SerializedName("DVD")
    @ColumnInfo(name = "DVD")
    val dvd: String,
    @SerializedName("BoxOffice")
    @ColumnInfo(name = "BoxOffice")
    val boxOffice: String,
    @SerializedName("Production")
    @ColumnInfo(name = "Production")
    val production: String,
    @SerializedName("Website")
    @ColumnInfo(name = "Website")
    val website: String,
    @SerializedName("Response")
    @ColumnInfo(name = "Response")
    val response: String
)


