package com.example.passagemdedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {

    lateinit var numero : EditText
    lateinit var calcular : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numero = findViewById(R.id.edtNumero_tela1)
        calcular = findViewById(R.id.btnCalcular_tela1)
        calcular.setOnClickListener { VerificarNumero() }
    }

    fun VerificarNumero(){
        val n = Integer.parseInt(numero.text.toString())
        if (n % 2 == 0)
        {
            val b = Bundle()
            b.putString("NUMP",numero.text.toString());
            val intent1 = Intent(this, TelaPar::class.java)
            intent1.putExtras(b)
            startActivity(intent1)
        }else{
            var b = Bundle()
            b.putString("NUMI",numero.text.toString());
            val intent1 = Intent(this, TelaImpar::class.java)
            intent1.putExtras(b)
            startActivity(intent1)
        }
    }
}