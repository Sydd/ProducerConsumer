package com.company;

public class BeerConsumer extends Thread{

    BeerHouse bh;

    public BeerConsumer(BeerHouse bh) {
       this.bh = bh;
    }

    public void run(){
        while (bh.cervezas > 0){
            bh.TomarCerveza();
        }
    }
}
