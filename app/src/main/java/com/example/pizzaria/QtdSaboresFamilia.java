package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QtdSaboresFamilia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qtd_sabores_familia);

        RadioButton umSabor3 = (RadioButton) findViewById(R.id.sabor1);
        RadioButton doisSabores3 = (RadioButton) findViewById(R.id.sabor2);
        RadioButton tresSabores2 = (RadioButton) findViewById(R.id.sabor3);
        RadioButton quatroSabores = (RadioButton) findViewById(R.id.sabor4);

        Button proximo4 = (Button) findViewById(R.id.proximo4);
        String tam=getIntent().getStringExtra("tamanho");

        if(tam.equals("pequena"))
        {
            Intent intent = new Intent(QtdSaboresFamilia.this, Sabores.class);
            intent.putExtra("tamanho",tam);
            intent.putExtra("qtd",1);
            startActivity(intent);
        }
        else if(tam.equals("media"))
        {
            tresSabores2.setVisibility(View.INVISIBLE);
            quatroSabores.setVisibility(View.INVISIBLE);
        }
        else if(tam.equals("grande"))
        {
            quatroSabores.setVisibility(View.INVISIBLE);
        }

        proximo4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Integer quantidade =0;
                if (umSabor3.isChecked() == true) {
                    quantidade = 1;
                }
                else if (doisSabores3.isChecked() == true) {
                    quantidade=2;
                }
                else if (tresSabores2.isChecked() == true) {
                    quantidade=3;
                }
                else if (quatroSabores.isChecked() == true) {
                    quantidade=4;
                }
                else if(umSabor3.isChecked()==false && doisSabores3.isChecked()==false && tresSabores2.isChecked()==false && quatroSabores.isChecked()==false)
                {
                    Toast.makeText(getApplicationContext(),"Nenhuma quantidade de sabor foi selecionada!",Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(QtdSaboresFamilia.this, Sabores.class);
                intent.putExtra("tamanho",tam);
                intent.putExtra("qtd",quantidade);
                startActivity(intent);
            }
        });
    }
}