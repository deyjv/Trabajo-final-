/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import java.util.ArrayList;
import proyecto.reservacion.Pasajero;

/**
 *
 * @author Jivannia
 */
public class ListaPasajero {
      private ArrayList<Pasajero> pasajeros=new ArrayList<>();
        int apuntador;

    public ListaPasajero() {
     }

      
        
        
        
        
            public void agregarPasajeroALista(Pasajero pasajero){
        pasajeros.add(pasajero);
        apuntador++;
    }

    public int getApuntador() {
        return pasajeros.size();
    }

    public Pasajero[] getPasajeros() {
        return pasajeros.toArray(new Pasajero[0]);
    }
            
      
      public String imprimirLista() {
            String salida= " Lista de Pasajeros \n";
            for(int i=0;i<apuntador;i++){
                Pasajero p = pasajeros.get(i);
                salida += "Pasajero " + "nombre= " + p.getNombre() + " apellido1= " + p.getApellido1() + " apellido2= " +  p.getApellido2() + " nacionalidad= " + p.getNacionalidad() + " cedula= " + p.getCedula() + " fechaNacimiento= " + p.getFechaNacimiento()+"\n" ;
                 }
            return salida;
    }
}
