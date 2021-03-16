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
public class Microondas extends Electrodomestico implements MuestraInformacion, Comparable<Microondas> {

    private int potenciaMax;

    public Microondas(int potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potenciaMax=" + potenciaMax + '}';
    }

    @Override
    public void muestra() {
        System.out.println("La potencia maxima de este microondas es de " + this.getPotenciaMax() + " watios");
    }

    public int compareTo(Microondas micro) {  //mayor a menor
        if (potenciaMax == micro.getPotenciaMax()) {
            return 0;
        } else if (potenciaMax < micro.getPotenciaMax()) {
            return 1;
        } else {
            return -1;
        }
    }

}
