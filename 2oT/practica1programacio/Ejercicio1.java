/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1programacio;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void ejercicio1() {
        // TODO code application logic here
        int numeros[];

        numeros = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Introduzca un numero: ");

            numeros[i] = sc.nextInt();

        }

        System.out.println("Los numeros son: ");

        for (int i = 0; i < 5; i++) {

            System.out.println("Elementos: nº" + i + "=" + numeros[i]);
        }
    }

}
