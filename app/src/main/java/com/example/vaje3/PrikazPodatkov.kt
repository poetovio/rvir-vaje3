package com.example.vaje3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrikazPodatkov : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prikaz_podatkov)

        val mesto = intent.getStringExtra("mesto")

        findViewById<Button>(R.id.tedenGumb).setOnClickListener {

        }

        findViewById<Button>(R.id.gumbNazaj).setOnClickListener {
            startActivity(
                Intent(
                    this,
                    Home::class.java
                )
            )
        }
    }
}