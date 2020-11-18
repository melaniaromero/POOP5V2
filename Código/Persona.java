/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Esta es la clase Persona que se utilizo en la Practica 5
 * @author Melania Romero
 */
public class Persona {
   private String Nombre;
   private String Apellido;
   private Fecha fNacimiento;//necesito clase fecha parte de abstaccion
   
   /**
    * Este constructor no recibe nada
    */
    public Persona() {//constructor vacio
    }
    /**
     * Este constructor recibe 3 parametros
     * @param Nombre Es el nombre de nuestra persona, es de tipo String
     * @param Apellido
     * @param fNacimiento 
     */

    public Persona(String Nombre, String Apellido, Fecha fNacimiento) {//constructor con parametro
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * Este constructor recibe 2 parametros
     * @param Nombre
     * @param Apellido 
     */

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = new Fecha(3,5,1989);//estaticamente
    }
    /**
     * Este es un get
     * @return Nombre
     */
    public String getNombre() {//getters y setters
        return Nombre;
    }
    /**
     * Este es un set
     * @param Nombre 
     */

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * Este es un get
     * @return Apellido
     */

    public String getApellido() {
        return Apellido;
    }
    /**
     * Este es un set
     * @param Apellido 
     */

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /**
     * Este es un set
     * @return fNacimiento es de tipo Fecha 
     */

    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * Este es un get
     * @param fNacimiento 
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @return Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + '}'
     */

    @Override//sobrecarga un metodo, heredan de una clase padre objeto
    public String toString() {//tostring
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + '}';//fnacimiento es una fecha de persona, pero el 
    }
   
   
   
   
}
