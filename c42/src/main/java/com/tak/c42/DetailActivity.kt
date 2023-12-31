package com.tak.c42

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getStringExtra("id")
        val button = findViewById<Button>(R.id.finishButton)
        button.setOnClickListener {
            intent.putExtra("result", "hello : $id")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}