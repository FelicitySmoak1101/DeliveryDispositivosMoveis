package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class FormaPagamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pagamento);

        RadioButton Dinheiro = (RadioButton) findViewById(R.id.dinheiro);
        RadioButton Credito = (RadioButton) findViewById(R.id.credito);
        RadioButton Debito = (RadioButton) findViewById(R.id.debito);
        RadioButton Pix = (RadioButton) findViewById(R.id.pix);

        Button proximo5 = (Button) findViewById(R.id.btnProximo5);

        proximo5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Pedido pedido5 = new Pedido();

                if (Dinheiro.isChecked()==true)
                {
                    pedido5.setFormaPagamento("Dinheiro");
                    Intent intent = new Intent(FormaPagamento.this, Dashboard.class);
                    intent.putExtra("pagamento", pedido5.getFormaPagamento());
                    startActivity(intent);
                }
                if (Credito.isChecked()==true)
                {
                    pedido5.setFormaPagamento("Credito");
                    Intent intent = new Intent(FormaPagamento.this, Dashboard.class);
                    intent.putExtra("pagamento", pedido5.getFormaPagamento());
                    startActivity(intent);
                }
                if (Debito.isChecked()==true)
                {
                    pedido5.setFormaPagamento("Debito");
                    Intent intent = new Intent(FormaPagamento.this, Dashboard.class);
                    intent.putExtra("pagamento", pedido5.getFormaPagamento());
                    startActivity(intent);
                }
                if (Pix.isChecked()==true)
                {
                    pedido5.setFormaPagamento("Pix");
                    Intent intent = new Intent(FormaPagamento.this, Dashboard.class);
                    intent.putExtra("pagamento", pedido5.getFormaPagamento());
                    startActivity(intent);
                }

            }
        });
    }
}