package com.example.api_3;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toast.makeText(this, "Corrida exitosamente", Toast.LENGTH_SHORT).show();

        // Configuración del botón y su evento
        Button buttonSiguiente = findViewById(R.id.Bt_Siguiente);
        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, api_b.class); // Asegúrate de que ApiB existe
                startActivity(intent);
            }
        });
    }
}