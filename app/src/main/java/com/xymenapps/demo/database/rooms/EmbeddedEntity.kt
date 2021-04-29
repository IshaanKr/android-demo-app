package com.xymenapps.demo.database.rooms

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EmbeddedEntity(
        @PrimaryKey
        val id: Int,
        @Embedded(prefix = "embedded_basic_")
        val basicEntity: BasicEntity,
)
