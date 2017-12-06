package com.example.notebookdell.conversaoapp;

/**
 * Created by Notebook Dell on 04/12/2017.
 */

public class Moedas {
    private double valorBitcoin = 13084;

    public String mostrar(Double valor){
        return valor.toString();
    }

    public double dolarBitcoin(Double valor){
        valor = valor / valorBitcoin;
        return valor;
    }
    public double bitcoinDolar(Double valor){
        valor = valor * valorBitcoin;
        return valor;
    }
}
