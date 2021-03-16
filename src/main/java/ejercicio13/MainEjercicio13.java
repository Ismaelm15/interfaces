/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.ArrayList;

/**
 *
 * @author ismae
 */
public class MainEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ArrayList<Persona> listaPersonas= new ArrayList<>();
        
        listaPersonas.add(new Estudiante("504","Ismael","Melgar","50414Q","calle francisco de quevedo"));
        listaPersonas.add(new Profesor("Lenguaje","Jose","Vico", "54648464W", "calle los molinos"));
        listaPersonas.add(new Estudiante("693","Pablo","Mingolla","658765C","calle pardo bazan"));
        listaPersonas.add(new Profesor("Programacion","juan","Vico", "7984564Z", "tu sabe"));
        listaPersonas.add(new Estudiante("8798745","Ren","del campo","87496165D","hjasldgjh"));
        listaPersonas.add(new Profesor("Sociales","Jose","Vico", "54648464W", "calle los molinos"));
                
        for (Persona aux : listaPersonas) {
           if(aux instanceof Estudiante){
            aux.identificate();       
            }if(aux instanceof Profesor){          
            aux.identificate();
            }
        }
    }
}
