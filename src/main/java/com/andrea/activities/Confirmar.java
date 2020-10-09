package com.andrea.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmar {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        Bundle parametros = getIntent().getExtras();
        final String nombre = parametros.getString(getResources().getString(R.string.keyCodeNombre));
        String fecha = parametros.getString(getResources().getString(R.string.keyCodeFecha));
        final String telefono = parametros.getString(getResources().getString(R.string.keyCodeTelefono));
        final String email = parametros.getString(getResources().getString(R.string.keyCodeEmail));
        final String descripcion = parametros.getString(getResources().getString(R.string.keyCodeDescripcion));

        TextView textViewNombre = (TextView) findViewById(R.id.textViewNombre);
        TextView textViewFecha = (TextView) findViewById(R.id.textViewFecha);
        TextView textViewTelefono = (TextView) findViewById(R.id.textViewTel);
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        TextView textViewDescripcion = (TextView) findViewById(R.id.textViewDescripcion);

        textViewNombre.setText(nombre);
        textViewFecha.setText(fecha);
        textViewTelefono.setText(telefono);
        textViewEmail.setText(email);
        textViewDescripcion.setText(descripcion);

        Button btnEditarDatos = (Button) findViewById(R.id.buttonEditar);
        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Confirmar.this, MainActivity.class);
                //intent.putExtra(getResources().getString(R.string.keyCodeNombre), nombre);
                //intent.putExtra(getResources().getString(R.string.keyCodeTelefono), telefono);
                startActivity(intent);
                finish();

            }
        });

    }

}
