package com.example.uitask

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uitask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    binding.SignupBtn.setOnClickListener {
      val username = binding.editTextText.text.toString()
      val email = binding.editTextText2.text.toString()
      val password = binding.editTextText3.text.toString()
      val conPassword = binding.confirmPassword.text.toString()
        if (username.isEmpty()||email.isEmpty()||password.isEmpty()||conPassword.isEmpty()){
            Toast.makeText(this, "Fill Details", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Reistration Sccessful", Toast.LENGTH_SHORT).show()
        }
    }

    }
}