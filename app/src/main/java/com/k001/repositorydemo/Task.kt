package com.k001.repositorydemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "task_table")
data class Task( @PrimaryKey
    @ColumnInfo(name = "name") val description: String,
    @ColumnInfo(name = "date") val date: Date,
    @ColumnInfo(name = "important") val important: Int)