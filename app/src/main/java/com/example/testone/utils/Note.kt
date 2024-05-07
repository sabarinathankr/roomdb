package com.example.testone.utils

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(val title: String,
                val description: String,
                val priority: Int,
                @PrimaryKey(autoGenerate = false) var id: Int? = null)