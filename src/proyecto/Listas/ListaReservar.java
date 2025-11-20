/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;
import java.util.ArrayList;
import proyecto.reservacion.Reservar;

/**
 *
 * @author Jivannia
 */
public class ListaReservar {
      private ArrayList<Reservar> reservaciones = new ArrayList<>();
        int apuntador;
//hola
    public ListaReservar() {
     }
        
            public void agregarReservaALista(Reservar reservar){
        reservaciones.add(reservar);
        apuntador=reservaciones.size();
    }

    public int getApuntador() {
        return reservaciones.size();
    }

    public Reservar[] getReservaciones() {
        return reservaciones.toArray(new Reservar[0]);
    }

    public void setReservaciones(Reservar[] reservaciones) {
        this.reservaciones = new ArrayList<>();
        for(Reservar r: reservaciones){
            if(r !=null) this.reservaciones.add(r);
        }
        apuntador=this.reservaciones.size();
    }
            
      
      public String imprimirLista() {
            String salida= " Lista de Vuelos \n";
            for(int i=0;i<apuntador;i++){
                Reservar r = reservaciones.get(i); 
                salida +="Reservacion{" + "idReservacion=" +  r.getIdReservacion() + 
                ", claseAsignada=" + r.getClaseAsignada() + 
                ", fechaReserva=" + r.getFechaReserva() + 
                ", estado=" + r.getEstado() + 
                
                ", Nombre del Pasajero= "+r.getPasajero().getNombre()+" "
                + r.getPasajero().getApellido1()+" "+ r.getPasajero().getApellido2()+" "
               + ", Modelo de avion=" +r.getVuelo().getCodigo() +
                + '}'+"\n";

                 }
            return salida;
    }
}
