package com.malika.projek1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tampilan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan2)

        val btnNext: Button = findViewById(R.id.button)
        val btnPindah: Button = findViewById(R.id.button2)


        btnPindah.setOnClickListener {
            val intent = Intent(this, Tampilan3::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}