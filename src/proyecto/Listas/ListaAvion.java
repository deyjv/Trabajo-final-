/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import java.util.ArrayList;
import proyecto.reservacion.Avion;

/**
 *
 * @author Jivannia
 */
public class ListaAvion {
      private ArrayList<Avion> aviones = new ArrayList<>();
        int apuntador;

    public ListaAvion() {
     }

      
        
        
        
        
            public void agregarAvionALista(Avion avion){
        aviones.add(avion);
        apuntador=aviones.size();
    }

    public Avion[] getAviones() {
        return aviones.toArray(new Avion[0]);
    }

    public int getApuntador() {
        return aviones.size();
    }
            
      
      public String imprimirLista() {
            String salida= " Lista de Aviones \n";
            for(int i=0;i<apuntador;i++){
                Avion a=aviones.get(i);
                salida += "Avion{" + "modelo=" + a.getModelo() + ", capacidadEjecutiva=" + a.getCapacidadEjecutiva() + ", capacidadEconomica=" +  a.getCapacidadEconomica()+ ", disponiblesEjecutiva=" + a.getDisponiblesEjecutiva() + ", disponiblesEconomica=" + a.getDisponiblesEconomica() + '}'+"\n";
                 }
            return salida;
    }
}
