package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Sabores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabores);

        RadioButton Alho = (RadioButton) findViewById(R.id.rbAlho);
        RadioButton Calabresa = (RadioButton) findViewById(R.id.rbCalabresa);
        RadioButton Coracao = (RadioButton) findViewById(R.id.rbCoracao);
        RadioButton Filet = (RadioButton) findViewById(R.id.rbFilet);
        RadioButton Marguerita = (RadioButton) findViewById(R.id.rbMarguerita);
        RadioButton Palmito = (RadioButton) findViewById(R.id.rbPalmito);
        RadioButton Portuguesa = (RadioButton) findViewById(R.id.rbPortuguesa);
        RadioButton Queijos = (RadioButton) findViewById(R.id.rbQueijos);
        RadioButton Strogonoff = (RadioButton) findViewById(R.id.rbStrogonoff);

        Button confirmar = (Button) findViewById(R.id.btConfirmar);

        confirmar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Integer quantidadeSabores = getIntent().getIntExtra("qtd",0);
                String sabor;

                if (quantidadeSabores.equals(1))
                {
                    if(Alho.isChecked()==true)
                    {
                        sabor="Alho";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Calabresa.isChecked()==true)
                    {
                        sabor = "Calabresa";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Coracao.isChecked()==true)
                    {
                        sabor = "Coracao";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Filet.isChecked()==true)
                    {
                        sabor = "Filet";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Marguerita.isChecked()==true)
                    {
                        sabor = "Marguerita";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Palmito.isChecked()==true)
                    {
                        sabor = "Palmito";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Portuguesa.isChecked()==true)
                    {
                        sabor = "Portuguesa";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Queijos.isChecked()==true)
                    {
                        sabor = "Quatro Queijos";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Strogonoff.isChecked()==true)
                    {
                        sabor = "Strogonoff";
                        Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                }
                if (quantidadeSabores.equals(2))
                {
                    if(Alho.isChecked()==true)
                    {
                        sabor = "Alho";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Calabresa.isChecked()==true)
                    {
                        sabor = "Calabresa";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Coracao.isChecked()==true)
                    {
                        sabor = "Coracao";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Filet.isChecked()==true)
                    {
                        sabor = "Filet";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Marguerita.isChecked()==true)
                    {
                        sabor = "Marguerita";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Palmito.isChecked()==true)
                    {
                        sabor = "Palmito";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Portuguesa.isChecked()==true)
                    {
                        sabor = "Portuguesa";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Queijos.isChecked()==true)
                    {
                        sabor = "Quatro Queijos";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Strogonoff.isChecked()==true)
                    {
                        sabor = "Strogonoff";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                }
                if (quantidadeSabores.equals(3))
                {
                    if(Alho.isChecked()==true)
                    {
                        sabor = "Alho";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Calabresa.isChecked()==true)
                    {
                        sabor = "Calabresa";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Coracao.isChecked()==true)
                    {
                        sabor = "Coracao";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Filet.isChecked()==true)
                    {
                        sabor = "Filet";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Marguerita.isChecked()==true)
                    {
                        sabor = "Marguerita";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Palmito.isChecked()==true)
                    {
                        sabor = "Palmito";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Portuguesa.isChecked()==true)
                    {
                        sabor = "Portuguesa";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Queijos.isChecked()==true)
                    {
                        sabor = "Quatro Queijos";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Strogonoff.isChecked()==true)
                    {
                        sabor = "Strogonoff";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                }
                if (quantidadeSabores.equals(4))
                {
                    if(Alho.isChecked()==true)
                    {
                        sabor = "Alho";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Calabresa.isChecked()==true)
                    {
                        sabor = "Calabresa";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Coracao.isChecked()==true)
                    {
                        sabor = "Coracao";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Filet.isChecked()==true)
                    {
                        sabor = "Filet";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Marguerita.isChecked()==true)
                    {
                        sabor = "Marguerita";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Palmito.isChecked()==true)
                    {
                        sabor = "Palmito";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Portuguesa.isChecked()==true)
                    {
                        sabor = "Portuguesa";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Queijos.isChecked()==true)
                    {
                        sabor = "Quatro Queijos";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                    if(Strogonoff.isChecked()==true)
                    {
                        sabor = "Strogonoff";
                        Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                        intent.putExtra("qtd",quantidadeSabores);
                        intent.putExtra("sabor",sabor);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}