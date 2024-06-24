package com.example.listaflores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var reciclador : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reciclador = findViewById(R.id.reciclador)
        reciclador.adapter = adapter()
        reciclador.layoutManager = LinearLayoutManager(this)
    }

}