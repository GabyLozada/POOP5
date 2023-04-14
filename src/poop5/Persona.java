/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Gabriela Aquino Lozada 
 * @author Renata Barbosa Reyes
 * @author Ruben Alberto Ortega Macias
 */
public class Persona {
    private String nombre; 
    private String apellido;
    private Fecha fNaimiento;

    public Persona(){
        
    }
/**
 * Metodo que hace referencia al obejto de la clase, el cual es el de Persona
 * @param nombre Parametro de tipo cadena
 * @param apellido Parametro de tipo cadena
 * @param fNaimiento Parametro de tipo Fecha
 */
    public Persona(String nombre, String apellido, Fecha fNaimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNaimiento = fNaimiento;
    }
    /**
     * Metodo que hace referencia al obejto de la clase, el cual es el de Persona
     * a diferencia del anterior en este inetegramos los parametros a fNaimiento
     * @param nombre Parametro de tipo cadena
     * @param apellido Parametro de tipo cadena
     * @param dia Parametro de tipo entero
     * @param mes Parametro de tipo mes
     * @param anio Parametro de tipo entero
     */

    public Persona(String nombre, String apellido,int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNaimiento = new Fecha(dia,mes,anio);
    }
    /**El metodo getNombre recupera el valor guardado en setNombre y lo retorna
     * para utilizarlo
     * @return una cadena
     */
    
    public String getNombre(){
        return nombre;
    }
    /**
     * El metodo setNombre le da un valor a dia
     * @param nombre Parametro de tipo cadena
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /** El metodo getApellido recupera el valor guardado en setApellido y lo retorna
     * para utilizarlo
     * @return una cadena
     */
    public String getApellido() {
        return apellido;
    }
    /** El metodo getfNaimineot recupera el valor guardado en setfNaimiento y lo retorna
     * para utilizarlo
     * 
     * @return una cadena
     */
    public Fecha getfNaimiento() {
        return fNaimiento;
    }
    /**
     * El metodo setApellido le da un valor a dia
     * @param apellido Parametro de tipo cadena
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * El metodo setfNacimiento le da un valor a dia
     * @param fNaimiento Parametro de tipo Fecha 
     */
    public void setfNacimiento(Fecha fNaimiento) {
        this.fNaimiento = fNaimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNaimiento=" + fNaimiento + '}';
    }
    
}

