/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesaplicaciontema12;

import java.util.ArrayList;

/**
 *
 * @author alfredenegarcia
 * @param <T>
 */
public class Cola <T> {
    
    private ArrayList <T> elementos;
    
public Cola(ArrayList <T> elementos){
    
    this.elementos = elementos;
    
}

public boolean encolar(T nuevo){
    
   return elementos.add(nuevo);
    
}

public T desencolar(){
    
    try{
    
    T elementoDesencolado = elementos.get(0);
            
    elementos.remove(elementos.get(0));
    
    return elementoDesencolado;
   
    } catch (Exception e){
        
        return null;
    }
    
}

public ArrayList <T> mostrar(){
   
    
    return elementos;
    
    
}



}