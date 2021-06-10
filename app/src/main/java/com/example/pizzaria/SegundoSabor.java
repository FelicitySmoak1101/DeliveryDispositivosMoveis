package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SegundoSabor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sabor);

        RadioButton Alho2 = (RadioButton) findViewById(R.id.rbAlho2);
        RadioButton Calabresa2 = (RadioButton) findViewById(R.id.rbCalabresa2);
        RadioButton Coracao2 = (RadioButton) findViewById(R.id.rbCoracao2);
        RadioButton Filet2 = (RadioButton) findViewById(R.id.rbFilet2);
        RadioButton Marguerita2 = (RadioButton) findViewById(R.id.rbMarguerita2);
        RadioButton Palmito2 = (RadioButton) findViewById(R.id.rbPalmito2);
        RadioButton Portuguesa2 = (RadioButton) findViewById(R.id.rbPortuguesa2);
        RadioButton Queijos2 = (RadioButton) findViewById(R.id.rbQueijos2);
        RadioButton Strogonoff2 = (RadioButton) findViewById(R.id.rbStrogonoff2);

        Button confirmar2 = (Button) findViewById(R.id.btConfirmar2);

        confirmar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Integer qtdSabores = getIntent().getIntExtra("qtd",0);
                String sabor1 = getIntent().getStringExtra("sabor");
                String sabor2;
                if (qtdSabores.equals(2))
                {
                    if (Alho2.isChecked()==true)
                    {
                        sabor2 = "Alho";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Calabresa2.isChecked()==true)
                    {
                        sabor2 = "Calabresa";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Coracao2.isChecked()==true)
                    {
                        sabor2 = "Coracao";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Filet2.isChecked()==true)
                    {
                        sabor2 = "Filet";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Marguerita2.isChecked()==true)
                    {
                        sabor2 = "Marguerita";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Palmito2.isChecked()==true)
                    {
                        sabor2 = "Palmito";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Portuguesa2.isChecked()==true)
                    {
                        sabor2 = "Portuguesa";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Queijos2.isChecked()==true)
                    {
                        sabor2 = "Quatro Queijos";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Strogonoff2.isChecked()==true)
                    {
                        sabor2 = "Strogonoff";
                        Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                }
                if (qtdSabores.equals(3))
                {
                    if (Alho2.isChecked()==true)
                    {
                        sabor2 = "Alho";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Calabresa2.isChecked()==true)
                    {
                        sabor2 = "Calabresa";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Coracao2.isChecked()==true)
                    {
                        sabor2 = "Coracao";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Filet2.isChecked()==true)
                    {
                        sabor2 = "Filet";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Marguerita2.isChecked()==true)
                    {
                        sabor2 = "Marguerita";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Palmito2.isChecked()==true)
                    {
                        sabor2 = "Palmito";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Portuguesa2.isChecked()==true)
                    {
                        sabor2 = "Portuguesa";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Queijos2.isChecked()==true)
                    {
                        sabor2 = "Quatro Queijos";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Strogonoff2.isChecked()==true)
                    {
                        sabor2 = "Strogonoff";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }

                }
                if (qtdSabores.equals(4))
                {
                    if (Alho2.isChecked()==true)
                    {
                        sabor2 = "Alho";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Calabresa2.isChecked()==true)
                    {
                        sabor2 = "Calabresa";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Coracao2.isChecked()==true)
                    {
                        sabor2 = "Coracao";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Filet2.isChecked()==true)
                    {
                        sabor2 = "Filet";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Marguerita2.isChecked()==true)
                    {
                        sabor2 = "Marguerita";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Palmito2.isChecked()==true)
                    {
                        sabor2 = "Palmito";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Portuguesa2.isChecked()==true)
                    {
                        sabor2 = "Portuguesa";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Queijos2.isChecked()==true)
                    {
                        sabor2 = "Quatro Queijos";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                    if (Strogonoff2.isChecked()==true)
                    {
                        sabor2 = "Strogonoff";
                        Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                        intent.putExtra("qtd",qtdSabores);
                        intent.putExtra("sabor",sabor1);
                        intent.putExtra("sabor2",sabor2);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}