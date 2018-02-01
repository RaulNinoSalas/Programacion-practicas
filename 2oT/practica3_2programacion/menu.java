/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2programacion;

import static practica3_2programacion.bus.menu;
import java.util.Scanner;

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

        bus bus1 = new bus ("", "F1621t", "gas", 15);
        bus bus2 = new bus ("", "A522g", "diesel",0);

        Boolean salir = false;
        int opcion;
        Scanner sc = new Scanner(System.in);

        while (!salir) {
            menu();
            System.out.println("\nElija una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1 Mostrar");
                    if (bus.mostrar(sc.nextInt())) {
                        System.out.println("Hecho");

                    } else {
                        System.out.println("Esta operacion no es valida");
                    }
                    break;
                case 2:
                    System.out.println("2 Asignar motor");
                    if (bus.    (sc.nextInt())) {
                        System.out.println("Hecho");
                    } else {
                        System.out.println("Esta operacion no es valida");
                    }
                    break;
                case 3:
                    System.out.println("3 Asignar linea");
                    if (bus1.transferencia(sc.nextInt(), bus2)) {
                        System.out.println("Hecho");
                    } else {
                        System.out.println("Esta operacion no es valida");
                    }
                    break;
                case 4:
                    salir = true;
                    break;

            }
        }
    }

}
