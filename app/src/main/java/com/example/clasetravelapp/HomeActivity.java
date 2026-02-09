package com.example.clasetravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. CARGAR EL LAYOUT
        setContentView(R.layout.activity_home);

        // 2. BUSCAR LA BARRA DE BÚSQUEDA (si existe)
        EditText searchInput = findViewById(R.id.searchBar);

        // 3. CONFIGURAR LISTENER (opcional, comenta si da error)
        searchInput.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Se ejecuta antes de cambiar el texto
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Se ejecuta mientras cambia el texto
                System.out.println("Texto actual: " + s);
            }

            @Override
            public void afterTextChanged(android.text.Editable s) {
                // Se ejecuta después de cambiar el texto
            }
        });

        // 4. CONFIGURAR CLICK EN LA TARJETA COEURDES ALPES
        CardView cardCoeurdesAlpes = findViewById(R.id.cardCoeurdesAlpes);
        cardCoeurdesAlpes.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, DetailActivity.class);
            startActivity(intent);
        });
    }
}