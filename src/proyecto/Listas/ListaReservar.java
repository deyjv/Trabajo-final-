/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import proyecto.reservacion.Reservar;

/**
 *
 * @author Jivannia
 */
public class ListaReservar {
      private Reservar[] reservaciones = new Reservar[99999999];
        int apuntador;

    public ListaReservar() {
     }
        
            public void agregarVueloALista(Reservar reservar){
        reservaciones[apuntador]=reservar;
        apuntador++;
    }

    public Reservar[] getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(Reservar[] reservaciones) {
        this.reservaciones = reservaciones;
    }
            
      
      public String imprimirLista() {
            String salida= " Lista de Vuelos \n";
            for(int i=0;i<apuntador;i++){
                salida +="Reservacion{" + "idReservacion=" +  reservaciones[i].getIdReservacion() + 
                ", claseAsignada=" + reservaciones[i].getClaseAsignada() + 
                ", fechaReserva=" + reservaciones[i].getFechaReserva() + 
                ", estado=" + reservaciones[i].getEstado() + 
                
                ", Nombre del Pasajero= "+reservaciones[i].getPasajero().getNombre()+" "
                + reservaciones[i].getPasajero().getApellido1()+" "+ reservaciones[i].getPasajero().getApellido2()+" "
               + ", Modelo de avion=" +reservaciones[i].getVuelo().getCodigo() +
                ", Vuelo Destino a=" + reservaciones[i].getTiquete().getAeropuertoDestino() + '}'+"\n";

                 }
            return salida;
    }
}
