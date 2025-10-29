/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import proyecto.reservacion.Factura;

/**
 *
 * @author Jivannia
 */
public class ListaFactura {
 private Factura[] facturas = new Factura[99999999];
 int apuntador;
    public ListaFactura() {
        
    }

     public void agregarFacturaALista(Factura factura){
        facturas[apuntador]=factura;
        apuntador++;
    }
            
            
            
      public String imprimirLista() {
            String salida= " Factura \n";
            for(int i=0;i<apuntador;i++){
                salida +=" idFactura=" +facturas[i].getIdFactura() +
                         
                        "\n\n";
                 }
            return salida;
    }
}
