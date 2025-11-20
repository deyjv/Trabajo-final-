/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Listas;

import java.util.ArrayList;
import proyecto.reservacion.Factura;
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
            StringBuilder salida= new StringBuilder();
            for(int i=0;i<apuntador;i++){
                Tiquete t= tiquetes.get(i);
                salida.append(t.toString()).append("\n\n");
                 }
            return salida.toString();
    
    }
}
