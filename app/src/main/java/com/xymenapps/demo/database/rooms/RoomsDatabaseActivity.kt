package com.xymenapps.demo.database.rooms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.xymenapps.demo.R

class RoomsDatabaseActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "RoomsDatabaseActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rooms_database)

        AppRoomsDatabase.init(applicationContext)

    }

}