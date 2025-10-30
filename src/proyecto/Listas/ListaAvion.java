/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import proyecto.reservacion.Avion;

/**
 *
 * @author Jivannia
 */
public class ListaAvion {
      private Avion[] aviones = new Avion[999];
        int apuntador;

    public ListaAvion() {
     }

      
        
        
        
        
            public void agregarAvionALista(Avion avion){
        aviones[apuntador]=avion;
        apuntador++;
    }

    public Avion[] getAviones() {
        return aviones;
    }

    public int getApuntador() {
        return apuntador;
    }
            
      
      public String imprimirLista() {
            String salida= " Lista de Aviones \n";
            for(int i=0;i<apuntador;i++){
                salida += "Avion{" + "modelo=" + aviones[i].getModelo() + ", capacidadEjecutiva=" + aviones[i].getCapacidadEjecutiva() + ", capacidadEconomica=" +  aviones[i].getCapacidadEconomica()+ ", disponiblesEjecutiva=" + aviones[i].getDisponiblesEjecutiva() + ", disponiblesEconomica=" + aviones[i].getDisponiblesEconomica() + '}'+"\n";
                 }
            return salida;
    }
}
