package com.example.auladados

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CRUDUsuarios {

    @Insert
    fun Inserir(objCli : usuarios)

    @Delete
    fun Deletar(objCli : usuarios)

    @Update
    fun Alterar(objCli : usuarios)

    @Query("SELECT * FROM Usuarios WHERE Login=(:loginU) and Senha=(:senhaU)")
    fun Logar(loginU : String, senhaU : String?) :usuarios?
}