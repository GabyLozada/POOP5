/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Metodo que realiza el llenaod y la impresión de los datos personales
 * del usuario
 * @author Gabriela Aquino Lozada 
 * @author Renata Barbosa Reyes
 * @author Ruben Alberto Ortega Macias
 *
 */
public class POOP5 {
        public static void main(String[] args) {
        Persona per1 = new Persona();
        per1.setNombre("Ruben");
        per1.setApellido("Ortega");
        Fecha f1 = new Fecha();
        f1.setDia(15);
        f1.setMes(11);
        f1.setAnio(1998);
        per1.setfNacimiento(f1);
        System.out.println(per1.getNombre());
        System.out.println(per1.getApellido());
        System.out.println(per1.getfNaimiento().getDia());
        System.out.println(per1.getfNaimiento().getMes());
        System.out.println(per1.getfNaimiento().getAnio());
        System.out.println(per1);
        
        Persona per2 = new Persona("Gabriela", "Aquino",f1);
        System.out.println(per2.getNombre());
        System.out.println(per2);
        
        Persona per3 = new Persona("Iram","Franco",8,6,2001);
        System.out.println(per3);
        
        //String cadena = new String("Soy una cadena");
        String cadena = "Soy una cadena";
        System.out.println(cadena);
        
        Persona per4 = new Persona("Dayna","Suarez",new Fecha(18,8,2002));
        System.out.println(per4);
    }
    
}

