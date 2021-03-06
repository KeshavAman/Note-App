package com.example.notes

import androidx.lifecycle.LiveData
import androidx.room.*
import org.w3c.dom.Text

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes_table ORDER BY id ASC")
    fun getAllNotes(): LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)

    @Delete
    suspend fun delete(note: Note)
}