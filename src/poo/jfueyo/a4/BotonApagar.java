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
public class BotonApagar {
    //Atributos
    public boolean IO;
    
    public BotonApagar() {
        this.IO = false;
    }
    
    public void presionar() {
        this.IO = !this.IO;
    }
    
}
