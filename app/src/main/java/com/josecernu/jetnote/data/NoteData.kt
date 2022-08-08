package com.josecernu.jetnote.data

import com.josecernu.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A good day", description = "We wen on a vacagtion by the lake"),
            Note(title = "Android Compose", description = "Working on Android Compose"),
            Note(title = "Keep at it...", description = "Sometimes things just happen"),
            Note(title = "A movie day", description = "Watching a movie with family"),
            Note(title = "A movie day", description = "Watching a movie with family"),
            Note(title = "A movie day", description = "Watching a movie with family"),
            Note(title = "A movie day", description = "Watching a movie with family"),
            Note(title = "A movie day", description = "Watching a movie with family"),
            Note(title = "A movie day", description = "Watching a movie with family"),
            Note(title = "A movie day", description = "Watching a movie with family"))
    }
}