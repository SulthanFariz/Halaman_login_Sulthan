package com.example.latihanpertama

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    lateinit var btnlogin:Button
    lateinit var etEmail:EditText
    lateinit var email:String
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_linear)

        btnlogin = findViewById(R.id.btn_login)

        etEmail = findViewById(R.id.et_email)

        btnlogin.setOnClickListener{
            email = etEmail.text.toString()
            if (email.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "ups...! email masih kosong", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, email, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
