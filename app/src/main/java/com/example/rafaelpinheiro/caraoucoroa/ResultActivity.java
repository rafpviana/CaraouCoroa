package com.example.rafaelpinheiro.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageViewCoin;
    private ImageView imageViewVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        imageViewCoin = (ImageView) findViewById(R.id.imageViewCoinId);
        imageViewVoltar = (ImageView) findViewById(R.id.imageViewVoltarId);

        imageViewVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(ResultActivity.this, MainActivity.class));
                finish();
            }
        });


        Bundle extraData = getIntent().getExtras();

        if(extraData == null){
            Toast.makeText(this, "Dados invalidos", Toast.LENGTH_SHORT).show();
        }
        else{
            String opcaoSorteada = extraData.getString("opcao");

            if(opcaoSorteada.equals("cara")){
                imageViewCoin.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }
            else{
                imageViewCoin.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }



    }
}
