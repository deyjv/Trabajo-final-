
package proyecto.reservacion;

/**
 *
 * @author azu
 */
public class Pasajero {
   String nombre, apellido1,apellido2, nacionalidad;//estos de toda la vida 
   int cedula;// se pueden cambiar 
   String fechaNacimiento;//se puede cambiar por un localDate pero de momento se va a trabajar asi
   
    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido1, String apellido2, String nacionalidad, int cedula, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacionalidad = nacionalidad;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

   
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Pasajero " + "nombre= " + nombre + " apellido1= " + apellido1 + " apellido2= " + apellido2 + " nacionalidad= " + nacionalidad + " cedula= " + cedula + " fechaNacimiento= " + fechaNacimiento ;
    }
   
 /*  public static void main(String[] args) {
        
        Pasajero pasa = new Pasajero("felix","hernandez","rose","Costaricense",700000000,"15/11/2003");//este es el objeto pasajero
        System.out.println(pasa);//aqui lo imprimimos por una prueba de rutina 
    }
    */
    
}
