package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sabores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabores);

        Button confirmar = (Button) findViewById(R.id.btConfirmar);

        confirmar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Integer quantidadeSabores = getIntent().getIntExtra("qtd",0);


                if (quantidadeSabores.equals(1))
                {
                    Intent intent = new Intent(Sabores.this, FormaPagamento.class);
                    intent.putExtra("qtd",quantidadeSabores);
                    startActivity(intent);
                }
                if (quantidadeSabores.equals(2))
                {
                    Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                    intent.putExtra("qtd",quantidadeSabores);
                    startActivity(intent);
                }
                if (quantidadeSabores.equals(3))
                {
                    Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                    intent.putExtra("qtd",quantidadeSabores);
                    startActivity(intent);
                }
                if (quantidadeSabores.equals(4))
                {
                    Intent intent = new Intent(Sabores.this, SegundoSabor.class);
                    intent.putExtra("qtd",quantidadeSabores);
                    startActivity(intent);
                }
            }
        });
    }
}