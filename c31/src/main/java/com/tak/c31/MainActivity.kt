package com.tak.c31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_list)

        val datas = resources.getStringArray(R.array.locations)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            datas
        )

        listView.adapter = adapter

    }

}


/**
 * 그니까 어댑터 뷰 라는게
 * 어댑터를 눌러야 보이는 뷰 => 이게 어댑터 뷰 다.
 * 어댑터를 눌러야 보이는 리스트 뷰 => 그게 어댑터 리스트 뷰 라는건가
 *
 *
 * simple_list_item_1 : 항목에 문자열 데이터 하나 < 이것들 안드로이드(플랫폼)에서 제공해주는것들
 * simple_list_item_2 : 항목에 문자열 데이터 두개 위아래 나열
 * simple_list_item_multiple_choice     체크박스
 * simple_list_ime_single_choice        라디오버튼
 */