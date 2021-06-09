package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceiroSabor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiro_sabor);

        Button confirmar3 = (Button) findViewById(R.id.btConfirmar3);

        confirmar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Integer qtdSabores = getIntent().getIntExtra("qtd",0);


                if (qtdSabores.equals(3))
                {
                    Intent intent = new Intent(TerceiroSabor.this, FormaPagamento.class);
                    startActivity(intent);
                }
                if (qtdSabores.equals(4))
                {
                    Intent intent = new Intent(TerceiroSabor.this, QuartoSabor.class);
                    intent.putExtra("qtd",qtdSabores);
                    startActivity(intent);
                }
            }
        });
    }
}