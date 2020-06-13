package com.example.tareaubicaciongooglemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ubicacion extends AppCompatActivity {

    private EditText et_lat, et_lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);

        et_lat = (EditText)findViewById(R.id.txt_lat);
        et_lon = (EditText)findViewById(R.id.txt_lon);
    }

    //Método para enviar los datos
    public void siguiente(View view){
        Intent pag_sig = new Intent(this, MapsActivity.class);
        pag_sig.putExtra("latitud", et_lat.getText().toString());
        pag_sig.putExtra("longitud", et_lon.getText().toString());
        startActivity(pag_sig);
    }
}
