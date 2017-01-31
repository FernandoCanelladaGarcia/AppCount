package com.example.fernando.appcount;

/**
 * Created by Fernando on 31/01/2017.
 */

public class Modelo {
    private Integer counter = 0; //Inicializamos variables
    public Integer getCounter(){
        return counter;
    }
    public void incrementar(){
        this.counter++;
    }
    public void decrementar(){
        this.counter--;
    }
}
