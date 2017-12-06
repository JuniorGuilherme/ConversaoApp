package com.example.notebookdell.conversaoapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MoedasActivity extends AppCompatActivity {
    EditText etDolar, etBitcoin;
    Button btnConverter;
    Moedas m = new Moedas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moedas);

        etBitcoin = (EditText)findViewById(R.id.etBitcoin);
        etDolar = (EditText)findViewById(R.id.etDolar);
        btnConverter = (Button)findViewById(R.id.btnConverter);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etBitcoin.getText().length()==0 && etDolar.getText().length() ==0) {
                    Context contexto = getApplicationContext();
                    int duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(contexto, "Insira valores em um dos campos." ,duracao);
                    toast.show();
                    etDolar.setText("");
                    etBitcoin.setText("");
                }else if(etBitcoin.getText().length()!=0 && etDolar.getText().length() !=0){
                    Context contexto = getApplicationContext();
                    int duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(contexto, "Insira valores apenas em um dos campos." ,duracao);
                    toast.show();
                    etDolar.setText("");
                    etBitcoin.setText("");
                }else{
                    if (etBitcoin.getText().length() != 0 && etDolar.getText().length() == 0) {
                        etDolar.setText(m.mostrar(m.bitcoinDolar(Double.parseDouble(etBitcoin.getText().toString())))); // Converte texto da EditText em Double, envia para funcao de conversao e envia para a funcao mostrar que converte double em texto novamente.
                    } else {
                        etBitcoin.setText(m.mostrar(m.dolarBitcoin(Double.parseDouble(etDolar.getText().toString()))));
                    }
                }

            }
        });
    }




}
