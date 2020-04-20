package com.company;

/**
 *
 */
public class BeerHouse {

    int cervezas;
    int maxStock;
    int condicionDeCorte;
    boolean barOpen;


    public boolean isBarOpen() {
        return barOpen;
    }


    public BeerHouse(int cervezasIniciales, int maxStock, int condicion) {
        this.cervezas           = cervezasIniciales;
        this.maxStock           = maxStock;
        this.condicionDeCorte   = condicion;
        barOpen = true;
    }

    //


    public synchronized void AgregarCerveza() {
        try {
            if (cervezas < maxStock && barOpen) {
                cervezas = cervezas + 1;
                System.out.println("Se agrego la cerveza numero " + cervezas);
                this.wait(250);

            } else {
                System.out.println("No hay mas espacio para birra ");
                this.wait();
            }
        } catch (Exception E) {
            System.out.println(E.getMessage());
        }
    }

    public synchronized void TomarCerveza() {
        try {
            if (cervezas > condicionDeCorte && barOpen) {
                System.out.println("Se tomo la cerveza numero " + cervezas);
                cervezas = cervezas - 1;
                notifyAll();

                this.wait(500);

            } else {
                 barOpen = false;
                System.out.println("No hay mas birra disponible, Se cierra el bar ! ");
            }
        } catch (Exception E) {
            System.out.println(E.getMessage());
        }

    }
}

