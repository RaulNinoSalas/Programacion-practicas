package practica2programacion;

import java.util.Scanner;


public class Menu {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println(" Ejercicio 1 \n Ejercicio 2 \n Ejercicio 3 \n "
                + "Ejercicio 4 \n Ejercicio 5 \n Ejercicio 6 \n");
        
        int ejercicio=entrada.nextInt();
        
        
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