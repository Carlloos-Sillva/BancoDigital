package com.example.bancodigital;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ContaCorrente {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    @ColumnInfo(name="Nome")
    private String nome;
    @ColumnInfo(name="Cpf")
    private String cpf;
    @ColumnInfo(name="Email")
    private String email;
    @ColumnInfo(name="Senha")
    private String senha;
    @ColumnInfo(name="Conta")
    private String conta;

}
