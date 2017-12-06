package com.example.notebookdell.conversaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMedida, btnMoeda, btnTangente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMedida = (Button)findViewById(R.id.btnMedida);
        btnMoeda = (Button)findViewById(R.id.btnMoedas);
        btnTangente = (Button)findViewById(R.id.btnTangente);

        btnMedida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, MedidasActivity.class);
                MainActivity.this.startActivity(intencao);
            }
        });

        btnMoeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, MoedasActivity.class);
                MainActivity.this.startActivity(intencao);
            }
        });

        btnTangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, TangenteActivity.class);
                MainActivity.this.startActivity(intencao);
            }
        });
    }

}
