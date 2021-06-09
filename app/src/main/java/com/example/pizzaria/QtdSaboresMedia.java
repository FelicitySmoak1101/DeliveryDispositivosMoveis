package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QtdSaboresMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qtd_sabores_media);

        RadioButton umSabor = (RadioButton) findViewById(R.id.rbUmSabor);
        RadioButton doisSabores = (RadioButton) findViewById(R.id.rbDoisSabores);
        Button proximo2 = (Button) findViewById(R.id.btnProximo2);

        proximo2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Integer qtd;
                if (umSabor.isChecked() == true) {
                    Intent intent = new Intent(QtdSaboresMedia.this, Sabores.class);
                    startActivity(intent);
                }
                else if (doisSabores.isChecked() == true) {
                    Intent intent = new Intent(QtdSaboresMedia.this, Sabores.class);
                    qtd=2;
                    intent.putExtra("qtd",qtd);
                    intent.putExtra("tam","media");
                    startActivity(intent);
                }
                else if(umSabor.isChecked()==false && doisSabores.isChecked()==false)
                {
                    Toast.makeText(getApplicationContext(),"Nenhuma quantidade de sabor foi selecionada!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}