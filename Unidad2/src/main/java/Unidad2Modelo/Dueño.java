/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Unidad2Modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Dueño {

 private String cedula;
    private String nombre;
    private ArrayList<Telefono> telefonoList;

    public Dueño(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefonoList = new ArrayList<Telefono>();
    }

    public void nuevoTelefono(String numero, int extension, String tipoTelefono, String operadora) {
        var telefono1 = new Telefono(numero, extension, tipoTelefono, operadora);
        this.telefonoList.add(telefono1);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Telefono> getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(ArrayList<Telefono> telefonoList) {
        this.telefonoList = telefonoList;
    }

    @Override
    public String toString() {
        var retorno = "Dueño{" + "cedula=" + cedula + ", nombre="
                + nombre + "\n";
        /*
        for(var telefono:this.telefonoList){
            retorno+=telefono.toString()+"\n";
        }*/

        for (var i = 0; i < this.telefonoList.size(); i++) {
            retorno += this.telefonoList.get(i) + "\n";
        }
        return retorno;

    }
}
