package com.example.bancodigital;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ContaCorrente.class},version = 1,exportSchema = false)
public abstract class BaseDados extends RoomDatabase {
    // CRIANDO A INSTANCIA
    private static BaseDados database;
    // CRIANDO O METODO DE ACESSO A CLASSE DAO
    public abstract DAO getDAO();
    // MODELO Singleton
    public static BaseDados getInstance(Context context){
        if (database==null){
            synchronized (BaseDados.class){
                if(database==null){
                    //CRIANDO O BANCO DE DADOS
                    database= Room.databaseBuilder(context.getApplicationContext(),
                            BaseDados.class,"BancoCC").allowMainThreadQueries()
                            .build();
                }
            }
        }
        return database;
    }
}
