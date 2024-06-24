package com.example.auladados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "USUARIOS")
data class usuarios(
    @PrimaryKey(true)

    @ColumnInfo(name = "ID")
    val id : Int?,

    @ColumnInfo(name = "Login")
    @NotNull
    val login : String,

    @ColumnInfo(name = "Senha")
    @NotNull
    val senha : String,

    @ColumnInfo(name = "Perfil")
    @NotNull
    var perfil : String

)
