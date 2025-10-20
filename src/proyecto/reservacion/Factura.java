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
    private Reservacion reservacion;
    private double totalImpuestos;
     private double precioTiquete;
    private double montoTotal;

    public Factura(String idFactura, Reservacion reservacion, double totalImpuestos, double precioTiquete) {
        this.idFactura = idFactura;
        this.reservacion = reservacion;
        this.totalImpuestos = totalImpuestos;
        this.precioTiquete = precioTiquete;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }


    public double getTotalImpuestos() {
        return totalImpuestos;
    }

    public void setTotalImpuestos(double totalImpuestos) {
        this.totalImpuestos = totalImpuestos;
    }

    public double getPrecioTiquete() {
        return precioTiquete;
    }

    public void setPrecioTiquete(double precioTiquete) {
        this.precioTiquete = precioTiquete;
    }

    public double getMontoTotal() {
        montoTotal+=this.getPrecioTiquete()+this.getTotalImpuestos();
        return montoTotal;
    }

    @Override
    public String toString() {
        String salida= " Factura \n";
       salida +=" idFactura=" + idFactura +
                "\n Fecha de reservacion=" + reservacion.getFechaReserva() +
                "\n Clase=" + reservacion.getClaseAsignada()+
                "\n totalImpuestos=" + totalImpuestos +
                "\n precioTiquete=" + precioTiquete +
                "\n montoTotal=" + getMontoTotal() ;
        
        return salida;
    }

  

    
}
