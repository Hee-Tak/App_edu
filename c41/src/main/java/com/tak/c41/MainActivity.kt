package com.tak.c41

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_list)
        val datas = arrayOf<String>("android", "kotlin", "jetpack")
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            datas
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", i)
            intent.putExtra("title", datas[i])
            startActivity(intent)

        }
    }
}

/**
 * Extra Data
 *  Intent로 컴포넌트를 실행시키면서 데이터를 전달하는 방법
 *  Intent에 데이터를 담아서 전달
 *
 *  public Intent putExtra(String name, CharSequence value)
 *
 *  Extra 데이터 획득은 컴포넌트를 실행시킨 Intent 객체를 획득해서 얻는다.
 *
 *  getIntExtra, getStringExtra, getDoubleExtra...
 */