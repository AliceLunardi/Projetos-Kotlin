package com.example.auladados

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface CRUDClientes {

    @Insert
    fun Inserir(objCli : clientes)

    @Delete
    fun Deletar(objCli : clientes)

    @Update
    fun Alterar(objCli : clientes)

    @Query("SELECT * FROM clientes WHERE Cpf = (:cpfCli)")
    fun Pesquisar(cpfCli : String) : List<clientes>

}