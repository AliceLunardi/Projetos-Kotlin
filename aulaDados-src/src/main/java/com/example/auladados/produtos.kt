package com.example.auladados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "PRODUTOS")
data class produtos(
    @PrimaryKey(true)

    @ColumnInfo(name = "ID")
    val id : Int?,

    @ColumnInfo(name = "Descricao")
    @NotNull
    val descricao : String,

    @ColumnInfo(name = "Preco")
    @NotNull
    val preco : Double,

    @ColumnInfo(name = "Estoque")
    @NotNull
    var estoque : Int
)
