package com.tak.c34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mutableList = mutableListOf<DriveVO>()
        mutableList.add(DriveVO("안드로이드", "2월 6일", "doc"))
        mutableList.add(DriveVO("db.zip", "2월 8일", "file"))
        mutableList.add(DriveVO("사진", "2월 10일", "img"))


        val listView = findViewById<ListView>(R.id.custom_listView)
        val adapter = DriveAdapter(this, R.layout.custom_item, mutableList)
        listView.adapter = adapter

    }
}