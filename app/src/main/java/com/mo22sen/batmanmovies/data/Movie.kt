package com.mo22sen.batmanmovies.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

const val TABLE_NAME = "movie"

data class Movie(
    @SerializedName("Search")
    val search: List<Search>,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("Response")
    val response: String
)

@Entity(tableName = TABLE_NAME)
@Parcelize
data class Search(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @SerializedName("Title")
    @ColumnInfo(name = "Title")
    val title: String,
    @SerializedName("Year")
    @ColumnInfo(name = "Year")
    val year: String,
    @SerializedName("imdbID")
    @ColumnInfo(name = "imdbID")
    val imdbId: String,
    @SerializedName("Type")
    @ColumnInfo(name = "Type")
    val type: String,
    @SerializedName("Poster")
    @ColumnInfo(name = "Poster")
    val poster: String
) : Parcelable