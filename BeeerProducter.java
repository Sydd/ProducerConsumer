package com.company;

public class BeeerProducter extends Thread {

    BeerHouse bh;

    public BeeerProducter(BeerHouse bh) {
        this.bh = bh;
    }


    public void run(){
        while (bh.isBarOpen()) {
            bh.AgregarCerveza();
        }
    }

}
