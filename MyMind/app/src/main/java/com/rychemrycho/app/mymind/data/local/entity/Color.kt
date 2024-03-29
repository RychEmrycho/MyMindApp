package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_colors")
data class Color (
    @PrimaryKey(autoGenerate = true)
    var colorId: Long,
    var colorCode: String
)