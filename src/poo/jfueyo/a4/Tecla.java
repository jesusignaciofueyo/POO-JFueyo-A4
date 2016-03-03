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
public class Tecla {
    //Atributos
    private char digito;
    
    //Método
    public Tecla() {
        
    }
    
    public Tecla(char digito) {
        this.digito = digito;
    }
    
    public void setDigito(char d) {
        this.digito = d;
    }
    
    public char getDigito() {
        return digito;
    }
    
}
