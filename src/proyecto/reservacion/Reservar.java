/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.reservacion;

/**
 *
 * @author Jivanna
 */
public class Reservar {
    private String idReservacion;
    private String claseAsignada;
    private String fechaReserva;
    private String estado;
     private Pasajero pasajero;
     private Avion avion;
     private Tiquete tiquete;

    public Reservar(String idReservacion, String claseAsignada, String fechaReserva, String estado, Pasajero pasajero, Avion avion, Tiquete tiquete) {
        this.idReservacion = idReservacion;
        this.claseAsignada = claseAsignada;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.pasajero = pasajero;
        this.avion = avion;
        this.tiquete = tiquete;
    }

    public String getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(String idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getClaseAsignada() {
        return claseAsignada;
    }

    public void setClaseAsignada(String claseAsignada) {
        this.claseAsignada = claseAsignada;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "idReservacion=" + idReservacion + 
                ", claseAsignada=" + claseAsignada + 
                ", fechaReserva=" + fechaReserva + 
                ", estado=" + estado + 
                
                ", Nombre del Pasajero= "+ pasajero.getNombre()+" "
                + pasajero.apellido1+" "+ pasajero.apellido2+" "
               + ", Modelo de avion=" + avion.getModelo() +
                ", Vuelo Destino a=" + tiquete.getAeropuertoDestino() + '}';
    }
     


}
