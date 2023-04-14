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

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        
    }
    /**
     * Metodo que hace referencia al objeto actual de la clase
     * @param dia Parametro de tipo entero
     * @param mes Parametro de tipo entero
     * @param anio Parametro de tipo entero
     */
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * El metodo getDia recupera el valor guardado en setDia y lo retonra
     * para utilizarlo
     * @return un tipo entero
     */
    public int getDia() {
        return dia;
    }
    /**
     * El metodo setDia le da un valor a dia
     * @param dia Parametro de tipo entero
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * El metodo getMes recupera el valor guardado en setMes y lo retonra
     * para utilizarlo
     * @return un tipo entero
     */
    public int getMes() {
        return mes;
    }
    /**
     * El metodo setMes le da un valor a dia
     * @param mes Parametro de tipo entero
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * El metodo getAnio recupera el valor guardado en setAnio y lo retonra
     * para utilizarlo
     * @return un tipo entero
     */
    public int getAnio() {
        return anio;
    }
    /**
     * El metodo setAnio le da un valor a dia
     * @param anio Parametro de tipo entero
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
