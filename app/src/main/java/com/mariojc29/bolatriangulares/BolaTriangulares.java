package com.mariojc29.bolatriangulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BolaTriangulares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola_triangulares);
    }


    public void checkNumber(View view) {
        EditText txNumber = (EditText) findViewById(R.id.Respuesta);
        TextView txMessage = (TextView) findViewById(R.id.Respuesta);


        String sNumber = txNumber.getText().toString().trim();
        Integer number = Integer.parseInt(sNumber);

        String message;
        if (IsSquareNumber(number)) {
            message = sNumber + " is a square number";
        } else {
            if (IsTriangularNumber(number)) {
                message = sNumber + " is a triangular number";
            } else {
                message = sNumber + "is neither square nor triangular";
            }
        }

        txMessage.setText(message);
    }
    public void limpiar(View view){
        EditText Numbers = (EditText) findViewById(R.id.Respuesta);
        TextView Mensaje = (TextView) findViewById(R.id.Respuesta);

        String limpio;
        limpio = "";
        Numbers.setText(limpio);
        Mensaje.setText(limpio);
    }


    public boolean IsSquareNumber(int number) {
        double squareRoot = Math.sqrt(number);
        return squareRoot == Math.floor(squareRoot);
    }

    public boolean IsTriangularNumber(int number) {
        int x = 1;
        int triangularNumber = 1;

        while (triangularNumber < number) {
            x++;
            triangularNumber += x;
        }
        return triangularNumber == number;
    }
}

