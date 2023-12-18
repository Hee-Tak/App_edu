package com.tak.c34

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat

class DriveAdapter(cxt: Context, val resId: Int, val datas: MutableList<DriveVO>)
    : ArrayAdapter<DriveVO>(cxt, resId) {

    override fun getCount(): Int {
        return datas.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var convertView = convertView
        if(convertView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                            as LayoutInflater
            convertView = inflater.inflate(resId, null)
            //이용할 수 있는 뷰가 없다라고 하면 xml 파일에 있는대로 객체를 생성해서 쓰겠다

            val holder = DriveHolder(convertView)
            convertView!!.tag = holder

            // 이렇게 태그 붙여놓으면 이후에 이 홀더를 계속 사용할 수 있다.

        }



        //===========================================================================
        // 일단 핵심 기능 및 알고리즘은 아래의 내용임

        val holder = convertView.getTag() as DriveHolder
        val typeImageView = holder.typeImageView
        val titleView = holder.titleView
        val dateView = holder.dateView
        val menuImageView = holder.menuImageView

        val (title, date, type) = datas[position]
        titleView.text = title
        dateView.text = date
        if(type == "doc"){
            typeImageView.setImageDrawable(
                ResourcesCompat.getDrawable(
                    context.resources,
                    R.drawable.ic_type_doc, null
                )
            )
        } else if(type == "file"){
            typeImageView.setImageDrawable(
                ResourcesCompat.getDrawable(
                    context.resources,
                    R.drawable.ic_type_file, null
                )
            )
        } else if(type == "img") {
            typeImageView.setImageDrawable(
                ResourcesCompat.getDrawable(
                    context.resources,
                    R.drawable.ic_type_image, null
                )
            )
        }
        //===========================================================================
        // 얘 까지도 어떻게보면 지금까지의 쉽게 알 수있는 직접적인 그런 기능구현이라 해야하나 그런 위치
        menuImageView.setOnClickListener{
            Toast.makeText(context, "$title menu click", Toast.LENGTH_SHORT)
                .show()
        }

        //===========================================================================

        return convertView


    }

}

/**
 *
 * 솔직히 getView 초반에 inflater 쓰면서 없으면 임의로(?) 새로 만들어서 써먹는거 좀 어려워서 이해안가고
 * 데이터 클래스랑 미리 findViewById로 잡아놓는 클래스 따로 만드는거 자체를 이해하는건 쉬운데
 * 왜 이렇게 까지 나누는가에 대한 필요성에 대한 이해가 잘 안되긴함
 * 근데 핵심은 그게 아니긴하니까 일단 ㅇㅋ...
 *
 * 일단 이런식으로 단순히 리스트 쫙 내려서 하는 리스트어댑터나 심플 어댑터 그런게 아니고서야
 * 이런식으로 임의로 커스텀 어댑터를 만들어줘야한다는 것
 */