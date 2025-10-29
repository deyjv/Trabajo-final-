/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.reservacion;

/**
 *
 * @author Jivannia
 */
public class Factura {
    private String idFactura;
    private Reservar reservacion;
    private double totalImpuestos;
    private double montoTotal;
    
    

        
     public Factura() {
      
    }
    public Factura(String idFactura) {
        this.idFactura = idFactura;
   
    }
    
    public Factura(String idFactura, Reservar reservacion, double totalImpuestos, double precioTiquete) {
        this.idFactura = idFactura;
        this.reservacion = reservacion;
        this.totalImpuestos = totalImpuestos;
   
    }


    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public Reservar getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservar reservacion) {
        this.reservacion = reservacion;
    }


    public double getTotalImpuestos() {
        return totalImpuestos;
    }

    public void setTotalImpuestos(double totalImpuestos) {
        this.totalImpuestos = totalImpuestos;
    }

  

    public double getMontoTotal() {
        montoTotal+=this.getTotalImpuestos();
        return montoTotal;
    }

    @Override
    public String toString() {
        String salida= " Factura \n";
       salida +=" idFactura=" + idFactura +
                "\n Fecha de reservacion=" + reservacion.getFechaReserva() +
                "\n Clase=" + reservacion.getClaseAsignada()+
                "\n totalImpuestos=" + totalImpuestos +
           
                "\n montoTotal=" + getMontoTotal() ;
        
        return salida;
    }

    
    

  

    
}
