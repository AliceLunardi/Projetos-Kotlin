package com.example.auladados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "TESTE")

class teste {
    @PrimaryKey(true)

    @ColumnInfo(name = "ID")
    @NotNull
    val id : Int = 0

    @ColumnInfo(name = "Nome")
    @NotNull
    val nome : String = ""

    @ColumnInfo(name = "Cpf")
    @NotNull
    val cpf : String = ""

    @ColumnInfo(name = "Peso")
    @NotNull
    var peso : Double = 0.0

    @ColumnInfo(name = "Complemento")
    @NotNull
    var complemento : Double = 0.0

}