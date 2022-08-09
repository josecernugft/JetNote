package com.josecernu.jetnote.di

import android.content.Context
import androidx.room.Room
import com.josecernu.jetnote.data.NoteDatabase
import com.josecernu.jetnote.data.NoteDatebaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDao(noteDatebase: NoteDatabase): NoteDatebaseDao
    = noteDatebase.noteDao()

    @Singleton
    @Provides
    fun provideAppDataBase(@ApplicationContext context: Context): NoteDatabase
    = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "notes_db"
    ).fallbackToDestructiveMigration()
        .build()

}