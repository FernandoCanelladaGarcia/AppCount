package com.example.fernando.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView display;
    private Button botonMas, botonMenos;
    private Integer counter;

    class MyButtonListener1 implements View.OnClickListener{
        //Codigo del cambio
        @Override
        public void onClick(View v) {
            counter++;
            display.setText(counter.toString());
        }

    }
    class MyButtonListener2 implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            counter--;
            display.setText(counter.toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enganchar Java a la pantalla
        counter = 0;
        //Buscamos el cambio para Boton1 y nuestro Display
        botonMas = (Button)findViewById(R.id.button);
        display = (TextView)findViewById(R.id.display);

        botonMas.setOnClickListener(new MyButtonListener1());

        botonMenos = (Button)findViewById(R.id.button2);
        botonMenos.setOnClickListener(new MyButtonListener2());
    }
    }

