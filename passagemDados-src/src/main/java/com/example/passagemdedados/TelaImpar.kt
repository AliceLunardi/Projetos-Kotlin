package com.example.passagemdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TelaImpar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var number : TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_impar)
        number = findViewById(R.id.txtValor_IMPAR)
        val bundle = intent.extras
        val title = bundle!!.getString("NUMI", "Default")
        number.setText(title)
    }
}