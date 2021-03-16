/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author ismae
 */
public class Frigorifico extends Electrodomestico implements Comparable<Frigorifico>, MuestraInformacion {

    private int capacidadLitros;

    public Frigorifico(int capacidadLitros, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadLitros = capacidadLitros;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "capacidadLitros=" + capacidadLitros + '}';
    }

    @Override
    public void muestra() {
        System.out.println("Este frigorifico tiene de capacidad " + this.getCapacidadLitros() + " Litros");
    }

    public int compareTo(Frigorifico frigo) {  //mayor a menor
        if (capacidadLitros == frigo.getCapacidadLitros()) {
            return 0;
        } else if (capacidadLitros < frigo.getCapacidadLitros()) {
            return 1;
        } else {
            return -1;
        }
    }
}
