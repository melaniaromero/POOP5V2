/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Esta es la Clase POOP5, la clase principal
 * @author melaaa
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Objetos Circulo c1 y Circulo c2
         */
        Circulo c1 = new Circulo();//objetos
        Circulo c2 = new Circulo(6.0);
        System.out.println(c1.toString());//imprimen los atributos
        System.out.println(c2.toString());//imprimen los atributos
        
        System.out.println("Perimetro de circulo1= "+c1.perimetro());
        System.out.println("Area de circulo1= "+c1.area());
        
        System.out.println("Perimetro de circulo1= "+c2.perimetro());
        System.out.println("Area de circulo1= "+c2.area());
        
        //c1.radio = 9.0;//como es privada ya no se puede assi
       c1.setRadio(9.0);
       System.out.println("Perimetro de circulo1= "+c1.perimetro());
       System.out.println("Area de circulo1= "+c1.area());
       
       
       
       
       
       
       /**
        * Tres maneras de crear fecha de nacimiento
        */
       Persona amigo = new Persona();//objeto
       Fecha fNacimiento = new Fecha(3,4,2002);
       amigo.setNombre("Edgar");
       amigo.setApellido("Romero Martinez");
       amigo.setfNacimiento(fNacimiento);
       
       System.out.println("Info de mi Amigo "+amigo.toString());//lo pongamos o no nos va a imprimir la informacion
       //System.out.println("Info de mi Amigo "+amigo); //direccion de memoria a difenrencia de to string que imprime la cireccion de memoria
       
       Persona amigo2 = new Persona("Raul", "Ayala Barbosa", new Fecha(20,04,1993));
       System.out.println("Info Amigo 2= "+amigo2);
       
       //fechaestatica
       
       Persona amigo3 = new Persona("Diego", "Pedraza Peralta");
        System.out.println("Info Amigo 3= "+amigo3);//estatico
       
        
        
        
    }
    
    
    
    
    
    
    
    
}
