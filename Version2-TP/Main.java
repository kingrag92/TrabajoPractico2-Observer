
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciano
 */
public class Main {
    
    //Para que el mecanico arregle lo que este mal en el auto tienen que tener estas 3 premisas
    //Nivel de Aceite : Bajo
    //Nivel de cubiertas < 32 libras
    //Nivel de agua nivel de marca < a 55 (Siendo el MAX 100)
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creo las personas para agregarselas a los autos
       Persona per1=new Persona("German","Gianotti","Av. de los Pescadores 123",34347125,"223-3547585");
       Persona per2=new Persona("Luciano","Perello","Valencia 4952",36834703,"011-2547-8365");
       Persona per3=new Persona("Micaela","Fernandez","Balcarce 1235",36125731,"0261-458751");
       
       // Se crean los autos y se agregan true a los servicios que se necesitan hacer
       Auto a1=new Auto("AAA 168", "BMW", "132 I", per1);
       a1.setAceite("alto");
       a1.setPresionCubiertas(28);
       a1.setNivelAgua(60);
       
       Auto a2=new Auto("OJT 010", "Nissan", "Skylane", per2);
       a2.setAceite("medio");
       a2.setPresionCubiertas(33);
       a2.setNivelAgua(40);
       
       Auto a3=new Auto("AB 010 XY", "Fiat", "500", per3);
       a3.setAceite("bajo");
       a3.setPresionCubiertas(25);
       a3.setNivelAgua(30);
       
       //Creo el mecanico
       Mecanico m1=new Mecanico("Alberto Luis","Spinetta",4698271,"Av. Champagnat 1925");
       
       //Agrego el addObserver al mecanico
       m1.addObserver(a1);
       
       /* tengo comentado estos dos addObserver porque se multiplica los mensajes del metodo update */
       //m1.addObserver(a2);
       //m1.addObserver(a3);
       
       //metodo para que el mecanico arregle el o los autos
       m1.arreglarAutos(a1);
       m1.arreglarAutos(a2);
       m1.arreglarAutos(a3);
       
       
       
       
    }
    
}
