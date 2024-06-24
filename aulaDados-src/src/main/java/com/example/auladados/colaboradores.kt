package com.example.auladados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "COLABORADORES")
data class colaboradores(
    @PrimaryKey(true)

    @ColumnInfo(name = "ID")
    val id : Int?,

    @ColumnInfo(name = "Nome")
    @NotNull
    val nome : String,

    @ColumnInfo(name = "Cpf")
    @NotNull
    val cpf : String,

    @ColumnInfo(name = "Email")
    @NotNull
    var email : String,

    @ColumnInfo(name = "Endereço")
    @NotNull
    var emdereco : String,

    @ColumnInfo(name = "Salario")
    @NotNull
    var salario : Double,

    @ColumnInfo(name = "cargo")
    @NotNull
    var cargo : String
)
