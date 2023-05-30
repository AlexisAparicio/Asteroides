package com.example.asteroides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String nombre,apellido;
        tv1=(TextView)findViewById(R.id.tv_name);
        nombre=getIntent().getStringExtra("nombre");
        apellido=getIntent().getStringExtra("apellido");
        tv1.setText("Hola "+nombre+" "+apellido);
    }

    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this,AcercaDe.class);
        startActivity(i);
    }

    public void Start(View view){
        Intent i = new Intent(this,Login.class);
        startActivity(i);
    }
    public void salir(View view){
        finish();
    }

}