/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ismae
 */
public class MainEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Electrodomestico> lista = new ArrayList<>();
        ArrayList<Frigorifico> listaFrigo = new ArrayList<>();
        ArrayList<Microondas> listaMicro = new ArrayList<>();

        lista.add(new CampanaExtractora(780, 970, "SSsamsung"));
        lista.add(new CampanaExtractora(80, 90, "samsung"));
        lista.add(new Microondas(150, 70, "deskjet"));
        lista.add(new Frigorifico(190, 170, "A56"));
        lista.add(new Frigorifico(90, 70, "A2"));
        lista.add(new Microondas(1750, 770, "deskjet23"));
        listaFrigo.add(new Frigorifico(907, 70, "A2"));
        listaFrigo.add(new Frigorifico(506, 90, "A1"));
        listaFrigo.add(new Frigorifico(800, 31, "A3"));
        listaMicro.add(new Microondas(900, 70, "A2"));
        listaMicro.add(new Microondas(5000, 90, "A1"));
        listaMicro.add(new Microondas(3000, 31, "A3"));
        Collections.sort(listaMicro);
        for (Microondas micro : listaMicro) {
            System.out.println(micro.toString());
        }

        System.out.println("---------------------------");
        Collections.sort(listaFrigo);
        for (Frigorifico frigo : listaFrigo) {
            System.out.println(frigo.toString());
        }
        
        for (Electrodomestico aux : lista) {
            if (aux instanceof Microondas){
            ((Microondas) aux).muestra();
            }
            if (aux instanceof Frigorifico){
                ((Frigorifico) aux).muestra();
            }
            if (aux instanceof CampanaExtractora){
                System.out.println("soy una campana extractora no tengo el metodo mostrar");
            }
            
        }
        
    }

}
