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
public class Ejercicio2 {

    public static void ejercicio2() {

        int num[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {

            System.out.print("Introduzca un numero: ");

            num[i] = sc.nextInt();

        }

        System.out.println("Los numeros a la inversa son: ");

        for (int i = num.length - 1; i >= 0; i--) {

            System.out.println("Elementos: nº" + i + "=" + num[i]);

        }
    }
}
