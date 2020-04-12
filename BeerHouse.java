package com.company;

import java.security.PublicKey;

public class BeerHouse {
    public int cervezas;
    boolean disponible = true;

    public BeerHouse() {
        cervezas = 10;
    }
    public synchronized void AgregarCerveza(){

        if (disponible){
            disponible = false;
            if ( cervezas >100){
                System.out.println("No hay mas espacio para birra");
            } else {
                cervezas = cervezas + 1;
                System.out.println("Se agrego la cerveza numero" + cervezas);
            }
        }
    }


    public synchronized void TomarCerveza(){
        if (!disponible) {
            disponible= true;
            if (cervezas > 0) {
                cervezas = cervezas - 1;

                System.out.println("Se tomo la cerveza numero" + cervezas);
            } else {
                System.out.println("No hay mas birra disponible");
            }
        }
    }


}
