/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import java.util.ArrayList;
import proyecto.reservacion.Factura;

/**
 *
 * @author Jivannia
 */
public class ListaFactura {
 private ArrayList<Factura> facturas=new ArrayList<>();
 int apuntador;
    public ListaFactura() {
        
    }

     public void agregarFacturaALista(Factura factura){
        facturas.add(factura);
        apuntador=facturas.size();
    }

    public Factura[] getFacturas() {
        return facturas.toArray(new Factura[0]);
    }
     
            
            
            
      public String imprimirLista() {
            StringBuilder salida= new StringBuilder();
            for(int i=0;i<apuntador;i++){
                Factura f= facturas.get(i);
                salida.append(f.toString()).append("\n\n");
                 }
            return salida.toString();
    }
}
