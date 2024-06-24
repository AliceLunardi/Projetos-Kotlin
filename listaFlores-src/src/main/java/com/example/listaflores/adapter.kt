package com.example.listaflores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class adapter : RecyclerView.Adapter<flower>(){

    class floresAdapter(
        var imagemFlorA : Int,
        var tipoFloresA : String,
        var valorFloresA : String,
        var tamanhoFloresA : String
    )

    var floresArray : List<floresAdapter> = listOf(
        floresAdapter(R.drawable.brancoeamarelo, "Buquê Alecrim", "R$ 129,90", "M"),
        floresAdapter(R.drawable.brancoeroxo, "Buquê Amada", "R$ 179,90", "G"),
        floresAdapter(R.drawable.branquinha, "Buquê Branco", "R$ 149,90", "M"),
        floresAdapter(R.drawable.ceu, "Van Ghog", "R$ 229,90", "G"),
        floresAdapter(R.drawable.girassol, "Buquê Girassol", "R$ 119,90", "M"),
        floresAdapter(R.drawable.lirio, "Buquê Lírios", "R$ 79,90", "P"),
        floresAdapter(R.drawable.orquidea, "Orquídea Branca", "R$ 79,90", "P"),
        floresAdapter(R.drawable.rosaamarela, "Buquê Rosa Amarela", "R$ 109,90", "P"),
        floresAdapter(R.drawable.rosaebranco, "Buquê Rosa Vermelha", "R$ 89,90", "P"),
        floresAdapter(R.drawable.rosaerosa, "Buquê Amor Rosa", "R$ 169,90", "G"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): flower {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return flower(view)
    }

    override fun getItemCount(): Int {
        return floresArray.size
    }

    override fun onBindViewHolder(holder: flower, position: Int) {
        holder.imagemFlores.setImageResource(floresArray[position].imagemFlorA)
        holder.tipoFlores.text = floresArray[position].tipoFloresA
        holder.valorFlores.text = floresArray[position].valorFloresA
        holder.tamanhoFlores.text = floresArray[position].tamanhoFloresA
    }


}