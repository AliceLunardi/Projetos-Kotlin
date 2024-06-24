package com.example.listagemlivros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adaptador : RecyclerView.Adapter<Livros>() {

    class livrosAdapter(
        var imagemLivrosA : Int,
        var AnoPublicacaoA : String,
        var EditoraA : String,
        var PrecoA : String
    )

    var livroArray : List<livrosAdapter> = listOf(
        livrosAdapter(R.drawable.algoritmo, "2022", "LTC", "299"),
        livrosAdapter(R.drawable.ccharp, "2021", "Novatec", "399"),
        livrosAdapter(R.drawable.chat, "2019", "Novatec", "499"),
        livrosAdapter(R.drawable.apaixonese, "2023", "Novatec", "199"),
        livrosAdapter(R.drawable.js, "2023", "Novatec", "359"),
        livrosAdapter(R.drawable.charplivro, "2021", "Novatec", "119"),
        livrosAdapter(R.drawable.codigolimpo, "2024", "Novatec", "99"),
        livrosAdapter(R.drawable.engenharia, "2021", "Bookman", "199"),
        livrosAdapter(R.drawable.html, "2020", "AltaBooks", "199"),
        livrosAdapter(R.drawable.kotlinandroid, "2023", "Novatec", "499"),
        livrosAdapter(R.drawable.padroes, "2019", "Novatec", "199"),
        livrosAdapter(R.drawable.pythonlivro, "2023", "Novatec", "349"),
        livrosAdapter(R.drawable.scrum, "2023", "Novatec", "219"),
        livrosAdapter(R.drawable.type, "2024", "O'REILLY", "209"),
        livrosAdapter(R.drawable.sql, "2018", "Novatec", "199"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Livros {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.cartao, parent, false)
        return Livros(view)
    }

    override fun getItemCount(): Int {
        return livroArray.size
    }

    override fun onBindViewHolder(holder: Livros, position: Int) {
        holder.imagemLivroL.setImageResource(livroArray[position].imagemLivrosA)
        holder.anoPublicacaoL.text = livroArray[position].AnoPublicacaoA
        holder.PrecoL.text = livroArray[position].PrecoA
    }
}