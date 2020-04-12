package com.company;

public class Main {

    public static void main(String[] args) {
     BeerHouse beerHouse = new BeerHouse();

     BeeerProducter beeerProducter = new BeeerProducter(beerHouse);

     BeerConsumer beerConsumer = new BeerConsumer(beerHouse);
    BeerConsumer beerConsumer2 = new BeerConsumer(beerHouse);

        beeerProducter.start();


        beerConsumer.start();
        beerConsumer2.start();


    }


}
