package com.example.auladados

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CRUDFornecedores {

    @Insert
    fun Inserir(objForn : fornecedores)

    @Delete
    fun Deletar(objForn : fornecedores)

    @Update
    fun Alterar(objForn : fornecedores)

    @Query("SELECT * FROM fornecedores WHERE Cnpj = (:cnpjForn)")
    fun Pesquisar(cnpjForn : String) : List<fornecedores>

}