package com.tak.c33

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    val todos = mutableListOf<String>()
    lateinit var adapter: ArrayAdapter<String>
    lateinit var listView: ListView
    lateinit var editText: EditText
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById(R.id.main_list)
        editText = findViewById(R.id.edit)
        button = findViewById(R.id.button)

        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            todos
        )
        listView.adapter = adapter

        listView.setOnItemClickListener{ adapterView, view, i, l ->         //이벤트 콜백 함수
            AlertDialog.Builder(this)       //다이얼로그로 묻는거
                .setTitle("remove todo")
                .setPositiveButton("OK"){dialog, which ->       //이벤트 처리
                    todos.removeAt(i)
                    adapter.notifyDataSetChanged()  //반영하라
                }
                .setNegativeButton("Cancel", null)
                .create()
                .show()

        }
        button.setOnClickListener {
            todos.add(editText.text.toString())
            editText.text.clear()
            adapter.notifyDataSetChanged()
        }

    }
}


/**
 * 리스트뷰 -> 항목의 동적 추가제거 용이
 *
 */