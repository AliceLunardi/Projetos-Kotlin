package com.example.layout_aula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var criaTela : TextView
    lateinit var login : EditText
    lateinit var senha : EditText
    lateinit var logar : Button
    lateinit var irConta : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        criaTela = findViewById(R.id.txtCriar)

        criaTela.setOnClickListener { chamaTela() }

        login = findViewById(R.id.edtLogin)
        senha = findViewById(R.id.edtSenha)
        logar = findViewById(R.id.btnLogar)
        irConta = findViewById(R.id.txtCriar)
        irConta.setOnClickListener { chamaTela() }
        logar.setOnClickListener { validaLogin() }
    }

    fun chamaTela(){
        var intent = Intent(this,TelaCadastro::class.java)
        startActivity(intent)
    }

    fun validaLogin(){
        if(login.text.toString().equals("Aluno") && senha.text.toString().equals("123456"))
        {
            Toast.makeText(this, "LOGIN EFETUADO COM SUCESSO", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"LOGIN INVALIDO", Toast.LENGTH_LONG).show()
            login.requestFocus()
            login.setText("")
            senha.setText("")
        }
    }
}



