package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // var é mutavel - val é imutavel
    lateinit var spin : Spinner
    lateinit var numero1 : EditText
    lateinit var numero2 : EditText
    lateinit var calcular : Button
    lateinit var resultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spin = findViewById(R.id.spinner)
        numero1 = findViewById(R.id.edtNumero1)
        numero2 = findViewById(R.id.edtNumero2)
        calcular = findViewById(R.id.btnCalcular)
        resultado = findViewById(R.id.txtResultado)

        var operadores = arrayOf("*","/","+","-")
        spin.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,operadores)

        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var pArray = operadores[position]
                if (pArray.equals("*"))
                {
                    calcular.setOnClickListener { Multiplicar() }
                    var pArray = ""

                } else if (pArray.equals("/")){

                    calcular.setOnClickListener { Dividir() }
                    var pArray = ""

                } else if (pArray.equals("+")){

                    calcular.setOnClickListener { Somar() }
                    var pArray = ""

                } else {

                    calcular.setOnClickListener { Subtrair() }
                    var pArray = ""

                }


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }


        }



    } // fim do one create

    fun Multiplicar(){
        var n1 = Integer.parseInt(numero1.text.toString())
        var n2 = Integer.parseInt(numero2.text.toString())
        var r = n1 * n2
        resultado.setText(r.toString())
    }

    fun Dividir(){
        var n1 = Integer.parseInt(numero1.text.toString())
        var n2 = Integer.parseInt(numero2.text.toString())
        var r = n1 / n2
        resultado.setText(r.toString())
    }

    fun Somar(){
        var n1 = Integer.parseInt(numero1.text.toString())
        var n2 = Integer.parseInt(numero2.text.toString())
        var r = n1 + n2
        resultado.setText(r.toString())
    }

    fun Subtrair(){
        var n1 = Integer.parseInt(numero1.text.toString())
        var n2 = Integer.parseInt(numero2.text.toString())
        var r = n1 - n2
        resultado.setText(r.toString())
    }


} // fim classe