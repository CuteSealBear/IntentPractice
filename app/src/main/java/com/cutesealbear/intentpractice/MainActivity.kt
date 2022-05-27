package com.cutesealbear.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)

        }

        sendMessageBtn.setOnClickListener {

//            입력한 내용을 변수에 저장.

            val inputMessage = messageEdt.text.toString()

//            비행기 티켓 발권

            val myIntent = Intent(this, MessageActivity::class.java)

//            수하물 첨부

            myIntent.putExtra("message", inputMessage)

//            실제 출발

            startActivity(myIntent)
        }

        moveToOtherBtn.setOnClickListener {

//            다른 화면으로 이동 (OtherActivity)

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

    }
}