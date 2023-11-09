package com.example.projectuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectuts.databinding.ActivityChangeBinding
import com.example.projectuts.databinding.ActivityProfileBinding

class ChangeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEdit.setOnClickListener {
            callActivity()

        }
    }

    private fun callActivity(){
        val message = binding.email2Profile.text.toString()
        val message1 = binding.nama2Profile.text.toString()
        val message2 = binding.no2Profile.text.toString()
        val message3 = binding.matkul2.text.toString()

        val intent = Intent(this, ProfileActivity::class.java).also {
            it.putExtra("Email", message)
            it.putExtra("Nama", message1)
            it.putExtra("Kelas", message2)
            it.putExtra("Mata Kuliah", message3)
            startActivity(it)
        }

    }
}