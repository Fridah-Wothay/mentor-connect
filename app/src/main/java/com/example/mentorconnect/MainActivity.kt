package com.example.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mentorconnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            validateRegistration()
        }
    }

    fun validateRegistration() {
        var formError = false
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tilFirstName.error = "First name is required"

        }
        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()) {
            formError = true
            binding.tilLastName.error = "LastName is required"

        }
        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            formError = true
            binding.tillEmail.error = "email is required"

        }
        val codeHiveid = binding.etcodehiveid.text.toString()
        if (codeHiveid.isBlank()) {
            formError = true
            binding.tilCodehiveid.error = "codehiveid is required"

        }
        val username = binding.etusername.text.toString()
        if (username.isBlank()) {
            formError = true
            binding.tilUsername.error = "username is required"

        }
        val password = binding.etpassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tilpassword.error = "password is required"

        }
        val confirmPassword = binding.etconfirmpassword.text.toString()
        if (confirmPassword.isBlank()) {
            formError = true
            binding.tilconfirmpassword.error = "confirmpassword is required"

        }

    }
}