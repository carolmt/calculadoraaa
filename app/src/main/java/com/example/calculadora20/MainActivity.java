package com.example.calculadora20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    float valorOriginalNumero1 = 0.0f;
    String operacion = "";
    Calculator operar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
    }

    public void escribir7(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString()); //toString para q pase a texto lo q haya en resultado y parseFloat lo pasa a float
        // y asi poder operar con un numero y no con un String
        if(numero1 == 0.0f) {
            resultado.setText("7");
        }else {
            resultado.setText(resultado.getText()+"7"); //lo q hacemos esq si lo q hay en la vista d resultado no es un 0, añadiremos el numero q tecleemos.
        }
    }
    public void escribir8(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f) {
            resultado.setText("8");
        } else {
            resultado.setText(resultado.getText() + "8");
        }
    }
    public void escribir9(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("9");
        }else {
            resultado.setText(resultado.getText()+"9");
        }
    }

    public void escribir4(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("4");
        }else {
            resultado.setText(resultado.getText()+"4");
        }
    }
    public void escribir5(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("5");
        }else {
            resultado.setText(resultado.getText()+"5");
        }
    }
    public void escribir6(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("6");
        }else {
            resultado.setText(resultado.getText()+"6");
        }
    }
    public void escribir1(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("1");
        }else {
            resultado.setText(resultado.getText()+"1");
        }
    }
    public void escribir2(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("2");
        }else {
            resultado.setText(resultado.getText()+"2");
        }
    }
    public void escribir3(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("3");
        }else {
            resultado.setText(resultado.getText()+"3");
        }
    }
    public void escribir0(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f) {
            resultado.setText("0");
        }else {
            resultado.setText(resultado.getText()+"0");
        }
    }
    public void borrar(View view) {
        resultado.setText("0");
        numero1 = 0.0f; //reinicio todas las variables
        numero2 = 0.0f;
        operacion = "";
    }
    public void sumar(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operacion = "+";
        valorOriginalNumero1 = numero1;
        resultado.setText("0"); //tenemos q ponerlo a 0 porq sino el numero2 se acumulará con el 1
    }
    public void restar(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operacion = "-";
        valorOriginalNumero1 = numero1;
        resultado.setText("0");
    }
    public void escribirResultado(View view) {
        float res;
        numero2 = Float.parseFloat(resultado.getText().toString()); //empezamos con numero2 porque va despues del sed.text0, lo q escribamos ya es num2
        if(operacion.equals("+")) {
            res = valorOriginalNumero1 + numero2;
            resultado.setText(String.valueOf(res));
            //resultado.setText(String.valueOf(numero1));
        }
        else if(operacion.equals("-")) {
            res = valorOriginalNumero1 - numero2;
            resultado.setText(String.valueOf(res));
        }
        numero1 = 0.0f; //reinicio todas las variables
        numero2 = 0.0f;
        operacion = "";
    }

}