package com.example.ingenieria.imcorp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText peso, estatura;
    private TextView resul,texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = (EditText) findViewById(R.id.peso);
        estatura = (EditText) findViewById(R.id.estatura);
        resul = (TextView) findViewById(R.id.resul);
        texto = (TextView) findViewById(R.id.texto);
    }

    public void calculo(View view) {
        String valor1 = peso.getText().toString();
        Float valor2 = Float.parseFloat(estatura.getText().toString());
        double nro1 = Integer.parseInt(valor1);
        double nro2 = valor2;
        double re = nro1 / (nro2 * nro2);

        peso.setText(re);



        if (re < 16.0) {
            texto = (TextView) findViewById(R.id.texto);
.setText("Tienes delgadez severa");
        } else if (re >= 40.0) {
            texto = (TextView) findViewById(R.id.texto);
.setText("Tienes obesidad mórbida");
        } else if (re >= 16.0 && re <= 16.99) {
            texto = (TextView) findViewById(R.id.texto);
.setText("Tienes delgadez moderada");
        } else if (re >= 17.0 && re <= 18.49) {
            texto = (TextView) findViewById(R.id.texto);
.setText("Tienes delgadez Leve");
        } else if (re >= 18.5 && re <= 24.99) {
            texto = (TextView) findViewById(R.id.texto);
.setText("Tienes peso normal");
        } else {
            if (re >= 25.0 && re <= 29.99) {
                texto = (TextView) findViewById(R.id.texto);
.setText("Tienes Preobesidad");
            } else {
                if (re >= 30.0 && re <= 34.99) {
                    texto = (TextView) findViewById(R.id.texto);
.setText("Tienes obesidad leve");
                } else {
                    if (re >= 35.0 && re <= 39.99) {
                        texto = (TextView) findViewById(R.id.texto);
.setText("Tienes obesidad media");
                    }
                }
            }
        }
    }
}

