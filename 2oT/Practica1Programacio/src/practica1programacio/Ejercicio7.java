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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Scanner c = new Scanner(System.in);

    
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 4");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        
        System.out.println("Elige la opcion del menu: ");
        int ejercicio = c.nextInt();
        
        switch(ejercicio){
            case 1:
                Ejercicio1.ejercicio1();
                break;
            case 2:
                Ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3.ejercicio3();
                break;
            case 4:
                Ejercicio4.ejercicio4();
                break;
            case 5:
                Ejercicio5.ejercicio5();
                break; 
            case 6:
                Ejercicio6.ejercicio6();
                break;
    }
    }
}
