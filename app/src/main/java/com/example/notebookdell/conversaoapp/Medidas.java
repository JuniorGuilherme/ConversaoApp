package com.example.notebookdell.conversaoapp;

import android.widget.RadioButton;

/**
 * Created by Notebook Dell on 29/11/2017.
 */

public class Medidas {

    public String mostrar(Double dados){
        return dados.toString();
    }

    public double milhasPes(Double dados){
        dados = dados * 5280;
        return dados;
    }
    public double milhasQuilometros(Double dados){
        dados = dados * 1.61;
        return dados;
    }
    public double pesMilhas(Double dados){
        dados = dados * 0.000189394;
        return dados;
    }
    public double pesQuilometros(Double dados){
        dados = dados * 0.0003048;
        return dados;
    }
    public double quilometrosPes(Double dados){
        dados = dados * 3280.84;
        return dados;
    }
    public double quilometrosMilhas(Double dados){
        dados = dados * 0.621371;
        return dados;
    }
}
