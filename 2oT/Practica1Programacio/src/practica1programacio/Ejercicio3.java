/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1programacio;

import java.util.Scanner;

public class Ejercicio3 {

    public static void ejercicio3() {

        int num[] = new int[5];
        int positivos = 0, negativos = 0, ceros = 0;
        double sumaN = 0, sumaP = 0;
        int sumace = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduzca un numero: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                sumaN += num[i];
                negativos++;

            }
            if (num[i] > 0) {
                sumaP += num[i];
                positivos++;
            }
            if (num[i] == 0) {
                sumace += num[i];
                ceros++;
            }
        }

        System.out.println("La media de los numeros positivos es: " + sumaP / positivos);
        System.out.println("La media de los numeros negativos es: " + sumaN / negativos);
        System.out.println("Los ceros que hay en la lista son: " + ceros);

    }
}
