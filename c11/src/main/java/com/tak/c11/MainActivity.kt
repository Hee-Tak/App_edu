package com.tak.c11

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        val name = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "Hitak"
        }

        val image = ImageView(this).also{
            it.setImageDrawable(ContextCompat.getDrawable(
                this, R.drawable.logo_1
            ))
        }

        val title = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "JetPack 과 Kotlin 을 활용한 Android App 개발"
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL     //세로 방향
            gravity = Gravity.CENTER                //센터 정렬
            addView(name, WRAP_CONTENT, WRAP_CONTENT)
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(title, WRAP_CONTENT, WRAP_CONTENT)
        }
        //setContentView(R.layout.activity_main)
        setContentView(layout)

         */

        setContentView(R.layout.activity_main) //뷰와 관련해서는 일반적으로 xml 파일 이용

        val textView1: TextView = findViewById(R.id.text2) //얘로 뷰 객체 획득해서 사용 가능
    }
}