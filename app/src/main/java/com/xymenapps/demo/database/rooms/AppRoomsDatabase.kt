package com.xymenapps.demo.database.rooms

import android.content.Context
import android.util.Log
import androidx.room.Room

object AppRoomsDatabase {

    private const val TAG = "AppRoomsDatabase"
    private const val DATABASE_NAME = "my-rooms-database"

    private lateinit var appContext: Context
    private lateinit var myRoomDatabase: MyRoomDatabase

    fun init(context: Context) {
        Log.d(TAG, "init: Initialising database")
        appContext = context
        myRoomDatabase = Room.databaseBuilder(
            context, MyRoomDatabase::class.java, DATABASE_NAME
        ).build()
    }
}
