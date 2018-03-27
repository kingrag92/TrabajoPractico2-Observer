
import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciano
 */
public class Auto implements Observer{
    private String patente;
    private String marca;
    private String modelo;
    private Persona dueño;
    private Boolean aceite;
    private Boolean presionCubiertas;
    private Boolean nivelAgua;
    private Boolean aviso=false;
    
    public Auto(){
        this.patente="";
        this.marca="";
        this.modelo="";
        this.dueño=new Persona();
        this.aceite=false;
        this.presionCubiertas=false;
        this.nivelAgua=false;
    }
    
    public Auto(String patente, String marca, String modelo, Persona dueño){
        this.patente=patente;
        this.marca=marca;
        this.modelo=modelo;
        this.dueño=dueño;
        this.aceite=false;
        this.presionCubiertas=false;
        this.nivelAgua=false;
    }

    
    //metodo aupdate dependiendo de los 3 booleanos del auto que se monitorean
    
     @Override
    public void update(Observable o, Object o1) {
        Auto aux=(Auto) o1;
        if(!aviso){
            if(aux.getAceite()&&aux.getNivelAgua()&&aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, se cambia agua, aceite y se verifica presión de las cubiertas.");
                aviso=true;
            }
            if(aux.getAceite()&&aux.getNivelAgua()&&!aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"  que puede venir a buscar el vehiculo, se cambia agua y aceite.");
                aviso=true;
            }
            if(aux.getAceite()&&!aux.getNivelAgua()&&aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, se cambia aceite y la presión de las cubiertas.");
                aviso=true;
            }
            if(!aux.getAceite()&&aux.getNivelAgua()&&aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, se agrega agua y se sube la presión de las cubiertas.");
                aviso=true;
            }
            if(!aux.getAceite()&&!aux.getNivelAgua()&&aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, se le agrego presión a las cubiertas.");
                aviso=true;
            }
            if(aux.getAceite()&&!aux.getNivelAgua()&&!aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, se le cambio el aceite.");
                aviso=true;
            }
            if(!aux.getAceite()&&aux.getNivelAgua()&&!aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, se le agrego agua destilada.");
                aviso=true;
            }
            if(!aux.getAceite()&&!aux.getNivelAgua()&&aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, tiene baja la presion de las cubiertas.");
                aviso=true;
            }
            if(!aux.getAceite()&&!aux.getNivelAgua()&&!aux.getPresionCubiertas()){
                System.out.println("Se le avisa al cliente "+aux.getDueño().getApellido()+"que puede venir a buscar el vehiculo, no se le encontro ningun problema Cualquier cosnulta se volvera a traer.");
                aviso=true;
            }
        }
        aviso=false;
    }
    
    
    
    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the dueño
     */
    public Persona getDueño() {
        return dueño;
    }

    /**
     * @param dueño the dueño to set
     */
    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    /**
     * @return the aceite
     */
    public Boolean getAceite() {
        return aceite;
    }

    /**
     * @param aceite the aceite to set
     */
    public void setAceite(Boolean aceite) {
        this.aceite = aceite;
    }

    /**
     * @return the presionCubiertas
     */
    public Boolean getPresionCubiertas() {
        return presionCubiertas;
    }

    /**
     * @param presionCubiertas the presionCubiertas to set
     */
    public void setPresionCubiertas(Boolean presionCubiertas) {
        this.presionCubiertas = presionCubiertas;
    }

    /**
     * @return the nivelAgua
     */
    public Boolean getNivelAgua() {
        return nivelAgua;
    }

    /**
     * @param nivelAgua the nivelAgua to set
     */
    public void setNivelAgua(Boolean nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

   
}
