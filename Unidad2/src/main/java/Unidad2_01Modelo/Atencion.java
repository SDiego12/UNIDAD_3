/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad2_01Modelo;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Atencion {
  private LocalDate fecha;
    private String veterinario;
    private double costo;
    private Mascota mascota;
    private int cantidadRecetas;
    private Receta[] recetaList;

    public Atencion(LocalDate fecha, String veterinario, double costo,
            Mascota mascota, int cantidadRecetas) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.mascota = mascota;
        this.cantidadRecetas = cantidadRecetas;
        this.recetaList = new Receta[this.cantidadRecetas];
    }

    public void nuevaReceta(String medicamento, int cantidad, String indicacion, int posicion) {
        var receta = new Receta(medicamento, cantidad, indicacion);
        this.recetaList[posicion] = receta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getCantidadRecetas() {
        return cantidadRecetas;
    }

    public void setCantidadRecetas(int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
    }

    public Receta[] getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(Receta[] recetaList) {
        this.recetaList = recetaList;
    }

    @Override
    public String toString() {
        var retorno = "Atencion{" + "fecha=" + fecha.toString() + ", veterinario="
                + veterinario + ", costo=" + costo + ", mascota=" + mascota
                + ", cantidadRecetas=" + cantidadRecetas + "\n";

        for (var receta : this.recetaList) {
            retorno += receta.toString() + "\n";
        }
        return retorno;
    }  
}
