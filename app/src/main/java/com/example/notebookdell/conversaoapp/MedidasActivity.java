package com.example.notebookdell.conversaoapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MedidasActivity extends AppCompatActivity {
    RadioButton deMilhas, deQuilometros, dePes, paraMilhas, paraQuilometros, paraPes;
    Button btnCalcular;
    EditText dados;
    TextView result;
    Medidas c = new Medidas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medidas);

        deMilhas = (RadioButton)findViewById(R.id.deMilhas);
        dePes = (RadioButton)findViewById(R.id.dePes);
        deQuilometros = (RadioButton)findViewById(R.id.deQuilometros);
        paraMilhas = (RadioButton)findViewById(R.id.paraMilhas);
        paraPes = (RadioButton)findViewById(R.id.paraPes);
        paraQuilometros = (RadioButton)findViewById(R.id.paraQuilometros);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        dados = (EditText)findViewById(R.id.dados);
        result = (TextView)findViewById(R.id.txtResult);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dados.getText().length()!=0) {
                    double conversivel = Double.parseDouble(dados.getText().toString());

                    if (deMilhas.isChecked()) {
                        if (paraPes.isChecked()) {
                            result.setText(c.mostrar(c.milhasPes(conversivel)));
                        } else if (paraQuilometros.isChecked()) {
                            result.setText(c.mostrar(c.milhasQuilometros(conversivel)));
                        } else {
                            result.setText(c.mostrar(conversivel));
                        }
                    } else if (dePes.isChecked()) {
                        if (paraMilhas.isChecked()) {
                            result.setText(c.mostrar(c.pesMilhas(conversivel)));
                        } else if (paraQuilometros.isChecked()) {
                            result.setText(c.mostrar(c.pesQuilometros(conversivel)));
                        } else {
                            result.setText(c.mostrar(conversivel));
                        }
                    } else if (deQuilometros.isChecked()) {
                        if (paraPes.isChecked()) {
                            result.setText(c.mostrar(c.quilometrosPes(conversivel)));
                        } else if (paraMilhas.isChecked()) {
                            result.setText(c.mostrar(c.quilometrosMilhas(conversivel)));
                        } else {
                            result.setText(c.mostrar(conversivel));
                        }
                    }
                }else{
                    Context contexto = getApplicationContext();
                    int duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(contexto, "Insira o valor a ser convertido." ,duracao);
                    toast.show();
                }
            }
        });
    }
}
