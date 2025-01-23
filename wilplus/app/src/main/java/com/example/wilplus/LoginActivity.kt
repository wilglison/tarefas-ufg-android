package com.example.wilplus
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.login)
        loginButton.setOnClickListener {
            // Lógica de autenticação
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
