package com.example.passagemdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TelaPar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var number : TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_par)
        number = findViewById(R.id.txtValor_PAR)
        val bundle = intent.extras
        val title = bundle!!.getString("NUMP", "Default")
        number.setText(title)
    }
}