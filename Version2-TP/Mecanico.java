import static java.lang.Thread.sleep;
import java.util.List;
import java.util.Observable;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciano
 */
public class Mecanico extends Observable {
    private String nombre;
    private String apellido;
    private Integer dni;
    private String lugarTrabajo; // direccion del libricentro
    
    public Mecanico(){
    this.nombre="";
    this.apellido="";
    this.dni=0;
    this.lugarTrabajo="";
    }
    
    public Mecanico(String nombre,String apellido,Integer dni, String lugar ){
     this.nombre=nombre;
    this.apellido=apellido;
    this.dni=dni;
    this.lugarTrabajo=lugar;
    }

    
    public void arreglarAutos(Auto aux){
       try{
           System.out.println("Se empieza a ver el auto del cliente "+ aux.getDueño().getNombre() +" "+ aux.getDueño().getApellido());
           sleep(3000);
           String mensaje="";
           boolean arreglo=false;
           if(aux.getAceite().toUpperCase().equals("BAJO")|| aux.getAceite().toLowerCase().equals("bajo")){
               mensaje+="Se cambio el aceite, su nivel estaba bajo";
               arreglo=true;
           }           
           sleep(1500);
           if(aux.getPresionCubiertas()<32){
               int presion=32-aux.getPresionCubiertas();
               if(!arreglo){
                   mensaje+="Se agregaron "+presion+" libra/s a las cubiertas del auto";
                   arreglo=true;
               }else{
                   mensaje+=", se encontro siguiendo con los chequeosfaltante de libras a als cubiertas, agregaron "+presion+" lbs";
               }
           }
           sleep(500);
           if(aux.getNivelAgua()<75){
               int agua=75-aux.getNivelAgua();
               Random r=new Random();
               int agrega=agua +r.nextInt(25);
               if(!arreglo){
                   mensaje+="Se encontro que el nivel de agua estaba por debajo de 75, se agregaron "+agrega+" ml de agua destilada.";
               }else{
                   mensaje+=". Ademas, se encontro que el nivel de agua estaba por debajo de 75, se agregaron "+agrega+" ml de agua destilada.";
               }
           }
           System.out.println("Se llama al cliente "+ aux.getDueño().getNombre() +" "+ aux.getDueño().getApellido()+" para avisarle que puede retirar su vehiculo y se le dice el inporte equivalente al service");
           sleep(2500);
           setChanged();
           notifyObservers(mensaje);
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public Integer getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    /**
     * @return the lugarTrabajo
     */
    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    /**
     * @param lugarTrabajo the lugarTrabajo to set
     */
    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
}
