/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.a4;

/**
 *
 * @author jesus_ignacio_159
 */
public class Contacto {
    //Atributos
    private String nombre;
    private String telefono;
    private String correo;
    static int contador = -2;
    
    
    //Constructor
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contador = this.contador + 1;
    }
    //Metodos
    public String getNombre() {
        return this.nombre;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public String getCorreo() {
        return this.correo;
    }
}
