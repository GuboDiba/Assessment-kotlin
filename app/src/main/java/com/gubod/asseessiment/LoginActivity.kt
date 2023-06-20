package com.gubod.asseessiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gubod.asseessiment.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnlog.setOnClickListener {
            validateContact()
        }

    }

    fun validateContact(){
        val name = binding.etUsername.text.toString()
        val password=binding.etpassword.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilUsername.error = "Name field cannot be empty"
            error = true
        }
        if (name.isBlank()){
            binding.tilpassword.error = "Name field cannot be empty"
            error = true
        }

        if (!error){
            Toast.makeText(this, "login Successfully added", Toast.LENGTH_LONG).show()
        }
    }
}