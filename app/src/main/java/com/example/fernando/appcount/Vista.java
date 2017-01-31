package com.example.fernando.appcount;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class Vista extends Activity {
    private Presentador myPresenter;
    private TextView display;
    private Button botonMas, botonMenos;
    private Integer counter;

    public void setDisplay (String text){
        display.setText(text);
    }

//    class MyButtonListener1 implements View.OnClickListener{
//        //Codigo del cambio
//        @Override
//        public void onClick(View v) {
//            counter++;
//            display.setText(counter.toString());
//        }
//
//    }
//    class MyButtonListener2 implements View.OnClickListener{
//
//        @Override
//        public void onClick(View v) {
//            counter--;
//            display.setText(counter.toString());
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myPresenter = new Presentador(this);
        setContentView(R.layout.activity_main);
        //Enganchar Java a la pantalla
        counter = 0;
        //Buscamos el cambio para Boton1 y nuestro Display
        botonMas = (Button)findViewById(R.id.button);
        display = (TextView)findViewById(R.id.display);

        //botonMas.setOnClickListener(new MyButtonListener1());
        botonMas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                myPresenter.botonPulsado1();
            }
        });
        botonMenos = (Button)findViewById(R.id.button2);
        //botonMenos.setOnClickListener(new MyButtonListener2());
        botonMenos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                myPresenter.botonPulsado2();
            }
        });
    }
}

