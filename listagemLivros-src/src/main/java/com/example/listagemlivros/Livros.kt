package com.example.listagemlivros

import android.view.View
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class Livros (view : View) : RecyclerView.ViewHolder(view) {

    var imagemLivroL : ImageView = view.findViewById(R.id.imagemLivro)
    var anoPublicacaoL : TextView = view.findViewById(R.id.txtAnoPublicacao)
    var EditoraL : TextView = view.findViewById(R.id.txtEditora)
    var PrecoL : TextView = view.findViewById(R.id.txtPreco)
}