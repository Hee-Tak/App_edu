package com.tak.c39

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val intent = Intent(this,DetailActivity::class.java )
            startActivity(intent)

        }
    }
}


/**
 *
 *
 * < C39 내용 >
 * 컴포넌트는 애플리케이션의 구성요소이다
 *
 * 컴포넌트는 시스템에서 라이프사이클이 관리된다.(일반 클래스는 직접 라이프사이클 관리해야)
 *
 * Activity, Service, BroadCastReceiver, ContentProvider
 *
 * Service : 장시간 background
 * BroadCast ... : dlqpsxm ahepf
 * 콘텐츠 프로바이더 : app 간 data 공유
 *
 *
 * 컴포넌트 : 안드로이드 애플리케이션의 아키텍처 요소
 *
 * 인텐트 : 컴포넌트를 이용하기 위한 api 적인 클래스. 컴포넌트를 실행시키기 위해 시스템에 띄우는 메시지 (VO클래스)
 * -> 컴포넌트를 완성시키기 위한 핵심 클래스
 *
 * => 시스템에 Intent 정보를 발생시키고, 시스템에서 정보를 분석해 컴포넌트를 실행
 *
 * => 외부 앱의 컴포넌트도 Intent에 의해 실행
 */