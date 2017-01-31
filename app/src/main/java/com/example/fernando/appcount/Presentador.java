package com.example.fernando.appcount;

/**
 * Created by Fernando on 31/01/2017.
 */

public class Presentador {
    //El presentado necesita conocer el modelo y la vista
    Modelo myModel;
    Vista myView;
    public Presentador(Vista view){
        myModel = new Modelo();
        myView = view;
    }
    public void botonPulsado1(){
        myModel.incrementar();
        myView.setDisplay(myModel.getCounter().toString());
    }
    public void botonPulsado2(){
        myModel.decrementar();
        myView.setDisplay(myModel.getCounter().toString());
}
}
