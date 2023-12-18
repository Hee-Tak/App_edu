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


        menuImageView.setOnClickListener{
            Toast.makeText(context, "$title menu click", Toast.LENGTH_SHORT)
                .show()
        }

        return convertView


    }
}