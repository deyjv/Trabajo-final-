/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.reservacion;

/**
 *
 * @author deisy
 */
public class Avion {
    private String modelo;
    private int capacidadEjecutiva;
    private int capacidadEconomica;
    private int disponiblesEjecutiva;
    private int disponiblesEconomica;

    public Avion(String modelo, int capacidadEjecutiva, int capacidadEconomica) {
        this.modelo = modelo;
        this.capacidadEjecutiva = capacidadEjecutiva;
        this.capacidadEconomica = capacidadEconomica;
        this.disponiblesEjecutiva = capacidadEjecutiva;
        this.disponiblesEconomica = capacidadEconomica;
    }

    public boolean hayDisponibilidad(String clase) {
        if (clase.equalsIgnoreCase("Ejecutiva"))
            return disponiblesEjecutiva > 0;
        else
            return disponiblesEconomica > 0;
    }

    public void ocuparAsiento(String clase) {
        if (clase.equalsIgnoreCase("Ejecutiva"))
            disponiblesEjecutiva--;
        else
            disponiblesEconomica--;
    }

    public String getModelo() {
        return modelo;
    }
}
