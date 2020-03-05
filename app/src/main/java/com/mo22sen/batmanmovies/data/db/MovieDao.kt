package com.mo22sen.batmanmovies.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mo22sen.batmanmovies.data.DetailMovie
import com.mo22sen.batmanmovies.data.Search

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie")
    fun getMovies(): LiveData<List<Search>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertMovies(search: List<Search>)

    @Query("DELETE FROM movie")
    suspend fun clearMovies()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertDetailMovie(detailMovie: DetailMovie)

    @Query("SELECT * FROM detail WHERE imdbID =:imdbID LIMIT 1")
    suspend fun getDetailMovie(imdbID: String): DetailMovie?

}