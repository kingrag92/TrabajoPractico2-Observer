
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
       a1.setAceite(true);
       Auto a2=new Auto("OJT 010", "Nissan", "Skylane", per2);
       a2.setNivelAgua(true);
       a2.setPresionCubiertas(true);
       Auto a3=new Auto("AB 010 XY", "Fiat", "500", per3);
       a3.setNivelAgua(true);
       a3.setPresionCubiertas(true);
       a3.setAceite(true);
       
       //Creo el mecanico
       Mecanico m1=new Mecanico("Alberto Luis","Spinetta",4698271,"Av. Champagnat 1925");
       
       //Agrego el addObserver al mecanico
       m1.addObserver(a1);
       m1.addObserver(a2);
       m1.addObserver(a3);
       
       //Creo la lista de Autos para darselas al mecanico
       List<Auto> listaAutos=new ArrayList<Auto>();
       listaAutos.add(a2);
       listaAutos.add(a1);
       listaAutos.add(a3);
       
       //metodo para notificar a los observadores
       m1.arreglarAutos(listaAutos);
       
       
       
       
    }
    
}
