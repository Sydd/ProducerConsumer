package com.company;

public class Main {

    public static void main(String[] args) {
     BeerHouse beerHouse =  new BeerHouse(10,100,0);

     BeeerProducter beeerProducter = new BeeerProducter(beerHouse);
     BeeerProducter beeerProducter2 = new BeeerProducter(beerHouse);
     BeeerProducter beeerProducter3 = new BeeerProducter(beerHouse);

     BeerConsumer beerConsumer = new BeerConsumer(beerHouse);
     BeerConsumer beerConsumer2 = new BeerConsumer(beerHouse);

    beeerProducter.start();
    beeerProducter2.start();


    beerConsumer.start();
    beerConsumer2.start();

    }


}
