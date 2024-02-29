package com.example.sentotp_firbase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.Firebase

class MainActivity : AppCompatActivity() {

    lateinit var userEdit:EditText
    lateinit var btnSendOtp :Button
    lateinit var veryCodeEdit:EditText
    lateinit var btnVeryfyotp:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userEdit = findViewById(R.id.editNumber_EditText)
        btnSendOtp = findViewById(R.id.btn_SendOTP_Button)
        veryCodeEdit = findViewById(R.id.btn_vryfyOTP_EditText)
        btnVeryfyotp = findViewById(R.id.btn_veryfy_Button)
    }
}