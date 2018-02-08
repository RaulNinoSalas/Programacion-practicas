/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Raul Niño Salas DAW 1 Practica 3.2
 */
public class bus {

    String matricula;
    String marca;
    String motor;
    int linea;

    public static List<bus> lista = new ArrayList<>();

    public bus(String matricula, String marca, String motor, int linea) {
        this.matricula = matricula;
        this.marca = marca;
        this.motor = motor;
        this.linea = linea;
    }

    public bus() {
    }

    public bus(bus a) {
        this.matricula = a.matricula;
        this.marca = a.marca;
        this.motor = a.motor;
        this.linea = a.linea;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }

    public int getLinea() {
        return linea;
    }

    static Scanner sc = new Scanner(System.in);
    static int a;

    static String b;

    //muestra bus
    static public void mostrarbus(bus p) {
        System.out.println("Has elegido la opcion Mostrar Libro");
        lista.forEach((bus) -> {
            System.out.println("Marca: " + p.getMarca() + " Matricula: " + p.getMarca() + "Motor: " + p.getMotor() + "Linea: " + p.getLinea());
        });
    }

    static boolean asignarmotor(bus p) {
        System.out.println("A que bus(1,2,3) quieres asignar tipo de combustible?");
        b = sc.nextLine();
        System.out.println("Introduce el tipo de combustible: ");
        p.setMotor() = sc.nextLine();
        return true;

    }

    static boolean asignarlinea(bus p) {
        System.out.println("A que bus(1,2,3) quieres asignar una linea?");
        a = sc.nextInt();
        System.out.println("Introduce el tipo de combustible: ");
        p.setLinea()= sc.nextLine();
        return true;

    }
    public static void menu() {

    }
}
