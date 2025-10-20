import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /** Declaracion de objetos*/

        FrecuenciasCardiacas persona1 = new FrecuenciasCardiacas();
        FrecuenciasCardiacas persona2 = new FrecuenciasCardiacas();

        Scanner sc = new Scanner(System.in);

        /**Lectura de las variables*/


        System.out.println("***************-> BIENVENIDO <-******************");
        System.out.println("**************-> AL PROGRAMA! <-*****************");

        System.out.print("Nombre : ");
        persona1.setPrimerNombre(sc.nextLine());
        System.out.print("Apellido : ");
        persona1.setApellido(sc.nextLine());
        System.out.print("Dia :   ");
        persona1.setDia(Integer.parseInt((sc.nextLine())));
        System.out.print("Mes :   ");
        persona1.setMes(Integer.parseInt((sc.nextLine())));
        System.out.print("Año :   ");
        persona1.setAño(Integer.parseInt(sc.nextLine()));


        /**System.out.print("Nombre : ");
        persona2.setPrimerNombre(sc.nextLine());
        System.out.print("Apellido : ");
        persona2.setApellido(sc.nextLine());
        System.out.print("Dia :   ");
        persona2.setDia(Integer.parseInt((sc.nextLine())));
        System.out.print("Mes :   ");
        persona2.setMes(Integer.parseInt((sc.nextLine())));
        System.out.print("Año :   ");
        persona2.setAño(Integer.parseInt(sc.nextLine()));*/




        persona1.detalle();
        System.out.println();
        persona2.detalle();
        System.out.println();






    }
}