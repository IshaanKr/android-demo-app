package com.xymenapps.demo.main.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xymenapps.demo.R
import com.xymenapps.demo.database.rooms.RoomsDatabaseActivity
import com.xymenapps.demo.main.adapters.MainRecyclerViewAdapter
import com.xymenapps.demo.main.listeners.MainRecyclerViewListener
import com.xymenapps.demo.main.models.MainRecyclerViewModel
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()

        val listener: MainRecyclerViewListener

        recyclerView.layoutManager = LinearLayoutManager(this)
        listener = object: MainRecyclerViewListener{
            override fun onClicked(model: MainRecyclerViewModel) {
                when(model.title){
                    "Room Database" -> startActivity(Intent(this@MainActivity, RoomsDatabaseActivity::class.java))
                    else -> Toast.makeText(this@MainActivity, "No Demo Found", Toast.LENGTH_LONG).show()
                }
            }
        }
        recyclerView.adapter = MainRecyclerViewAdapter(listener = listener)

    }

    private fun initUI() {
        recyclerView = findViewById(R.id.main_recyclerview)
    }
}