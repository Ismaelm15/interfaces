/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ismae
 */
public class MainEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Robots> lista = new ArrayList<>();
        ArrayList<Robots> lista2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(new Robots());
        }

        Comparator<Robots> criterioVida = (v1, v2) -> Integer.compare(v1.getVida(), v2.getVida());

        Collections.sort(lista, criterioVida.reversed());

        for (Robots robots : lista) {
            System.out.println(robots.toString());
        }

        System.out.println("----------------------------------------------");

        Collections.sort(lista, criterioVida);

        for (Robots robots : lista) {
            System.out.println(robots.toString());
        }

        System.out.println("-----------------------------------------------");

        for (Robots robots : lista) {
            if (robots.getVida() < 50) {
                lista2.add(robots);
            }
        }

        for (Robots robots : lista2) {
            System.out.println(robots.toString());
        }

        System.out.println("-----------------------------------------------");

        Collections.sort(lista);

        for (Robots robots : lista) {
            System.out.println(robots.toString());
        }
        
         System.out.println("-----------------------------------------------");

         Robots abuscar =new Robots();
         abuscar.setnSerie(lista.get(4).getnSerie());

        Comparator<Robots> criterio = (o1, o2) -> Integer.compare(o1.getnSerie(),o2.getnSerie());
          int pos=Collections.binarySearch(lista, abuscar, criterio);
          
          System.out.println("El robot con el numero de serie "+abuscar.getnSerie()+" se encuentra en la posicion "+ pos);
    }

    }


