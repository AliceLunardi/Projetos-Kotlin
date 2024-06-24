package com.example.aulakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView2)
        variaveis()

    }

    fun variaveis(){
        val short : Short = 1
        println(short.toShort())
        val int : Int = 1
        println(int)
        val long : Long = 1
        println(Long)
        val float : Float = 1.0f
        println(float)
        val double : Double = 1.0
        println(double)
        val byte : Byte = 1
        println(byte) //println imprime no console
        println("%.2f".format(29.0 / 10.0)+"\n"+"$float")
        println("O valor é: "+"$int")
        println("Raiz")
        var x : Double = sqrt(36.0)
        println(x)
        var y : Double = PI
        println("%.2f".format(y))
        val max = max(3,2)
        println(max)
        val min = min(3,2)
        println(min)

        Toast.makeText(this, "${byte}", Toast.LENGTH_LONG).show()
        texto.setText(byte.toString())
    }
}