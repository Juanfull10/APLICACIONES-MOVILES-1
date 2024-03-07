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
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();

        if (numero.isEmpty() && numero2.isEmpty() ) {
            resultado.setText("Digite Numeros");
        }else if(numero.isEmpty() && !numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());

            Double suma= num1+num2;
            resultado.setText(suma+"");
        }
    }

    public void resta(View view){
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();

        if (numero.isEmpty() && numero2.isEmpty() ) {
            resultado.setText("Digite Numeros");
        }else if(numero.isEmpty() && !numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ) {
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());

            Double resta = num1 - num2;
            resultado.setText(resta+"");
        }
    }

    public void multiplicar(View view){
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();

        if (numero.isEmpty() && numero2.isEmpty() ) {
            resultado.setText("Digite Numeros");
        }else if(numero.isEmpty() && !numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());

            Double multiplicar= num1*num2;
            resultado.setText(multiplicar+"");
        }
    }

    public void division(View view){
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();

        if (numero.isEmpty() && numero2.isEmpty() ) {
            resultado.setText("Digite Numeros");
        }else if(numero.isEmpty() && !numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());

            Double divi= num1/num2;
            resultado.setText(divi+"");
        }
    }

    public void fibo(View view){

        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();
        int num;

        if (numero.isEmpty() && numero2.isEmpty() ){
            resultado.setText("Digite Numeros");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){
            resultado.setText("Digite en un solo Espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){

            num = Integer.parseInt(valor1.getText().toString());
            int resultadoFibonacci = fibonacci(num);
            resultado.setText(Integer.toString(resultadoFibonacci));

        }else if(numero.isEmpty() && !numero2.isEmpty()){

            num = Integer.parseInt(valor2.getText().toString());
            int resultadoFibonacci = fibonacci(num);
            resultado.setText(Integer.toString(resultadoFibonacci));
        }
    }
    public static int fibonacci(int numero1) {
        if(numero1<=1){
            return numero1;
        } else{
            return fibonacci(numero1-1) + fibonacci(numero1-2);

        }
    }

    public void fact(View view){
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();
        int num;

        if (numero.isEmpty() && numero2.isEmpty() ){
            resultado.setText("Digite Numeros");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){
            resultado.setText("Digite en un solo Espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){

            num = Integer.parseInt(valor1.getText().toString());
            int resultadofactorial = factorial(num);
            resultado.setText(Integer.toString(resultadofactorial));

        }else if(numero.isEmpty() && !numero2.isEmpty()){

            num = Integer.parseInt(valor2.getText().toString());
            int resultadofactorial = factorial(num);
            resultado.setText(Integer.toString(resultadofactorial));
        }
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


    public void Potencia(View view) {
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();

        if (numero.isEmpty() && numero2.isEmpty() ) {
            resultado.setText("Digite Numeros");
        }else if(numero.isEmpty() && !numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){

            int base = Integer.parseInt(valor1.getText().toString());
            int exponente = Integer.parseInt(valor2.getText().toString());
            int resultadop = Potencia1(base, exponente);

            resultado.setText(Integer.toString(resultadop));
        }

    }

    public static int Potencia1(int base, int exponente) {
        if (exponente == 0) {
            return 1; // Cualquier número elevado a 0 es 1
        } else if (exponente == 1) {
            return base; // La potencia de cualquier número a la 1 es el mismo número
        } else if (exponente > 0) {
            return PotenciaSumar(base , Potencia1(base, exponente - 1)); // Recursión para calcular la potencia
        } else {
            return 1 / (PotenciaSumar(base, Potencia1(base, -exponente - 1))); // Manejo de exponentes negativos
        }
    }
    public static int PotenciaSumar(int num1, int contador) {
        if (contador == 0) {
            return 0;
        } else if (contador > 0) {
            return num1 + PotenciaSumar(num1, contador - 1);
        } else {
            return -PotenciaSumar(num1, -contador);
        }
    }
}


