package com.example.notebookdell.conversaoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TangenteActivity extends AppCompatActivity {
    TextView txtTangente;
    Button btnCalcularTangente;
    EditText etAngulo;
    Tangente t = new Tangente();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangente);

        txtTangente = findViewById(R.id.txtTangente);
        btnCalcularTangente = findViewById(R.id.btnCalcularTangente);
        etAngulo = findViewById(R.id.etAngulo);

        btnCalcularTangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etAngulo.getText().length()!=0){
                    txtTangente.setText(t.mostrar(t.tangente(Double.parseDouble(etAngulo.getText().toString()))));
                }
            }
        });
    }

}
