package com.cutesealbear.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

//        이 화면에 들어올 때 첨부된 데이터를 텍스트뷰에 반영.

        val intentMessage = intent.getStringExtra("message")

        receivedMessageTxt.text = intentMessage

    }
}