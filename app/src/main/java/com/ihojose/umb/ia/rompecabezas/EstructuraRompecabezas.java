package com.ihojose.umb.ia.rompecabezas;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class EstructuraRompecabezas extends GridView {
    private static final int DISTANCIA_MINIMA = 100, DISTANCIA_MAXIMA = 100;

    public EstructuraRompecabezas(Context context) {
        super(context);
    }

    public EstructuraRompecabezas(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
