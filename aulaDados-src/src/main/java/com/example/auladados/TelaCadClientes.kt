package com.example.auladados

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TelaCadClientes : AppCompatActivity() {

    lateinit var nomes : EditText
    lateinit var cpf : EditText
    lateinit var email : EditText
    lateinit var telefone : EditText
    lateinit var endereco : EditText
    lateinit var gravar : Button
    lateinit var alterar : Button
    lateinit var deletar : Button
    lateinit var ler : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cad_clientes)

        nomes = findViewById(R.id.edtNome)
        cpf = findViewById(R.id.edtCpf)
        email = findViewById(R.id.edtEmail)
        telefone = findViewById(R.id.edtTelefone)
        endereco = findViewById(R.id.edtEndereco)
        gravar = findViewById(R.id.btnGravar)
        alterar = findViewById(R.id.btnAlterar)
        deletar = findViewById(R.id.btnDeletar)
        ler = findViewById(R.id.btnLer)

        gravar.setOnClickListener { InserirDados() }
    }
    @SuppressLint("SuspiciousIndentation")
    fun InserirDados(){
        val objCliente = clientes(null,nomes.text.toString(),cpf.text.toString(),email.text.toString(),telefone.text.toString(),endereco.text.toString())

        GlobalScope.launch {
            DataBase.getInstance(this@TelaCadClientes).getMeuCrudClientes().Inserir(objCliente)
        }
        Toast.makeText(this@TelaCadClientes, "Gravado com Suceso!",Toast.LENGTH_LONG).show()
        nomes.setText("")
        cpf.setText("")
        email.setText("")
        telefone.setText("")
        endereco.setText("")
        nomes.requestFocus()
    }
}