/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4programacion;

import java.util.*;
import static practica4programacion.libro.num_lib_tot;

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

        Scanner sc = new Scanner(System.in);
        ArrayList<libro> lista = new ArrayList<>();

        System.out.println("MENU");
        System.out.println("1 Crear libro");
        System.out.println("2 Prestar libro");
        System.out.println("3 Devolver libro");
        System.out.println("4 Mostar libro");
        System.out.println("Introduce el numero de la opcion que quieres");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:                //crear
                lista.add(libro.crearLibro());

                break;
            case 2:                //prestar
                libro.prestarLibro(lista);
                break;
            case 3:                //devolver
                libro.devolverLibro(lista);
                break;
            case 4:                 //mostar
                System.out.println("ISBN del libro a localizar: ");
                libro.mostrarLibro();
                break;
        }

    }
}
