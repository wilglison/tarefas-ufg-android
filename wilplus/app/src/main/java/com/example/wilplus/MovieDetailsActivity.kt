package com.example.wilplus

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val playButton: Button = findViewById(R.id.)
        playButton.setOnClickListener {
            // Lógica para iniciar o filme
        }
    }
}

override fun onResume() {
    super.onResume()
    overridePendingTransition(R.anim.enter, R.anim.exit)
}