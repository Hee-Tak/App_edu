package com.tak.c35

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //==================================================================================
        val spinner = findViewById<Spinner>(R.id.spinner)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.auto)

        val datas = resources.getStringArray(R.array.language)

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line, datas
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter


        //==================================================================================
        val autoDatas = arrayOf<String>("apply", "apple", "below")      // 추천단어
        val autoAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_dropdown_item_1line,
            autoDatas
        )
        autoCompleteTextView.setAdapter(autoAdapter)
        //==================================================================================
    }
}

/**
 * Spinner -> 콤보박스
 */

/**
 * android:completionThreshold="1" => 자동 완성을 위한 dropdown이 한글자 입력되었을 때 보이게 된다. 기본은 두 글자
 * android:completionHint="항목을선택하세요" => dropdown 아래에 설명글
 * android:dropDownWidth = "200dp"
 * android:dropDownHeight = "100dp"
 * android:dropDownVerticalOffset = "100dp" => dropdown과 AutoCompleteTextView 세로 방향과 offset 사이즈
 *  ""   ""   ""   Horizontal ""  =    ""   =>    ""              ""           가로 방향    ""
 */