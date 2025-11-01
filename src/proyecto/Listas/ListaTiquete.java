/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import java.util.ArrayList;
import proyecto.reservacion.Tiquete;

/**
 *
 * @author Jivannia
 */
public class ListaTiquete {
      private ArrayList<Tiquete> tiquetes = new ArrayList<>();
        int apuntador;

    public ListaTiquete() {
     }

      
        
        
        
        
            public void agregarTiqueteALista(Tiquete tiquete){
        tiquetes.add(tiquete);
        apuntador=tiquetes.size();
    }

    public Tiquete[] getTiquetes() {
        return tiquetes.toArray(new Tiquete[0]);
    }

    public int getApuntador() {
        return tiquetes.size();
    }
            
     
      public String imprimirLista() {
            String salida= " Lista de Tiquetes \n";
            for(int i=0;i<apuntador;i++){
                Tiquete t = tiquetes.get(i);
                salida += "Tiquete{ Pasajero Nombre"+t.getPasa().getNombre()+" codigoPNR=" + t.getCodigoPNR() + ", numeroVuelo=" + t.getNumeroVuelo() + ", aeropuertoOrigen=" + t.getAeropuertoOrigen() +
                ", aeropuertoDestino=" + t.getAeropuertoDestino() + ", fechaHoraSalida=" + t.getFechaHoraSalida() + ", fechaHoraLlegada=" + t.getFechaHoraLlegada() +
                ", numeroAsiento=" + t.getNumeroAsiento() + ", puertaEmbarque=" + t.getPuertaEmbarque() + ", codigoAerolinea=" + t.getCodigoAerolinea() + '}'+"\n";
    
                 }
            return salida;
    }
}
