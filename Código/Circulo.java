/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Esta es la clase circulo
 * @author melaaa
 */
public class Circulo {// atributos
    static double PI = Math.PI;
    private double radio;//nivel de accesibilidad todos los de circulo solo veran radio, pero en el main,se usaran getters y setters
    private String color;
//manera y por convencion se hace asi, todos los objetos, necesitan esto
    /**
     * Este es un constructor vacio
     */
    public Circulo() {//constructor vacio
    }
    /**
     * Contructor que recibe un parametro
     * @param radio 
     */

    public Circulo(double radio) {//constructor con parametros
        this.radio = radio;
    }
    /**
     * 
     * @return radio
     */

    public double getRadio() {//getters para acceder a radio, creo que porque es private
        return radio;
    }
    /**
     * 
     * @param radio 
     */

    public void setRadio(double radio) {//setters de atributos
        this.radio = radio;
    }
    
    //to string para ver lo q tiene adentro, que atributos tiene circulo
    /**
     * 
     * @return "Circulo{" + "radio=" + radio + '}'
     */

    @Override//se esta sobrecargando
    public String toString() {//no recibe nada
        return "Circulo{" + "radio=" + radio + '}';//si usaramos la de color se imprime null porque en el main porque no lo hemos inic
        
    }
    /**
     * Metodo perimetro 
     * @return 2*PI*radio
     */

    public double perimetro(){
        return 2*PI*radio;
    }
    /**
     * Metodo area
     * @return PI*radio*radio
     */
    public double area(){
        return PI*radio*radio;
    }
}
