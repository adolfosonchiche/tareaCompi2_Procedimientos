package com.adolfo.analizadores;

import java.util.List;

/**
 *
 * @author hectoradolfo
 */
public class Generador {
    
    
    public String ordenar(String nombre, List<String> arr) {
        String datos ="";
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(nombre + " ->" + arr.get(i));
            datos += nombre + " -> " + arr.get(i) + ";\n";
        }
        
        return datos;
    }
    
}
