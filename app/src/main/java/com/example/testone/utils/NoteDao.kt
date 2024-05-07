package com.example.testone.utils

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("delete from test_table")
    fun deleteAllNotes()

    @Query("select * from test_table order by priority desc")
    fun getAllNotes(): LiveData<List<Note>>
}