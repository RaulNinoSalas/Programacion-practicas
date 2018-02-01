/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_1programacion;

import java.util.Scanner;
import static practica3_1programacion.cuenta.menu;

/**
 *
 * @author Raul Niño Salas 1 DAW Practica 3
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        cuenta cliente1 = new cuenta("Antonio", "0001", 1.5, 1000.0);
        cuenta cliente2 = new cuenta("Raul", "0002", 1.5, 5000.0);

        Boolean salir = false;
        int opcion;
        Scanner sc = new Scanner(System.in);

        while (!salir) {
            menu();
            System.out.println("\nElija una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Que cantidad quiere ingresar?");
                    if (cliente1.ingreso(sc.nextInt())) {
                        System.out.println("Hecho");

                    }
                    else {
                        System.out.println("Esta operacion no es valida");
                    }
                    break;
                case 2:
                    System.out.println("¿Que cantidad quiere retirar?");
                    if (cliente1.reintegro(sc.nextInt())) {
                        System.out.println("Hecho");
                    }
                    else {
                        System.out.println("Esta operacion no es valida");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuanto quiere transferir?");
                    if (cliente1.transferencia(sc.nextInt(), Cuenta cliente2)) {
                        System.out.println("Hecho");
                    } 
                    else {
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
