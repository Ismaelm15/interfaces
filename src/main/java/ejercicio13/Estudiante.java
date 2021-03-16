/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author ismae
 */
public class Estudiante extends Persona{
    String id;

    public Estudiante(String id, String nombre, String apellidos, String nif, String direccion) {
        super(nombre, apellidos, nif, direccion);
        this.id = id;
    }

    @Override
   public void identificate(){
   
       System.out.println(this.getId()+" "+this.getClass());
   }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Estudiante{" +super.toString()+ "id=" + id + '}';
    }
    
    
}
