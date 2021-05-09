/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author jorge
 */
public class Animal {
    
   private String tipo;
   private int edad;
   private int precio;
   private boolean enfermo;
    
    public Animal(String pTipo, int pEdad, int pPrecio, boolean pEnfermo){
        
        this.tipo = pTipo;
        this.edad = pEdad;
        this.precio = pPrecio;
        this.enfermo = pEnfermo;
    }
    
    public String getTipo(){
        
        return tipo;          
    }
    
    public void setTipo(String pTipo){
        
        tipo = pTipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEnfermo() {
        return enfermo;
    }

    public void setEnfermo(boolean enfermo) {
        this.enfermo = enfermo;
    }
  
}
