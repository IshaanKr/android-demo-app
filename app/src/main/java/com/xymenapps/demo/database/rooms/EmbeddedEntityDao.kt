package com.xymenapps.demo.database.rooms

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EmbeddedEntityDao {
    @Query("SELECT * FROM EmbeddedEntity")
    fun getAll(): List<EmbeddedEntity>

    @Insert
    fun insert(embeddedEntity: EmbeddedEntity)
}
