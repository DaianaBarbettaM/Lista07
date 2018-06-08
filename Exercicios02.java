/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;

/**
 *
 * @author Barbetta
 */
public class Exercicios02 {
    
    public static void main (String[] arg){
        
        ArrayList<String>nomes = new ArrayList<>();
        nomes.add("Caleb");
        nomes.add("Mia");
        nomes.add("Henrique");
        nomes.add("Lia");
        nomes.add("Hayana");
        nomes.add("Rafael");
        nomes.add("Piedro");
        nomes.add("Marco");
        nomes.add("Ayla");
        
        System.out.println( nomes.get(0) +"\n"+ nomes.get(1) +"\n"+ nomes.get(2) +"\n"+ nomes.get(3)+"\n"+
                            nomes.get(4) +"\n"+ nomes.get(5) +"\n"+ nomes.get(6) +"\n"+ nomes.get(7)+"\n"+
                            nomes.get(8));
  
    }
}
