package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button finalizar = (Button) findViewById(R.id.finalizar);

        finalizar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Pedido pedido= new Pedido();
                String primeiroSabor = getIntent().getStringExtra("sabor");
                String segundoSabor = getIntent().getStringExtra("sabor2");
                String terceiroSabor = getIntent().getStringExtra("sabor3");
                String quartoSabor = getIntent().getStringExtra("sabor4");
                String pagamento = getIntent().getStringExtra("pagamento");

                pedido.setNomeCompleto(findViewById(R.id.nomeCompleto).toString());
                pedido.setEndereco(findViewById(R.id.endereco).toString());
                pedido.setNumero(Integer.parseInt(findViewById(R.id.numero).toString()));
                pedido.setComplemento(findViewById(R.id.complemento).toString());
                pedido.setTelefone(Integer.parseInt(findViewById(R.id.telefone).toString()));
                pedido.setPrimeiroSabor(primeiroSabor);
                pedido.setSegundoSabor(segundoSabor);
                pedido.setTerceiroSabor(terceiroSabor);
                pedido.setQuartoSabor(quartoSabor);
                pedido.setFormaPagamento(pagamento);

                Intent intent = new Intent(Dashboard.this, Status.class);
                startActivity(intent);
                pedido.salvar();
            }
        });
    }
}