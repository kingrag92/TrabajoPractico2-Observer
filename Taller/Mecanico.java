import static java.lang.Thread.sleep;
import java.util.List;
import java.util.Observable;

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

    
    public void arreglarAutos(List<Auto> autos){
       try{
           for(Auto aux:autos){
               if(aux.getAceite() || aux.getNivelAgua() || aux.getPresionCubiertas()){
                    try{
                        System.out.println(getNombre()+" esta revisando el vehiculo de "+aux.getDueño().getNombre()+" "+aux.getDueño().getApellido());
                        sleep(1000);
                        System.out.println("Se avisa al cliente que se esta revisando alguna posible falla.");
                        setChanged();
                        sleep(2000);
                        notifyObservers(aux);
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
               }
           }
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
