package com.tak.c43

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent()
            intent.action = "ACTION_DETAIL"
            intent.data = Uri.parse("http://www.google.com")
            startActivity(intent)
        }


    }
}

/**
 * Implicit Intent
 *
 * Intent Filter
 * 명시적 Explicit 인텐트 :   class type reference 정보를 활용한 인텐트 <- 여태까진 얘 써왔으니까
 * 암시적 Inplicit 인텐트 :   인텐트 필터 정보를 활용한 인텐트  <- 이번 시간엔 얘 써볼 예정
 *                          => 인텐트 필터를 등록해서 action, category, data 이런 정보를 담아줘야함 (매니페스트 파일에)
 *
 *
 *  명시적 => 내부앱과의 데이터 주고받는 그런
 *  암시적 => 외부앱과의 데이터 주고받는 그런
 *
 *
 *  카톡같은 경우에도 폰에서 아이콘 누르면
 *  Launcher App => Intent => 카카오톡 App      뭐 대충 이런 구조
 */