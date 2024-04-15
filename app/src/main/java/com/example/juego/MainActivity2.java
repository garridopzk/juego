package com.example.juego;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button comprobat;
    EditText Respuesta;
    EditText respuesta;
    EditText respuestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Respuesta=findViewById(R.id.respuesta1);
        respuesta=findViewById(R.id.respuesta2);
        respuestas=findViewById(R.id.respuesta3);
        comprobat=findViewById(R.id.comprobat);
        }
    }
