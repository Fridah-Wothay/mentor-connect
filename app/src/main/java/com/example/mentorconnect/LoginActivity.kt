package com.example.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mentorconnect.databinding.ActivityLoginBinding
import com.example.mentorconnect.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idRegister.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            validateLogin()
        }
    }

    fun validateLogin() {
        var formErr = false

        val userName = binding.etUserName.text.toString()
        if(userName.isBlank()) {
            formErr =true
            binding.tillUserName.error = "Username required"
        }
        val password = binding.etConfirmPassword.text.toString()
        if(password.isBlank()) {
            formErr =true
            binding.tillConfirmPasssword.error = "Password is  required"
        }


    }
}
