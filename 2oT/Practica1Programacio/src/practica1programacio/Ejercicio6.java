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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void ejercicio6 (){
        int num1[] = new int[10];
        int num2[] = new int[10];
        int numF[] = new int[20];
        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca los 10 numeros de la Tabla 1: ");
            num1[i] = sc.nextInt();
        }
        System.out.println("Esta tabla es ");
        for (int j = 0; j < 10; j++) {
            System.out.println(num1[j]);
        }

        System.out.println("Ahora toca la siguiente tabla.\n");

        for (int k = 0; k < 10; k++) {
            System.out.print("Introduzca 10 numeros de la Tabla 2: ");
            num2[k] = sc.nextInt();
        }
        System.out.println("Esta tabla es ");
        for (int l = 0; l < 10; l++) {
            System.out.println(num2[l]);
        }
        for (int m = 0; m < 20; m++) {
            numF[m] = num1[b];
            b+=3;
        }
        
        for (int n = 0; n < 20; n++) {
            numF[n += 3] = num2[a];
            a+=3 ;
        }
        for (int p = 0; p < 20; p++) {
            System.out.println("La tabla final es \n" + numF[p]);
        }
    }
}
