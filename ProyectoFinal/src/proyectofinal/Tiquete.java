
package proyectofinal;

import java.time.LocalDateTime;

/**
 *
 * @author azu
 */
public class Tiquete {
    private Pasajero pasa;
    private String codigoPNR;
    private String numeroVuelo;
    private String aeropuertoOrigen;
    private String aeropuertoDestino;
    private String fechaHoraSalida;
    private String fechaHoraLlegada;
    private String numeroAsiento;
    private String puertaEmbarque; // puede ser null
    private String codigoAerolinea;

    public Tiquete() {
    }

    public Tiquete(Pasajero pasa, String codigoPNR, String numeroVuelo, String aeropuertoOrigen, String aeropuertoDestino, String fechaHoraSalida, String fechaHoraLlegada, String numeroAsiento, String puertaEmbarque, String codigoAerolinea) {
        this.pasa = pasa;
        this.codigoPNR = codigoPNR;
        this.numeroVuelo = numeroVuelo;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.numeroAsiento = numeroAsiento;
        this.puertaEmbarque = puertaEmbarque;
        this.codigoAerolinea = codigoAerolinea;
    }

    public String getCodigoPNR() {
        return codigoPNR;
    }

    public void setCodigoPNR(String codigoPNR) {
        this.codigoPNR = codigoPNR;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(String aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public String getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(String aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public String getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(String fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(String fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(String puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public String getCodigoAerolinea() {
        return codigoAerolinea;
    }

    public void setCodigoAerolinea(String codigoAerolinea) {
        this.codigoAerolinea = codigoAerolinea;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "pasa=" + pasa + ", codigoPNR=" + codigoPNR + ", numeroVuelo=" + numeroVuelo + ", aeropuertoOrigen=" + aeropuertoOrigen +
                ", aeropuertoDestino=" + aeropuertoDestino + ", fechaHoraSalida=" + fechaHoraSalida + ", fechaHoraLlegada=" + fechaHoraLlegada +
                ", numeroAsiento=" + numeroAsiento + ", puertaEmbarque=" + puertaEmbarque + ", codigoAerolinea=" + codigoAerolinea + '}';
    }
    
    public static void main(String[] args) {
        
      
Pasajero pasajero = new Pasajero("felix","hernandez","rose","Costaricense",700000000,"15/11/2003");


Tiquete tiquete = new Tiquete(
    pasajero,
    "PNR123456",               // códigoPNR
    "AV650",                   // númeroVuelo
    "SJO",                     // aeropuertoOrigen
    "LIM",                     // aeropuertoDestino
    "2025-10-15T08:30",        // fechaHoraSalida
    "2025-10-15T12:45",        // fechaHoraLlegada
    "12A",                     // númeroAsiento
    "G5",                      // puertaEmbarque (puede ser null)
    "AV"                       // códigoAerolinea
);
        System.out.println(tiquete);
        
    }
    
    
}
