/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad2Vista;

import Unidad2Modelo.Dueño;

/**
 *
 * @author usuario
 */
public class Principal2 {
  public static void main(String[]arga){
 var juana = new Dueño ("0104048794","Juana Moreno Dávila");
        juana.nuevoTelefono("0984357604", 0, "Móvil personal", "Bellsouth");
        juana.nuevoTelefono("072818314", 0, "Casa", "Etapa");
        juana.nuevoTelefono("0984357604", 0, "Móvil de mi esposo", "Movistar");
        
        System.out.println("juana = " + juana.toString());   
    }
}
