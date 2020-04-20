package com.company;

public class BeerConsumer extends Thread{

    BeerHouse bh;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String nombre;

    public BeerConsumer(BeerHouse bh) {
       this.bh = bh;
    }

    public void run(){
        while (bh.isBarOpen()) {
                bh.TomarCerveza();
        }
    }
}
