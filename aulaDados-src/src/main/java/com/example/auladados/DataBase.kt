package com.example.auladados

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [clientes::class, produtos::class, colaboradores::class, fornecedores::class, usuarios::class], exportSchema = false, version = 1)
abstract class DataBase : RoomDatabase(){

    abstract fun getMeuCrudClientes() : CRUDClientes
    abstract fun getMeuCrudProdutos() : CRUDProdutos
    abstract fun getMeuCrudColaboradores() : CURDColaboradores
    abstract fun getMeuCrudFornecedores() : CRUDFornecedores
    abstract fun getMeuCrudUsuarios() : CRUDUsuarios

    companion object{

        var INSTANCE: DataBase? = null
        fun getInstance(context: Context) : DataBase{
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java, "DBase.db"
                ).build()
            }
            return INSTANCE!!
        }

    }
}

