package com.example.juego_gato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadosActivity extends AppCompatActivity {

    TextView winnerMessage, winsX, winsO;
    Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        winnerMessage = findViewById(R.id.message);
        winsX = findViewById(R.id.countX);
        winsO = findViewById(R.id.countO);
        restart = findViewById(R.id.reset);

        Bundle bundleRecibido = getIntent().getExtras();

        if (bundleRecibido != null) {
            String winner = bundleRecibido.getString("winner");
            String ganadasX = bundleRecibido.getString("ganadasX");
            String ganadosO = bundleRecibido.getString("ganadosO");

            winnerMessage.setText("El ganador es: " + winner);
            winsX.setText(ganadasX);
            winsO.setText(ganadosO);
        }

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresarJuego = new Intent(ResultadosActivity.this, MainActivity.class);
                startActivity(regresarJuego);
            }
        });
    }
}