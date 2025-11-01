/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;
import java.util.ArrayList;
import proyecto.reservacion.Vuelo;

/**
 *
 * @author Jivannia
 */
public class ListaVuelo {
      private ArrayList<Vuelo> vuelos =new ArrayList<>();
       private int apuntador;

    public ListaVuelo() {
     }
        
            public void agregarVueloALista(Vuelo vuelo){
        vuelos.add(vuelo);
        apuntador=vuelos.size();
    }

    public int getApuntador() {
        return vuelos.size();
    }
        
          

    public Vuelo[] getVuelos() {
        return vuelos.toArray(new Vuelo[0]);
    }

         
            
      
      public String imprimirLista() {
            String salida= " Lista de Vuelos \n";
            for(int i=0;i<apuntador;i++){
                Vuelo v = vuelos.get(i);
                salida +="Vuelo{" + "codigo=" + v.getCodigo()+ ", origen=" + v.getOrigen() + ", destino=" + v.getDestino() + ", precioEjecutiva=" + v.getPrecioEjecutiva() + ", precioEconomica=" + v.getPrecioEjecutiva() + ", Modelo avion=" + v.getAvion().getModelo() + '}'+"\n";

                 }
            return salida;
    }
}
