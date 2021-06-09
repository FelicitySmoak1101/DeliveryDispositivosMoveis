package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundoSabor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sabor);

        Button confirmar2 = (Button) findViewById(R.id.btConfirmar2);

        confirmar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Integer qtdSabores = getIntent().getIntExtra("qtd",0);


                if (qtdSabores.equals(2))
                {
                    Intent intent = new Intent(SegundoSabor.this, FormaPagamento.class);
                    startActivity(intent);
                }
                if (qtdSabores.equals(3))
                {
                    Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                    intent.putExtra("qtd",qtdSabores);
                    startActivity(intent);
                }
                if (qtdSabores.equals(4))
                {
                    Intent intent = new Intent(SegundoSabor.this, TerceiroSabor.class);
                    intent.putExtra("qtd",qtdSabores);
                    startActivity(intent);
                }
            }
        });
    }
}