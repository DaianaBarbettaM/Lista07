/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer>numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(23);
        numeros.add(25);
        numeros.add(23 + 1);
        numeros.add(21);
        
       // for (int i = 0; i < numeros.size(); i ++){
        //    System.out.println
        //}
        
     
        
        
        
        int numeroPosicao0 = numeros.get (0);
        int numeroPosicao1 = numeros.get (1);
        int numeroPosicao2 = numeros.get (2);
        int numeroPosicao3 = numeros.get (3);
        int numeroPosicao4 = numeros.get (4);
        
        int somaOutraForma = numeros.get(0) + numeros.get(1)+ numeros.get(2)+
                numeros.get(3) + numeros.get(4);
        System.out.println("Soma "+ somaOutraForma);
        
      //  int soma = (numeroPosicao0 + numeroPosicao1 + numeroPosicao2 +
       //         numeroPosicao3 + numeroPosicao4);
        
        
        System.out.println("[0] => "+ numeroPosicao0);
        System.out.println("[1] => "+ numeroPosicao1);
        System.out.println("[2] => "+ numeroPosicao2);
        System.out.println("[3] => "+ numeroPosicao3);
        System.out.println("[4] => "+ numeroPosicao4);
        
        
        
        
    }
    
}
