/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;


import proyecto.reservacion.Pasajero;

/**
 *
 * @author Jivannia
 */
public class ListaPasajero {
      private Pasajero[] pasajeros = new Pasajero[99999999];
        int apuntador;

    public ListaPasajero() {
     }

      
        
        
        
        
            public void agregarPasajeroALista(Pasajero pasajero){
        pasajeros[apuntador]=pasajero;
        apuntador++;
    }
      
      public String imprimirLista() {
            String salida= " Lista de Pasajeros \n";
            for(int i=0;i<apuntador;i++){
                salida += "Pasajero " + "nombre= " + pasajeros[i].getNombre() + " apellido1= " + pasajeros[i].getApellido1() + " apellido2= " +  pasajeros[i].getApellido2() + " nacionalidad= " + pasajeros[i].getNacionalidad() + " cedula= " + pasajeros[i].getCedula() + " fechaNacimiento= " + pasajeros[i].getFechaNacimiento()+"\n" ;
                 }
            return salida;
    }
}
