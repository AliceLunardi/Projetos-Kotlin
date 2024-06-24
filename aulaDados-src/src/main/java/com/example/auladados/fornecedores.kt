package com.example.auladados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "Fornecedores")
data class fornecedores(
    @PrimaryKey(true)

    @ColumnInfo(name = "ID")
    val id : Int?,

    @ColumnInfo(name = "Nome")
    @NotNull
    val nome : String,

    @ColumnInfo(name = "Cnpj")
    @NotNull
    val cnpj : String,

    @ColumnInfo(name = "Email")
    @NotNull
    var email : String,

    @ColumnInfo(name = "inscEstadual")
    @NotNull
    var inscestadual : String,

    @ColumnInfo(name = "Endereço")
    @NotNull
    var emdereco : String

)
