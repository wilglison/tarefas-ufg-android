package com.example.wilplus

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        setupViews()
    }

    private fun setupViews() {
        val playButton: Button = findViewById(R.id.button)
        val addButton: ImageView = findViewById(R.id.imageView19)
        val downloadButton: ImageView = findViewById(R.id.imageView20)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val bottomNav: BottomNavigationView = findViewById(R.id.naveg)

        playButton.setOnClickListener {
            // Play movie logic
        }

        addButton.setOnClickListener {
            // Add to list logic
        }

        downloadButton.setOnClickListener {
            // Download logic
        }

        bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                // Handle navigation
            }
            true
        }
    }

    override fun onResume() {
        super.onResume()
        //overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
    }
}