package com.mo22sen.batmanmovies.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mo22sen.batmanmovies.data.Search

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie")
    fun getMovies(): LiveData<List<Search>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertServices(search: List<Search>)


    @Query("DELETE FROM movie")
    suspend fun clearMovies()
}