package com.example.projectuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuAwal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_awal)
    }

    fun onLoginButtonClick(view : View){
        val intent = Intent (this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun onRegisterClick(view: View){
        val intent = Intent ( this, RegisterActivity::class.java)
        startActivity(intent)
    }
}