import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String PrimerNombre = "Gaby";
    private String apellido = "Haro";
    private int dia = 24;
    private int mes = 7;
    private int año = 2005;
    private int edad;
    private String FrecuenciaCardiacaMaxima;
    private String FrecuenciaCardiacaEsperada;





    /**Constructores y los destructores*/

    public FrecuenciasCardiacas() {
    }

    public FrecuenciasCardiacas(String primerNombre, String apellido) {
        PrimerNombre = primerNombre;
        this.apellido = apellido;
    }

    public FrecuenciasCardiacas(String primerNombre, String apellido, int dia, int mes, int año) {
        PrimerNombre = primerNombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    /** Metodos propios de JAVA*/


    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        PrimerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    /** Los Metodos Propios*/

    public void detalle(){
        System.out.println("Su Nombre              :  "  + this.PrimerNombre);
        System.out.println("Su Apellido            :  "  + this.apellido);
        System.out.println("El dia                 :  "  + this.dia);
        System.out.println("El mes                 :  "  + this.mes);
        System.out.println("El año                 :  "  + this.año);
    }

}
