/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Exercicios04 {
    
    public static void main (String[] arg){
        
        ArrayList<Integer>numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
     
        
//      System.out.println( numeros.get(0) +"\n"+ numeros.get(1) +"\n"+ numeros.get(2)+"\n"+
//                            numeros.get(3) +"\n" +numeros.get(4) +"\n"+ numeros.get(5)+"\n"+
//                            numeros.get(6) +"\n" +numeros.get(7) +"\n"+ numeros.get(8)+"\n"+
//                            numeros.get(9));
         
      for(int i = 0; i < numeros.size(); i++){
          System.out.println(numeros.get(i));
          
    }
    
      numeros.remove(3);
    
    for(int i = 0; i < numeros.size(); i++){
          System.out.println(numeros.get(i));
    }
    
    numeros.remove(4);
    
    for(int i = 0; i < numeros.size(); i++){
        System.out.print(numeros.get(i));
    }
  
    int quantidadeDeItensNoArrayList = numeros.size();
    System.out.println(quantidadeDeItensNoArrayList);
    
}
}
