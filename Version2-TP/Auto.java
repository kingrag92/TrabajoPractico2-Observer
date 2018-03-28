
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
    private String aceite;
    private Integer presionCubiertas;
    private Integer nivelAgua;
    
    public Auto(){
        this.patente="";
        this.marca="";
        this.modelo="";
        this.dueño=new Persona();
        this.aceite="";
        this.presionCubiertas=0;
        this.nivelAgua=0;
    }
    
    public Auto(String patente, String marca, String modelo, Persona dueño){
        this.patente=patente;
        this.marca=marca;
        this.modelo=modelo;
        this.dueño=dueño;
        this.aceite="";
        this.presionCubiertas=0;
        this.nivelAgua=0;
    }

    
    //metodo aupdate dependiendo de los 3 booleanos del auto que se monitorean
    
     @Override
    public void update(Observable o, Object o1) {
        // SOlo trae el mensaje  con los cambios
        String mensaje=(String) o1;
        System.out.println(mensaje);
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
    public String getAceite() {
        return aceite;
    }

    /**
     * @param aceite the aceite to set
     */
    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    /**
     * @return the presionCubiertas
     */
    public Integer getPresionCubiertas() {
        return presionCubiertas;
    }

    /**
     * @param presionCubiertas the presionCubiertas to set
     */
    public void setPresionCubiertas(Integer presionCubiertas) {
        this.presionCubiertas = presionCubiertas;
    }

    /**
     * @return the nivelAgua
     */
    public Integer getNivelAgua() {
        return nivelAgua;
    }

    /**
     * @param nivelAgua the nivelAgua to set
     */
    public void setNivelAgua(Integer nivelAgua) {
        this.nivelAgua = nivelAgua;
    }
    
    

   
}
