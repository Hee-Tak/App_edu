package com.tak.c12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    lateinit var visibleButton: Button
    lateinit var invisibleButton: Button
    lateinit var logoImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        visibleButton = findViewById(R.id.visibleButton)
        invisibleButton = findViewById(R.id.invisibleButton)
        logoImageView = findViewById(R.id.logoImageView)

        visibleButton.setOnClickListener{
            logoImageView.visibility = View.VISIBLE
        }

        invisibleButton.setOnClickListener {
            logoImageView.visibility = View.INVISIBLE
        }
    }


}