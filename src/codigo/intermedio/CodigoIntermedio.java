/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo.intermedio;

import java.util.ArrayList;
import java.util.List;
import codigo.intermedio.Cuadruplos;
import java.io.*;


/**
 *
 * @author Jorda
 */
public class CodigoIntermedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "float R = (1+2)/3*4;";
        Cuadruplos c = new Cuadruplos();
        List<String> lista = c.cuadruplos(cadena);
        for(int i = 0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        
    }
    //public List<Cuadruplos> lista = new ArrayList<Cuadruplos>();
    
   
    
}

