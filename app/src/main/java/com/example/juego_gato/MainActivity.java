package com.example.juego_gato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, reset;
    TextView winner, winsX, winsO;
    char turno = 'X';
    int i = 0, countX = 1, countO = 1;
    char[] juego = {'-','-','-','-','-','-','-','-','-',};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        winner = findViewById(R.id.winner);
        winsX = findViewById(R.id.countX);
        winsO = findViewById(R.id.countO);
        reset = findViewById(R.id.reset);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText(String.valueOf(turno));
                juego[0] = turno;
                asignarTurno();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setText(String.valueOf(turno));
                juego[1] = turno;
                asignarTurno();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setText(String.valueOf(turno));
                juego[2] = turno;
                asignarTurno();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setText(String.valueOf(turno));
                juego[3] = turno;
                asignarTurno();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setText(String.valueOf(turno));
                juego[4] = turno;
                asignarTurno();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setText(String.valueOf(turno));
                juego[5] = turno;
                asignarTurno();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setText(String.valueOf(turno));
                juego[6] = turno;
                asignarTurno();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setText(String.valueOf(turno));
                juego[7] = turno;
                asignarTurno();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setText(String.valueOf(turno));
                juego[8] = turno;
                asignarTurno();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i <= 8; i++){
                    juego[i] = '-';
                }
                b1.setText('-');
                turno = 'X';
            }
        });

    }

    public void asignarTurno() {
        verificarCeldas(juego[0], juego[1], juego[2]);
        verificarCeldas(juego[3], juego[4], juego[5]);
        verificarCeldas(juego[6], juego[7], juego[8]);
        verificarCeldas(juego[0], juego[4], juego[8]);
        verificarCeldas(juego[2], juego[4], juego[6]);
        verificarCeldas(juego[0], juego[3], juego[6]);
        verificarCeldas(juego[1], juego[4], juego[7]);
        verificarCeldas(juego[2], juego[5], juego[8]);
        if (turno == 'X')
            turno = 'O';
        else
            turno = 'X';
    }

    public void verificarCeldas(char c1, char c2, char c3) {
        if (c1 == c2 && c2 == c3 && c1 != '-'){
            winner.setText("El ganador es: " + turno);
            asignarPunto();
        }
    }

    public void asignarPunto(){
        if (turno == 'X'){
            winsX.setText("" + countX);
            countX++;
        } else {
            winsO.setText("" + countO);
            countO++;
        }
    }
}