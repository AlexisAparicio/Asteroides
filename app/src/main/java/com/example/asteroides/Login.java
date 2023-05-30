package com.example.asteroides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText inp1,inp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inp1=(EditText)findViewById(R.id.input_1);
        inp2=(EditText)findViewById(R.id.input_2);
        String nombre,apellido=" ";
        nombre=getIntent().getStringExtra("nombre");
        apellido=getIntent().getStringExtra("apellido");
        inp1.setText(nombre);
        inp2.setText(apellido);
    }

    public void Enviar(View view){
        Intent i=new Intent(this,login2.class);
        i.putExtra("nombre",inp1.getText().toString());
        i.putExtra("apellido",inp2.getText().toString());
        startActivity(i);
    }
    public void Back2(View view){
        String nombre= getIntent().getStringExtra("nombre");
        String apellido= getIntent().getStringExtra("apellido");
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("nombre",nombre);
        i.putExtra("apellido",apellido);
        startActivity(i);
    }
}