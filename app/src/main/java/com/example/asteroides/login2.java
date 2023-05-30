package com.example.asteroides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class login2 extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        tv1=(TextView)findViewById(R.id.login_view);
        String nombre=getIntent().getStringExtra("nombre");
        String apellido=getIntent().getStringExtra("apellido");
        tv1.setText("Hola "+nombre+" "+apellido);

    }

    public void regresar(View view){
        String nombre= getIntent().getStringExtra("nombre");
        String apellido= getIntent().getStringExtra("apellido");
        Intent i = new Intent(this,Login.class);
        i.putExtra("nombre",nombre);
        i.putExtra("apellido",apellido);
        startActivity(i);
    }

}