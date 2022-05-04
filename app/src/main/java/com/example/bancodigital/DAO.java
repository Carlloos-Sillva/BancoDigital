package com.example.bancodigital;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DAO {
    @Insert
    void InsereConta(ContaCorrente conta);
    @Delete
    void DeletarConta(ContaCorrente conta);
    @Delete
    void resetListaContas(List<ContaCorrente>conta);

    @Query("SELECT * FROM ContaCorrente")
    List<ContaCorrente> getAll();

    @Query("UPDATE ContaCorrente SET Nome = :Snome WHERE id = :Sid")
    void update(int Sid, String Snome);

    @Query("Select * FROM ContaCorrente WHERE cpf=(:cpfcc) and senha=(:senhacc)")
    ContaCorrente Logar(String cpfcc, String senhacc);

}