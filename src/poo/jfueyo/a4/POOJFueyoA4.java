/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.a4;

import java.util.Scanner;
import static poo.jfueyo.a4.Telefono.Contactos;

/**
 *
 * @author jesus_ignacio_159
 */
public class POOJFueyoA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefono starTac = new Telefono();
        starTac.EA.presionar();
        System.out.println("El starTac está " + starTac.EA.IO);

        starTac.setTeclado();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(starTac.Teclado[i][j].getDigito());
            }
        }

        menu();

    }

    public static void menu() {
        
        Contacto contacto = new Contacto(" ", " ", " ");
        for (int i = 0; i < Contactos.length; i++) {
            Contactos[i] = contacto;
        }

        boolean run = true;
        
        while (run) {

            System.out.println("Escriba un:");
            System.out.println("1: si desea agregar un contacto");
            System.out.println("2: si desea mostrar todos los contactos");
            System.out.println("3: si desea salir:");

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            if (input == 1) {

                System.out.println("Nombre:");
                String nombre = scan.next();
                System.out.println("Telefono:");
                String telefono = scan.next();
                System.out.println("Correo:");
                String correo = scan.next();
                Telefono.guardarContacto(nombre, telefono, correo);

            } else if (input == 2) {

                Telefono.mostrarContactos();

            } else if (input == 3) {

                run = false;

            } else {
                
                System.out.println("La tecla que ingreso no es un 1, 2, o un 3. Intente nuevamente. Gracias.");
                
            }
        }
    }
}
