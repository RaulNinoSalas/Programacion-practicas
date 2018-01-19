/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1programacio;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author Raul
 */
public class Ejercicio4 {

    public static void ejercicio4() {

        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduzca un numero: ");
            num[i] = sc.nextInt();
        }
        System.out.print("Este es el orden que queremos " + num[0] + "," + num[9] + "," + num[1] + "," + num[8] + "," + num[2] + "," + num[7] + "," + num[3] + "," + num[6] + "," + num[4] + "," + num[5]);

    }
}
