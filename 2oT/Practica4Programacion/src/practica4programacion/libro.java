/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4programacion;

import java.util.*;

/**
 *
 * @author Raul Niño Salas 1 DAW Practica 4
 */
public class libro {

    private String titulo;
    private String autor;
    private String ISBN;
    private int ejemplareslib;//prestados de este libro
    private int totlib;// total de libro

    public static int num_lib_pres_tot;//prestados de todos los libros
    public static int num_lib_tot;//total de todos los libros

    public static List<libro> lista = new ArrayList<>();

    public libro() {
    }

    public libro(libro a) {
        this.titulo = a.titulo;
        this.autor = a.autor;
        this.ISBN = a.ISBN;
        this.ejemplareslib = a.ejemplareslib;
        this.totlib = a.totlib;

    }

    public libro(String titulo, String autor, String ISBN, int ejemplareslib, int totlib) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ejemplareslib = ejemplareslib;
        this.totlib = totlib;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEjemplareslib() {
        return ejemplareslib;
    }

    public void setEjemplareslib(int ejemplareslib) {
        this.ejemplareslib = ejemplareslib;
    }

    public int getTotlib() {
        return totlib;
    }

    public void setTotlib(int totlib) {
        this.totlib = totlib;
    }

    public static int getNum_lib_pres_tot() {
        return num_lib_pres_tot;
    }

    public static void setNum_lib_pres_tot(int num_lib_pres_tot) {
        libro.num_lib_pres_tot = num_lib_pres_tot;
    }

    public static int getNum_lib_tot() {
        return num_lib_tot;
    }

    public static void setNum_lib_tot(int num_lib_tot) {
        libro.num_lib_tot = num_lib_tot;
    }

    
    static public boolean encontrarLibro(ArrayList<libro> p) {
        Scanner sc = new Scanner(System.in);
        boolean encontrar = false;
        int i = 0;
        String isbn = sc.nextLine();
        System.out.println("Introduce el numero ISBN del libro");
        while ((i < p.size()) && (encontrar = false)) {
            if (p.get(i).getISBN().equals(isbn)) {
                System.out.println("Lo tenemos");
                encontrar = true;
            } else {
                System.out.println("No tenemos este ejemplar");

            }

        }
        return encontrar;
    }

    public static libro crearLibro() {

        System.out.println("Has elegido la opcion Crear Libro");
        Scanner sc = new Scanner(System.in);
        libro libronuevo = new libro();
        System.out.println("CREAR");
        System.out.println("Introduce los datos");
        System.out.println("Autor: ");
        libronuevo.setAutor(sc.nextLine());
        System.out.println("Titulo: ");
        libronuevo.setTitulo(sc.nextLine());
        System.out.println("ISBN: ");
        libronuevo.setISBN(sc.nextLine());
        System.out.println("Numero de ejemplares: ");
        libronuevo.setEjemplareslib(sc.nextInt());
        libronuevo.setTotlib(sc.nextInt());
        return libronuevo;

    }

    static public void mostrarLibro() {
        System.out.println("Has elegido la opcion Mostrar Libro");
        lista.forEach((libro) -> {
            System.out.println("Titulo: " + libro.getTitulo() + " Autor: " + libro.getAutor() + " Ejemplares: " + libro.getEjemplareslib());
        });
    }

    public static void prestarLibro(ArrayList<libro> p) {
        System.out.println("Has elegido la opcion Prestar Libro");
        Scanner sc = new Scanner(System.in);
        System.out.println("PRESTAR");
        System.out.println("Introduce el ISBN del libro que deseas.");
        sc.nextLine();
        
        if (libro.encontrarLibro(p) == true) {
            if (libro.getEjemplareslib() < libro.getTotlib()) {
                libro.num_lib_pres_tot++;
                libro.ejemplareslib++;

            }

            //si la lista de libros total es menor al prest
            //sumar a lista de prest
        } else {
            System.out.println("No podemos prestar este libro.");
        }
    }
        public static void devolverLibro(ArrayList<libro> p) {
        System.out.println("Has elegido la opcion Devolver Libro");
        Scanner sc = new Scanner(System.in);
        System.out.println("PRESTAR");
        System.out.println("Introduce el ISBN del libro que deseas.");
        sc.nextLine();
        
        if (libro.encontrarLibro(p) == true) {
            if (libro.getEjemplareslib() > libro.getTotlib()) {
                libro.num_lib_pres_tot--;
                libro.ejemplareslib--;

            }
            //restar a lista de prest
        } else {
            System.out.println("No puedes devolver este libro.");
        }
    }
    
    
    
}
