package com.howl.myhowl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.howl.myhowl.ui.theme.MyHowlTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyHowlTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }

        var x = 1
        var y = 1
        if(x == 1){
            if(y == 1){

            }
        }
        //레이아웃 설명
        /**
         * LinearLayout : 레이아웃이 일렬로 들어감 / 구현하기 쉽고 많이 쓰임 / 비율로 화면을 구성할 수 있음 / z폴드 같은 폰때문에 이 방식은 옛날방식
         * 기능 -> weight / gravity / orientation
         *
         * RelativeLayout : 상대적인 레이아ㅜㅅ / 구현하기 어렵고 복잡 / 디자인 구성이 다양
         * 기능 -> alignparent / align / to[방향]of , below, above
         *
         * ConstraintLayout : 위의 둘의 특성을 가짐 / ui툴로 인한 사용법이 편리 / 다양한 화면에서 구현 가능 / 베타버전 느낌이 강함
         * 기능 -> widget(edittext, textView, Imageview, button, recyclerview(grid, list(linearLayout manager), viewPager, Spinner(드롭박스), Dialog, TimePicker, DatePicker, Mapview, Webview,...)
         * imageview
         * : matric : 현재 사이즈 그대로 왼쪽 상단부터 채우면서 이미지를 표현
         * : fitxy : 이미지를 이미지뷰에 높이와 넓이를 맞춤 / 비슷한거 : fitStart, fitCenter, fitEnd -> 이미지를 이미지뷰의 폭을 맞춘 후 Start->상단, Center->중앙 End->하단
         * : center : 이미지 중앙으로 이동
         * : CenterCrop : 이미지를 높이를 이미지 뷰에 맞춘 후 중앙으로 옮김
         * : CenterInside : 이미지가 이미지뷰보다 클 경우 fitCenter 작을 경우 Center 적용 효과
         *
         * Progress bar -> 로딩
         * ScrollView
         * SeekBar -> 음량조절 바 생각
         * videoView
         * surfaceView -> 이거도 영상관련인듯. 근데 영상뿐만아니라 뭐 버튼 세세히 만들때?
         * Dialog -> 액티비티 위에 조그만한 창을 더 띄울때
         * MapFragment -> 맵을 보여주는 프래그먼트 -> 구글맵 씀 -> 근데 지금은 유료화돼서 요샌 걍 안쓰는듯 . 굳이쓸려면 네이버/카카오 지도 쪽 쓰는듯
         */


    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyHowlTheme {
        Greeting("Android")
    }
}