package com.example.auladados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "TESTE@")
data class teste2(
    @PrimaryKey(true)

    @ColumnInfo(name = "ID")
    val id : Int?,

    @ColumnInfo(name = "Nome")
    @NotNull
    val nome : String,

    @ColumnInfo(name = "Cpf")
    @NotNull
    val cpf : String,

    @ColumnInfo(name = "Peso")
    @NotNull
    var peso : Double,

    @ColumnInfo(name = "Complemento")
    @NotNull
    var complemento : Double
)
