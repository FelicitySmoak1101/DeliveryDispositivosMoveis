package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class TerceiroSabor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiro_sabor);

        RadioButton Alho3 = (RadioButton) findViewById(R.id.rbAlho3);
        RadioButton Calabresa3 = (RadioButton) findViewById(R.id.rbCalabresa3);
        RadioButton Coracao3 = (RadioButton) findViewById(R.id.rbCoracao3);
        RadioButton Filet3 = (RadioButton) findViewById(R.id.rbFilet3);
        RadioButton Marguerita3 = (RadioButton) findViewById(R.id.rbMarguerita3);
        RadioButton Palmito3 = (RadioButton) findViewById(R.id.rbPalmito3);
        RadioButton Portuguesa3 = (RadioButton) findViewById(R.id.rbPortuguesa3);
        RadioButton Queijos3 = (RadioButton) findViewById(R.id.rbQueijos3);
        RadioButton Strogonoff3 = (RadioButton) findViewById(R.id.rbStrogonoff3);

        Button confirmar3 = (Button) findViewById(R.id.btConfirmar3);

        confirmar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Integer qtdSabores = getIntent().getIntExtra("qtd",0);
                String sabor1 = getIntent().getStringExtra("sabor");
                String sabor2 = getIntent().getStringExtra("sabor2");
                String sabor3;

                if (qtdSabores.equals(3))
                {
                    if (Alho3.isChecked()==true)
                    {
                        sabor3 = "Alho";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Calabresa3.isChecked()==true)
                    {
                        sabor3 = "Calabresa";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Coracao3.isChecked()==true)
                    {
                        sabor3 = "Coracao";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Filet3.isChecked()==true)
                    {
                        sabor3 = "Filet";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Marguerita3.isChecked()==true)
                    {
                        sabor3 = "Marguerita";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Palmito3.isChecked()==true)
                    {
                        sabor3 = "Palmito";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Portuguesa3.isChecked()==true)
                    {
                        sabor3 = "Portuguesa";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Queijos3.isChecked()==true)
                    {
                        sabor3 = "Quatro Queijos";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Strogonoff3.isChecked()==true)
                    {
                        sabor3 = "Strogonoff";
                        Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                }
                if (qtdSabores.equals(4))
                {
                    if (Alho3.isChecked()==true)
                    {
                        sabor3 = "Alho";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Calabresa3.isChecked()==true)
                    {
                        sabor3 = "Calabresa";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Coracao3.isChecked()==true)
                    {
                        sabor3 = "Coracao";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Filet3.isChecked()==true)
                    {
                        sabor3 = "Filet";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Marguerita3.isChecked()==true)
                    {
                        sabor3 = "Marguerita";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Palmito3.isChecked()==true)
                    {
                        sabor3 = "Palmito";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Portuguesa3.isChecked()==true)
                    {
                        sabor3 = "Portuguesa";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Queijos3.isChecked()==true)
                    {
                        sabor3 = "Quatro Queijos";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                    if (Strogonoff3.isChecked()==true)
                    {
                        sabor3 = "Strogonoff";
                        Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        intent.putExtra("sabor3",sabor3);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}