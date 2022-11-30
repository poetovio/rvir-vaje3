package com.example.vaje3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class Home : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        auth = FirebaseAuth.getInstance()

        val imeUporabnika = "Pozdravljeni, " +  intent.getStringExtra("ime")
        val elektronskiNaslov = "Email: " + intent.getStringExtra("mail")

        findViewById<TextView>(R.id.prikazIme).text = imeUporabnika
        findViewById<TextView>(R.id.mailPrikaz).text = elektronskiNaslov

        findViewById<Button>(R.id.iskanjeGumb).setOnClickListener {
            val intent = Intent(this, PrikazPodatkov::class.java)
            intent.putExtra("mesto", findViewById<EditText>(R.id.imeLokacije).text.toString())

            startActivity(intent)
        }

        findViewById<Button>(R.id.odjavaGumb).setOnClickListener {
            auth.signOut()

            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )
        }
    }
}