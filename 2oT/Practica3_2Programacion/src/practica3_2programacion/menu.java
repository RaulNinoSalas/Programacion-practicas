/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2programacion;

import java.util.Scanner;
import static practica3_2programacion.bus.menu;


/**
 *
 * @author semec
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        bus bus1 = new bus("F1621t", "Iveco", "", 15);
        bus bus2 = new bus("A5222g", "", "gas", 0);
        bus bus3 = new bus("", "Renault", "gasolina", 5);

        Boolean salir = false;
        int opcion;
        Scanner sc = new Scanner(System.in);

        while (!salir) {
            menu();
            System.out.println("\nElija una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opcion Mostrar");
                    bus.mostrarbus(bus3);
                    break;

                case 2:
                    bus.asignarmotor(bus1);
                    System.out.println("Has elegido la opcion Asignar motor");
                    break;

                case 3:
                    System.out.println("Has elegido la opcion Asignar linea");
                    bus.asignarlinea(bus3);
                    break;

                case 4:
                    salir = true;
                    break;

            }
        }
    }

}
