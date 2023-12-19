package com.tak.c42

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    lateinit var resultView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        resultView = findViewById(R.id.resultView)


        //============================================================================
        button1.setOnClickListener {

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", "first")
            startActivityForResult(intent, 10)
        }
        //============================================================================

        val resultLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()) {
            resultView.text = "result: ${it.data?.getStringExtra("result")}"
        }

        button2.setOnClickListener {

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", "second")
            resultLauncher.launch(intent)
        }
        //============================================================================

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 10 && resultCode == Activity.RESULT_OK){
            val result: String? = data?.getStringExtra("result")
            resultView.text = "result : $result"
        }

    }




}

/**
 * Activity Result
 *
 * Extra Data와는 거꾸로 생각해서
 * 액티비티를 실행시킨 다음에 되돌아왔을 때 되돌려받는 데이터라고 생각하면 됨
 *
 *
 *
 * Intent로 액티비티를 실행시키고 결과를 되돌려 받는 두 가지 방법
 * startActivityForResult() 함수 이용 (deprecated)  => 고꾸라진 방법이긴하나 많이 쓰이고 많이들 알고있다 (11버전 이전)
 * ActivityResultLauncher
 */

/**
 *
 * startActivityForResult
 *
 * public void startActivity(Intent intent)
 * public void startActivityForResult(Intent intent, int requestCode)
 */


/**
 * ActivityResultLauncher
 *
 * 액티비티를 실행시키고 실행 결과를 획득
 *
 * 퍼미션 조정 결과 획득
 */

/**
 * 결과 되돌리기
 * Intent의 Extra Data에 데이터를 추가해서 결과 데이터 전달
 * setResult() 로 상태 등록
 */