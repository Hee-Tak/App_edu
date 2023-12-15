package com.tak.c12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToMainActivity2(view: View){
        // Intent를 사용하여 MainActivity2로 이동
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}