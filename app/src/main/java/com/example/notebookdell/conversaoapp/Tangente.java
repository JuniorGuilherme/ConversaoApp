package com.example.notebookdell.conversaoapp;

/**
 * Created by Notebook Dell on 04/12/2017.
 */

public class Tangente {
    public double tangente(Double angulo){
        double tangente;
        tangente = Math.tan((angulo*2*Math.PI) / 360);
        return tangente;
    }

    public String mostrar(Double t){
        return t.toString();
    }
}
