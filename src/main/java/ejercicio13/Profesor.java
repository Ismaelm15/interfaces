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
public class Profesor extends Persona{
    String especialidad;

    public Profesor(String especialidad,String nombre, String apellidos, String nif, String direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especialidad=especialidad;
    }
    
    public void identificate(){
    
        System.out.println(this.getEspecialidad()
                +" "+this.getClass());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +super.toString()+ "especialidad=" + especialidad + '}';
    }
    
    
}
