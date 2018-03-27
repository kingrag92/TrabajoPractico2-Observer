/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciano
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer dni;
    private String telefono;
    private Boolean celula;
    private Boolean registro;
    private Boolean seguro;
    
    public Persona(){
    this.nombre="";
    this.apellido="";
    this.direccion="";
    this.dni=0;
    this.telefono="";
    this.celula=false;
    this.registro=false;
    this.celula=false;
    }
    
    public Persona(String nombre,String apellido,String direccion,Integer dni,String telefono){
    this.nombre=nombre;
    this.apellido=apellido;
    this.direccion=direccion;
    this.dni=dni;
    this.telefono=telefono;
    this.celula=true;
    this.registro=true;
    this.celula=true;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
     * @return the celula
     */
    public Boolean getCelula() {
        return celula;
    }

    /**
     * @param celula the celula to set
     */
    public void setCelula(Boolean celula) {
        this.celula = celula;
    }

    /**
     * @return the registro
     */
    public Boolean getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(Boolean registro) {
        this.registro = registro;
    }

    /**
     * @return the seguro
     */
    public Boolean getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
