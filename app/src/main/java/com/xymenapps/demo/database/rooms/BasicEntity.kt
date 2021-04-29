package com.xymenapps.demo.database.rooms

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BasicEntity(
    @PrimaryKey val id: Int,
    val heading: String,
    val subHeading: String,
    val description: String
)
