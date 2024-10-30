package com.example.api_3;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class api_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.api_b);

        // Mostrar mensaje Toast al iniciar la actividad
        Toast.makeText(api_b.this, "Vista Cámara", Toast.LENGTH_SHORT).show();
    }

    // Clase modelo anidada para datos
    public static class DataModel {
        private String name;
        private int id;

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}