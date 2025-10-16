/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.reservacion;

/**
 *
 * @author deisy
 */
public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private double precioEjecutiva;
    private double precioEconomica;
    private Avion avion;

    public Vuelo(String codigo, String origen, String destino, double precioEjecutiva, double precioEconomica, Avion avion) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.precioEjecutiva = precioEjecutiva;
        this.precioEconomica = precioEconomica;
        this.avion = avion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecio(String clase) {
        if (clase.equalsIgnoreCase("Ejecutiva"))
            return precioEjecutiva;
        else
            return precioEconomica;
    }

    public Avion getAvion() {
        return avion;
    }
    
}
