package com.example.appreceitas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var user: EditText
    lateinit var pass: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        user = findViewById(R.id.userid)
        pass = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            if (user.text.toString().equals("henrique") &&
                pass.text.toString().equals("123")
            ) {
                Toast.makeText(this, "foi", Toast.LENGTH_LONG).show()
                var intent = Intent(applicationContext, telaPrincipal::class.java)
                startActivity(intent)
            }
        }
    }
}