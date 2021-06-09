package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Tamanho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamanho);

        RadioButton pequena = (RadioButton) findViewById(R.id.pequena);
        RadioButton media = (RadioButton) findViewById(R.id.media);
        RadioButton grande = (RadioButton) findViewById(R.id.grande);
        RadioButton familia = (RadioButton) findViewById(R.id.familia);
        Button proximo = (Button) findViewById(R.id.btnProximo);

        proximo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String tam="";
                if (pequena.isChecked() == true) {
                    tam="pequena";
                    //Intent intent = new Intent(Tamanho.this, Sabores.class);
                    //startActivity(intent);
                }
                else if (media.isChecked() == true) {
                    tam="media";
                    //Intent intent = new Intent(Tamanho.this, QtdSaboresMedia.class);
                    //startActivity(intent);
                }
                else if (grande.isChecked() == true) {
                    tam="grande";
                    //Intent intent = new Intent(Tamanho.this, QtdSaboresGrande.class);
                    //startActivity(intent);
                }
                else if (familia.isChecked() == true) {
                    tam="familia";
                    //Intent intent = new Intent(Tamanho.this, QtdSaboresFamilia.class);
                    //startActivity(intent);
                }
                else if(pequena.isChecked() == false && media.isChecked() == false && grande.isChecked() == false && familia.isChecked() == false){
                    Toast.makeText(getApplicationContext(),"Nenhum tamanho de pizza foi selecionado!",Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(Tamanho.this, QtdSaboresFamilia.class);
                intent.putExtra("tamanho",tam);
                startActivity(intent);
            }

        });
    }

}