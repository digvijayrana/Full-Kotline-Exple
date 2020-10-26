package com.example.news_kotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : AppCompatActivity() {
    lateinit var  name:EditText
    lateinit var  email:EditText
    lateinit var  phone:EditText
    lateinit var  password:EditText
    lateinit var  RegisterBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        name=findViewById(R.id.UserName);
        email=findViewById(R.id.UserId);
        phone=findViewById(R.id.UserPhone);
        password=findViewById(R.id.Registerpassword);
        RegisterBtn=findViewById(R.id.RegisterBtn)

        RegisterBtn.setOnClickListener {
            var name = name.text
            var email = email.text
            var phone = phone.text
            var password= password.text

            Toast.makeText(this,"name = ${name}  email= ${email} phone= ${phone} password =${password}",Toast.LENGTH_SHORT).show();

        }


    }
}