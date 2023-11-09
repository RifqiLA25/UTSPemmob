package com.example.projectuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.projectuts.databinding.ActivityProfileBinding


class ProfileActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("Email")
        val message1 = intent.getStringExtra("Nama")
        val message2 = intent.getStringExtra("Kelas")
        val message3 = intent.getStringExtra("Mata Kuliah")


        val namalengkap = findViewById<TextView>(R.id.nama2_profile).apply {

            text = message
        }
        val email = findViewById<TextView>(R.id.email2_profile).apply {

            text = message1
        }
        val kelas = findViewById<TextView>(R.id.no2_profile).apply {

            text = message2
        }
        val matakuliah = findViewById<TextView>(R.id.matkul2).apply {

            text = message3
        }


        binding.btnEdit.setOnClickListener {
            val intent = Intent(this, ChangeActivity::class.java)
            startActivity(intent)
        }

    }
}