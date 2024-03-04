package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static EditText valor1;

    private static EditText valor2;

    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=findViewById(R.id.cuadradito1);
        valor2=findViewById(R.id.cuadradito2);
        resultado=findViewById(R.id.respuesta);

    }

    public void suma(View view){
        int suma=Integer.parseInt(valor1.getText().toString())+Integer.parseInt(valor2.getText().toString());
        resultado.setText(suma+"");
    }

    public void resta(View view){
        int resta= Integer.parseInt(valor1.getText().toString())- Integer.parseInt(valor2.getText().toString());
        resultado.setText(resta+"");

    }

    public void multiplicar(View view){
        int multiplicacion=Integer.parseInt(valor1.getText().toString())*Integer.parseInt(valor2.getText().toString());
        resultado.setText(multiplicacion+"");
    }

    public void division(View view){
        int divi=Integer.parseInt(valor1.getText().toString())/Integer.parseInt(valor2.getText().toString());
        resultado.setText(divi+"");
    }

    public static int fibonacci(int numero1) {
        if(numero1<=1){
            return numero1;
        } else {
            return fibonacci(numero1-1) + fibonacci(numero1-2);
        }
    }

    public void fibo(View view){
        int numero = Integer.parseInt(valor1.getText().toString());
        int resultadoFibonacci = fibonacci(numero);
        resultado.setText(Integer.toString(resultadoFibonacci));
    }

    public static int factorial(int numero1) {
        int resultado = 0;

        if(numero1==0||numero1==1){
            return numero1;
        } else if(numero1>1) {
            resultado=numero1*factorial(numero1-1);
        }
        return resultado;
    }
    public void fact(View view){
        int numero = Integer.parseInt(valor1.getText().toString());
        int resultadofactorial = factorial(numero);
        resultado.setText(Integer.toString(resultadofactorial));
    }

    public void poten(View view){
        int numero = Integer.parseInt(valor1.getText().toString());
        int numero2 = Integer.parseInt(valor2.getText().toString());

        int resultadoPotencia = poten(numero, numero2, 0, 0);
        resultado.setText(Integer.toString(resultadoPotencia));
    }

    public static int poten(int base, int exponente, int resultado, int contador){
        if (contador == exponente){
            return resultado;
        }

        int nuevoResultado = multiplicar1(resultado, base, 0, 0);
        int nuevoContador = contador + 1;

        return poten(base, exponente, nuevoResultado, nuevoContador);
    }


    public static int multiplicar1(int numeroASumar,int cantidadVeces, int contador,int resultado){

        if (contador==cantidadVeces){
            return resultado;
        }

        int nuevoContador=contador+1;
        int nuevoResultado=resultado;
        return multiplicar1(numeroASumar,cantidadVeces,nuevoContador,nuevoResultado);

    }






}


