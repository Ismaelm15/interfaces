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
public class CampanaExtractora extends Electrodomestico{
    private int ruido;

    public CampanaExtractora(int ruido, double consumo, String modelo) {
        super(consumo, modelo);
        this.ruido = ruido;
    }

    public int getRuido() {
        return ruido;
    }

    public void setRuido(int ruido) {
        this.ruido = ruido;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{"+super.toString() + "ruido=" + ruido + '}';
    }
    

    
    
}
