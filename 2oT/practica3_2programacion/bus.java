/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2programacion;

/**
 *
 * @author Raul Niño Salas DAW 1 Practica 3.2
 */
public class bus {

    String matricula;
    String marca;
    String motor;
    int linea;

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
    
    //muestra bus
    public void mostrarbus() {
        
        System.out.println("Marca : " + this.marca);
        System.out.println("Matricula : " + this.matricula);
        System.out.println("Tipo de motor : " + this.motor);
        System.out.println("Linea asignada : " + this.linea);
        
    }
    public void asignarmotor() {
        
    
    }
 
    public void asignarlinea () {
        
    
        System.out.println("Que linea quiere asignar a este bus?");
    }

     
    public static void menu(){
        
    }
 }
