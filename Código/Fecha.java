/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *Esta es la clase Fecha que se uso en la Práctica 5
 * @author melaaa
 */
class Fecha {
    private int dia;
    private int mes;
    private int anio;
    /**
     * Este es un constructor vacio
     */

    public Fecha() {//constructor vacio
    }
    /**
     * Este constructor recibe tres parametros
     * @param dia
     * @param mes
     * @param anio 
     */

    public Fecha(int dia, int mes, int anio) {//constructor con parametros
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Este es un get
     * @return dia 
     */

    public int getDia() {//getter y setters
        return dia;
    }
    /**
     * Este es un set
     * @param dia 
     */

    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Este es un set
     * @return mes
     */

    public int getMes() {
        return mes;
    }
    /**Este es un set
     * 
     * @param mes 
     */

    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * Este es un get
     * @return anio 
     */

    public int getAnio() {
        return anio;
    }
    /**
     * Este es un set
     * @param anio 
     */

    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}'
     */

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
