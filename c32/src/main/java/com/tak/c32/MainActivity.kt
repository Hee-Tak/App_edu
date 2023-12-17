package com.tak.c32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_list)

        val datas: ArrayList<HashMap<String, String>> = ArrayList()

        var map: HashMap<String, String> = HashMap()
        map["name"] = "토트넘 핫스퍼"
        map["content"] = "런던, 토트넘 핫스퍼 스타디움"
        datas.add(map)

        map = HashMap()
        map["name"] = "맨체스터 유나이티드"
        map["content"] = "맨체스터, 올드 트래포드"
        datas.add(map)

        map = HashMap()
        map["name"] = "첼시"
        map["content"] = "런던, 스탬퍼드 브릿지"
        datas.add(map)

        map = HashMap()
        map["name"] = "LG 트윈스"
        map["content"] = "서울, 잠실 야구장"
        datas.add(map)

        map = HashMap()
        map["name"] = "대구 FC"
        map["content"] = "대구, DGB 스타디움"
        datas.add(map)

        val adapter = SimpleAdapter(
            this,
            datas,
            android.R.layout.simple_list_item_2,
            arrayOf("name", "content"),
            intArrayOf(android.R.id.text1, android.R.id.text2)
        )

        listView.adapter = adapter
    }
}