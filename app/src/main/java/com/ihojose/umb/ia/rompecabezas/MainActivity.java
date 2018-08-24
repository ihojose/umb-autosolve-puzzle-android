package com.ihojose.umb.ia.rompecabezas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final int COLUMNAS = 3, DIMENSINONES = COLUMNAS * COLUMNAS;
    private static int tamanoCelda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
