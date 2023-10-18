package com.example.calculadora20;

import android.view.View;

public class Calculator extends MainActivity{
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
