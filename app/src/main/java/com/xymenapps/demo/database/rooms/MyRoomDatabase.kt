package com.xymenapps.demo.database.rooms

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BasicEntity::class, EmbeddedEntity::class], version = 1)
abstract class MyRoomDatabase : RoomDatabase() {
    abstract fun basicEntityDao(): BasicEntityDao
    abstract fun cascadedEntityDao(): EmbeddedEntityDao
}