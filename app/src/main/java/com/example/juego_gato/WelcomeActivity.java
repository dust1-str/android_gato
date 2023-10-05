package com.example.juego_gato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomeactivity);

        contador = findViewById(R.id.contador);

        CountDownTimer counter = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                long segundosRestantes = l / 1000;
                contador.setText("Tiempo restante: " + segundosRestantes + " segundos");
            }

            @Override
            public void onFinish() {
                Intent lanzarJuego = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(lanzarJuego);
            }
        }.start();
    }
}