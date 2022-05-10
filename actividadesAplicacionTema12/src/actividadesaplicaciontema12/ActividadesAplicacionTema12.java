/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesaplicaciontema12;

import java.util.ArrayList;

/**
 *
 * @author alfredenegarcia
 */
public class ActividadesAplicacionTema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Integer> elementos = new ArrayList();
        
        Cola biblioteca = new Cola (elementos);
        
      /*  biblioteca.encolar(12);
        biblioteca.encolar(24);
        biblioteca.encolar(45);
        System.out.println(biblioteca.mostrar());
        
        
        System.out.println(biblioteca.desencolar());
        System.out.println(biblioteca.mostrar());
        */
        ArrayList <Integer> elementos2 = new ArrayList();
        
        Supercola ayuntamiento = new Supercola (elementos, elementos2);
        
       
        ayuntamiento.encolarCola2(52);
       
        ayuntamiento.encolarCola2(5);
      
        ayuntamiento.encolarCola2(552);
        System.out.println(ayuntamiento.mostrar1());
        System.out.println(ayuntamiento.mostrar2());
        
        
        System.out.println(ayuntamiento.desencolar1());
        System.out.println(ayuntamiento.mostrar1());
        System.out.println(ayuntamiento.mostrar2());
        
        
    }
    
}
