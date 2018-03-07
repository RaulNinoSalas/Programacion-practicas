/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.ArrayList;

/**
 *
 * @author Raul Niño Salas Daw 1 
 * 5 Practica
 */
public class Biblioteca {
    
    private int id_biblioteca;
    private String nombre;
    private String direccion;
    
    public static ArrayList<Libro> lista_libros;
    public static ArrayList<Usuario> lista_usuarios;

    public Biblioteca() {
    }

    public Biblioteca(int id_biblioteca, String nombre, String direccion, ArrayList<Libro> lista_libros,ArrayList<Usuario> lista_usuarios) {
        this.id_biblioteca = id_biblioteca;
        this.nombre = nombre;
        this.direccion = direccion;
        Biblioteca.lista_libros = lista_libros;
        Biblioteca.lista_usuarios = lista_usuarios;
    }

    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static ArrayList<Libro> getLista_libros() {
        return lista_libros;
    }

    public static void setLista_libros(ArrayList<Libro> lista_libros) {
        Biblioteca.lista_libros = lista_libros;
    }

    public static ArrayList<Usuario> getLista_usuarios() {
        return lista_usuarios;
    }

    public static void setLista_usuarios(ArrayList<Usuario> lista_usuarios) {
        Biblioteca.lista_usuarios = lista_usuarios;
    }
    

 
 
    
    
    
    
}
