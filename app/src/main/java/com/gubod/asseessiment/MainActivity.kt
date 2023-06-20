package com.gubod.asseessiment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gubod.asseessiment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
    override fun onResume() {
        super.onResume()

        binding. tvRegister.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnlogin.setOnClickListener {
            validateSignUp()
        }
    }
    fun validateSignUp() {
        val firstName = binding.etusername.text.toString()
        val lastName = binding.etPhoneNumber.text.toString()
        val pass = binding.etEmail.text.toString()
        val confirmPassword = binding.etPassword.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false

        if (firstName.isBlank()) {
            binding.tilUsername.error = "User name is required"
            error = true
        }
        if (lastName.isBlank()) {
            binding.tilPhoneNumber.error = "Phone number is required"
            error = true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (pass.isBlank()) {
            binding.tillPassword.error = "Password is required"
            error = true
        }
        if (!error) {
            Toast.makeText(this,"REGISTERED SUCCESSFULLY", Toast.LENGTH_LONG).show()

        }

    }
}
