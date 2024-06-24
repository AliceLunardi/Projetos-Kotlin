package com.example.listaflores

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class flower (view : View) : RecyclerView.ViewHolder(view) {

    var imagemFlores : ImageView = view.findViewById(R.id.imagemFlor)
    var tipoFlores : TextView = view.findViewById(R.id.lblTipo)
    var valorFlores : TextView = view.findViewById(R.id.lblValor)
    var tamanhoFlores : TextView = view.findViewById(R.id.lblTamanho)

}