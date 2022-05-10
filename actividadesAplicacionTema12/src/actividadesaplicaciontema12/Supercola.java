/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesaplicaciontema12;

import java.util.ArrayList;

/**
 *
 * @author alfredenegarcia
 */
public class Supercola {
    
    private Cola cola1;
    private Cola cola2;
    
    public Supercola(ArrayList <Integer> elementos1, 
            ArrayList <Integer> elementos2){
        
        this.cola1 = new Cola (elementos1);
        this.cola2 = new Cola (elementos2);
        
    }
    
    public boolean encolarCola1(Integer nuevo){
        
       return cola1.encolar(nuevo);
        
    }
    
    public boolean encolarCola2(Integer nuevo){
        
       return cola2.encolar(nuevo);
        
    }
    
    public Integer desencolar1(){
        
        Integer eliminada = (Integer) cola1.desencolar();
        
        if (eliminada != null){
            
           return eliminada;
            
        } else {
            
            return (Integer) cola2.desencolar();
            
        }
        
        
        /*
        try{
            return (Integer)cola1.desencolar();
        } catch(Exception e){
            try{
                return (Integer)cola2.desencolar();
            }catch(Exception i){
                return null;
            }
        }*/
        
    }
    
    public ArrayList <Integer> mostrar1(){
   
    
    return cola1.mostrar();
    
    
}
    
    public ArrayList <Integer> mostrar2(){
   
    
    return cola2.mostrar() ;
    
    
}


    
}
