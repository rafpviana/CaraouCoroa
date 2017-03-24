package com.example.rafaelpinheiro.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewJogar;
    private String opcao[] = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewJogar = (ImageView) findViewById(R.id.imageViewJogarId);
        imageViewJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random geradorAleatorio = new Random();

                int numeroAleatorio = geradorAleatorio.nextInt(2);

                Intent intentChamaResultActivity = new Intent(MainActivity.this, ResultActivity.class);

                intentChamaResultActivity.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intentChamaResultActivity);
            }
        });
    }
}
