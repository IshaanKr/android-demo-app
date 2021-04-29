package com.xymenapps.demo.main.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xymenapps.demo.R
import com.xymenapps.demo.main.adapters.MainRecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MainRecyclerViewAdapter()
    }

    private fun initUI() {
        recyclerView = findViewById(R.id.main_recyclerview)
    }
}