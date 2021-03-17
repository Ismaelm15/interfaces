/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Random;

/**
 *
 * @author ismae
 */
public class Robots implements Comparable<Robots> {

    private int vida, nSerie;
    private Random rnd = new Random();

    public Robots() {
        this.nSerie = Math.abs(rnd.nextInt());
        this.vida = rnd.nextInt(101);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getnSerie() {
        return nSerie;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    @Override
    public String toString() {
        return "Robots{" + "vida=" + vida + ", nSerie=" + nSerie + '}';
    }

    @Override
    public int compareTo(Robots t) {
        return this.nSerie - t.getnSerie();
    }

}
