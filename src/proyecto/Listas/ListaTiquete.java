/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;


import proyecto.reservacion.Tiquete;

/**
 *
 * @author Jivannia
 */
public class ListaTiquete {
      private Tiquete[] tiquetes = new Tiquete[99999999];
        int apuntador;

    public ListaTiquete() {
     }

      
        
        
        
        
            public void agregarTiqueteALista(Tiquete tiquete){
        tiquetes[apuntador]=tiquete;
        apuntador++;
    }
      
      public String imprimirLista() {
            String salida= " Lista de Tiquetes \n";
            for(int i=0;i<apuntador;i++){
                salida += "Tiquete{ codigoPNR=" + tiquetes[i].getCodigoPNR() + ", numeroVuelo=" + tiquetes[i].getNumeroVuelo() + ", aeropuertoOrigen=" + tiquetes[i].getAeropuertoOrigen() +
                ", aeropuertoDestino=" + tiquetes[i].getAeropuertoDestino() + ", fechaHoraSalida=" + tiquetes[i].getFechaHoraSalida() + ", fechaHoraLlegada=" + tiquetes[i].getFechaHoraLlegada() +
                ", numeroAsiento=" + tiquetes[i].getNumeroAsiento() + ", puertaEmbarque=" + tiquetes[i].getPuertaEmbarque() + ", codigoAerolinea=" + tiquetes[i].getCodigoAerolinea() + '}'+"\n";
    
                 }
            return salida;
    }
}
