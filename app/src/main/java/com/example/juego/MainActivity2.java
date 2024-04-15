package com.example.juego;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button comprobat;

    TextView r1;
    TextView r2;
    TextView r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);

         comprobat = findViewById(R.id.comprobat);

        comprobat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 r1.setText("24 de junio de 1996");
                 r2.setText("No vendo trap");
                 r3.setText("Trap y Regueton");
            }
        });


    }

}

