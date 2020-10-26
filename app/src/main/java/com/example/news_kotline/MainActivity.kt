package com.example.news_kotline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var loginBtn:Button
    lateinit var RegisterBtn:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.UserId);
        password= findViewById(R.id.password);
        loginBtn = findViewById(R.id.logInBtn);
        RegisterBtn=findViewById(R.id.Registerbtn);

       loginBtn.setOnClickListener {
           var email =email.text
           var password= password.text
           Toast.makeText(this,"email ${email} password ${password}",Toast.LENGTH_SHORT).show();

       }
        RegisterBtn.setOnClickListener {
            val intent = Intent(this@MainActivity,Register::class.java);
            startActivity(intent);
        }
    }


}