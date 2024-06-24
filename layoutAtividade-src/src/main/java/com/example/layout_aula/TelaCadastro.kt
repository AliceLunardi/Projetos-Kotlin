package com.example.layout_aula

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TelaCadastro : AppCompatActivity() {

    // CRIANDO VARIAVEIS GLOBAIS
    lateinit var loginConta : EditText
    lateinit var senhaConta : EditText
    lateinit var cadastrarConta : Button
    lateinit var voltarConta : TextView
    lateinit var loginArmazenado : TextView
    lateinit var senhaArmazenado : TextView
    lateinit var loadArmazenado : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)

        //FAZENDO A JUNÇÃO DOS COMPONENTES NO XML COM O KT
        loginConta = findViewById(R.id.edtloginCadastro)
        senhaConta = findViewById(R.id.edtsenhaCadastro)
        cadastrarConta = findViewById(R.id.btnGravarCadastro)
        voltarConta = findViewById(R.id.txtVoltarCadastro)
        loginArmazenado = findViewById(R.id.txt_loginArmazenado)
        senhaArmazenado = findViewById(R.id.txt_senhaArmazenada)
        loadArmazenado = findViewById(R.id.btn_load)
        var guardar = getSharedPreferences("Dados", Context.MODE_PRIVATE)
        var editar = guardar.edit()

        cadastrarConta.setOnClickListener{
            editar.apply {
                putString("LOGIN", loginConta.text.toString())
                putString("SENHA", senhaConta.text.toString())
                apply()
            }
        }

        loadArmazenado.setOnClickListener {
            var login = guardar.getString("LOGIN", null)
            var senha = guardar.getString("SENHA", null)
            loginArmazenado.setText(login)
            senhaArmazenado.setText(senha)

        }

        voltarConta.setOnClickListener { chamatela() }

    } // fim do onecreate

    fun chamatela(){
        startActivity(Intent(this,MainActivity::class.java))
    }
}