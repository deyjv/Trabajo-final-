/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import proyecto.reservacion.Vuelo;

/**
 *
 * @author Jivannia
 */
public class ListaVuelo {
      private Vuelo[] vuelos = new Vuelo[99999999];
       private int apuntador;

    public ListaVuelo() {
     }
        
            public void agregarVueloALista(Vuelo vuelo){
        vuelos[apuntador]=vuelo;
        apuntador++;
    }

    public int getApuntador() {
        return apuntador;
    }
        
          

    public Vuelo[] getVuelos() {
        return vuelos;
    }

         
            
      
      public String imprimirLista() {
            String salida= " Lista de Vuelos \n";
            for(int i=0;i<apuntador;i++){
                salida +="Vuelo{" + "codigo=" + vuelos[i].getCodigo()+ ", origen=" + vuelos[i].getOrigen() + ", destino=" + vuelos[i].getDestino() + ", precioEjecutiva=" + vuelos[i].getPrecioEjecutiva() + ", precioEconomica=" + vuelos[i].getPrecioEjecutiva() + ", Modelo avion=" + vuelos[i].getAvion().getModelo() + '}'+"\n";

                 }
            return salida;
    }
}
