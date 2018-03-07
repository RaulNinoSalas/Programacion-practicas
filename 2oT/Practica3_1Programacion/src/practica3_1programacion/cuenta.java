/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_1programacion;

/**
 *
 * @author Raul Niño Salas 1 DAW Practica 3
 */
public class cuenta {

    private String nombrecliente;
    private String numcuenta;
    private double tipo;
    private double saldo;

    public cuenta() {
    }

    public cuenta(cuenta a) {
        this.nombrecliente = a.nombrecliente;
        this.numcuenta = a.numcuenta;
        this.tipo = a.tipo;
        this.saldo = a.saldo;
    }

    public cuenta(String nombrecliente, String numcuenta, Double tipo, Double saldo) {
        this.nombrecliente = nombrecliente;
        this.numcuenta = numcuenta;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public Double getTipo() {
        return tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setTipo(Double tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // metodo ingreso
    public boolean ingreso(double cantidad) {

        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Su saldo actual " + this.saldo);
        } 
        else {
            return false;
        }
        return true;
    }
    //metodo reintegro

    public boolean reintegro(double cantidad) {

        if (saldo > cantidad && cantidad > 0) {
            this.saldo -= cantidad;
            System.out.println("Su saldo actual " + this.saldo);
        } 
        else {
            return false;
        }
        return true;

    }

    //metodo tranferencia
    public boolean transferencia(double cantidad, Cuenta cliente2) {
        if (this.saldo > cantidad && cantidad > 0) {
            this.saldo -= cantidad;
            cliente2.setSaldo += cantidad;
            System.out.println("Su saldo actual " + this.saldo);
        } 
        else {
            return false;
        }
        return true;
    }

    //menu
    public static void menu() {
        System.out.print("\nOpción 1 : Ingreso\nOpción 2 : Reintegro\n"
                + "Opción 3 : Transferencia \nOpción 4 : Salir\n");
    }
}
