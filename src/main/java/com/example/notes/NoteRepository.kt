package com.example.notes

import androidx.lifecycle.LiveData

class NoteRepository (private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun delete(note: Note){
        noteDao.delete(note)
    }

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }
}