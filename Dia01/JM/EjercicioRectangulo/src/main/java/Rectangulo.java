/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanm
 */
public class Rectangulo {
    private double ancho;
    private double largo;
    
    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }
    public double calcularArea(){
        return this.ancho*this.largo;
    }
    public double calcularPerimetro(){
        return (this.ancho*2)+(this.largo*2);
    }
}
