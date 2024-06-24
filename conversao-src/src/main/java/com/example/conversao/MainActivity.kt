package com.example.conversao

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numDecimal = findViewById<EditText>(R.id.valorDecimal)
        var btn = findViewById(R.id.btnConverter) as Button
        val resultadoBinario = findViewById<TextView>(R.id.txtResultado)

        btn.setOnClickListener {
            val decimalStr = numDecimal.text.toString()
            if (decimalStr.isNotEmpty()) {
                val decimal = decimalStr.toInt()
                val binario = conversaoBinarioParaDecimal(decimal)
                resultadoBinario.text = "O número decimal $decimal em binário é $binario"
            } else {
                resultadoBinario.text = "Por favor, insira um número decimal válido"
            }
        }
    }


    private fun conversaoBinarioParaDecimal(decimal: Int): String {
        return Integer.toBinaryString(decimal)
    }


}