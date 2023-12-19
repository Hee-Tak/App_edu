package com.tak.c39

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java )
            startActivity(intent)

        }
    }
}

/**
 * MainActivity 도 안드로이드 컴포넌트고
 * 이것도 안드로이드 컴포넌트라 시스템에 의해서 라이프사이클 관리가 돼야 한다.
 * AndroidManifest.xml 파일 열어보면 자동등록돼있는게 보일것
 */