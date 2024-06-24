package com.example.auladados

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CRUDProdutos {

    @Insert
    fun Inserir(objCli : produtos)

    @Delete
    fun Deletar(objCli : produtos)

    @Update
    fun Alterar(objCli : produtos)

    @Query("SELECT * FROM produtos WHERE Descricao = (:DescProd)")
    fun Pesquisar(DescProd : String) : List<produtos>

}