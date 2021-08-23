package com.example.sumaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    EditText numero1, numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = (TextView) findViewById(R.id.tvresultado);
        numero1 = (EditText) findViewById(R.id.etnumero1);
        numero2 = (EditText) findViewById(R.id.etnumero2);
    }

    public void sumar(View view){
        double valor1=Double.parseDouble(numero1.getText().toString());
        double valor2=Double.parseDouble(numero2.getText().toString());
        double res=valor1+valor2;
        resultado.setText("La SUMA es: "+res);
    }
}