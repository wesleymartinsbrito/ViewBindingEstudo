package com.example.estudoviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.estudoviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var contador: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        this.binding.btnContador.setOnClickListener {

            contador++

            this.binding.tvContador.text = "Contador $contador"
        }
    }
}