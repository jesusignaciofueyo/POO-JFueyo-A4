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
public class Telefono {
    //Atributo, instanciar objeto

    Tecla[][] Teclado = new Tecla[5][3];
    BotonApagar EA = new BotonApagar();
    static Contacto[] Contactos = new Contacto[100];

    public Telefono() {

    }

    public void setTeclado() {
        Tecla tecla;
        int teclaI = 1;
        char teclaC;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tecla = new Tecla();
                teclaC = Integer.toString(teclaI).charAt(0);
                tecla.setDigito(teclaC);
                Teclado[i][j] = tecla;
                teclaI++;
            }
        }
        
        

        /**
         * Teclado[0][0].setDigito('1');
         *
         * Teclado[0][1].setDigito('2');
         *
         * Teclado[0][2].setDigito('3');
         *
         * Teclado[1][0].setDigito('4');
         *
         * Teclado[1][1].setDigito('5');
         *
         * Teclado[1][2].setDigito('6');
         *
         * Teclado[2][0].setDigito('7');
         *
         * Teclado[2][1].setDigito('8');
         *
         * Teclado[2][2].setDigito('9');
         */
        Tecla tecla0 = new Tecla();
        tecla0.setDigito('0');
        Teclado[3][1] = tecla0;
        
        
        Tecla tecla1 = new Tecla();
        tecla1.setDigito('*');
        Teclado[3][0] = tecla1;
        
        
        Tecla tecla2 = new Tecla();
        tecla2.setDigito('#');
        Teclado[3][2] = tecla2;
         
        
        Tecla tecla3 = new Tecla();
        tecla3.setDigito('C');
        Teclado[4][0] = tecla3;
         
        
        Tecla tecla4 = new Tecla();
        tecla4.setDigito('R');
        Teclado[4][1] = tecla4;
         
        
        Tecla tecla5 = new Tecla();
        tecla5.setDigito('T');
        Teclado[4][2] = tecla5;
    }
    
    public static void guardarContacto(String nombre, String telefono, String correo) {
        Contacto contacto = new Contacto(nombre, telefono, correo);
        Contactos[Contacto.contador] = contacto;
    }
    
    public static void mostrarContactos() {
        System.out.println("Contactos por indice:");
        mostrarContactosPorIndice();
        System.out.println("Contactos por listado telefónico:");
        mostrarContactosPorListadoTelefonico();
    }
    
    public static void mostrarContactosPorIndice() {
        for (int i = 0; i < Contactos.length; i++) {
            System.out.println("" + Contactos[i].getNombre() + ", " + Contactos[i].getTelefono() + ", " + Contactos[i].getCorreo());
        }
    }
    
    public static void mostrarContactosPorListadoTelefonico() {
        for (int i = 0; i < Contactos.length; i++) {
            System.out.println("" + Contactos[i].getTelefono() + ", " + Contactos[i].getNombre() + ", " + Contactos[i].getCorreo());
        }
        
    }
}
