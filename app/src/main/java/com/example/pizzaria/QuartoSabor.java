package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuartoSabor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarto_sabor);

        RadioButton Alho4 = (RadioButton) findViewById(R.id.rbAlho4);
        RadioButton Calabresa4 = (RadioButton) findViewById(R.id.rbCalabresa4);
        RadioButton Coracao4 = (RadioButton) findViewById(R.id.rbCoracao4);
        RadioButton Filet4 = (RadioButton) findViewById(R.id.rbFilet4);
        RadioButton Marguerita4 = (RadioButton) findViewById(R.id.rbMarguerita4);
        RadioButton Palmito4 = (RadioButton) findViewById(R.id.rbPalmito4);
        RadioButton Portuguesa4 = (RadioButton) findViewById(R.id.rbPortuguesa4);
        RadioButton Queijos4 = (RadioButton) findViewById(R.id.rbQueijos4);
        RadioButton Strogonoff4 = (RadioButton) findViewById(R.id.rbStrogonoff4);

        Button confirmar4 = (Button) findViewById(R.id.btConfirmar4);

        confirmar4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String sabor4;

                if (Alho4.isChecked()==true)
                {
                    sabor4 = "Alho";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Calabresa4.isChecked()==true)
                {
                    sabor4 = "Calabresa";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Coracao4.isChecked()==true)
                {
                    sabor4 = "Coracao";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Filet4.isChecked()==true)
                {
                    sabor4 = "Filet";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Marguerita4.isChecked()==true)
                {
                    sabor4 = "Marguerita";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Palmito4.isChecked()==true)
                {
                    sabor4 = "Palmito";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Portuguesa4.isChecked()==true)
                {
                    sabor4 = "Portuguesa";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Queijos4.isChecked()==true)
                {
                    sabor4 = "Quatro Queijos";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
                if (Strogonoff4.isChecked()==true)
                {
                    sabor4 = "Strogonoff";
                    Intent intent = new Intent(QuartoSabor.this, FormaPagamento.class);
                    intent.putExtra("sabor4",sabor4);
                    startActivity(intent);
                }
            }
        });
    }
}