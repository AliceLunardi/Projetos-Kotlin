package com.example.auladados

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CURDColaboradores {
    @Insert
    fun Inserir(objCo : colaboradores)

    @Delete
    fun Deletar(objCo : colaboradores)

    @Update
    fun Alterar(objCo : colaboradores)

    @Query("SELECT * FROM colaboradores WHERE Cpf = (:cpfColab)")
    fun Pesquisar(cpfColab : String) : List<colaboradores>

}