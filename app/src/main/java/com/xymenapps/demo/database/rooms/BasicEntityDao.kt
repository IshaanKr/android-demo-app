package com.xymenapps.demo.database.rooms

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BasicEntityDao {
    @Query("SELECT * FROM BasicEntity")
    fun getAll(): List<BasicEntity>

    @Insert
    fun insertAll(vararg basicEntities: BasicEntity)

    @Delete
    fun delete(basicEntity: BasicEntity)
}
