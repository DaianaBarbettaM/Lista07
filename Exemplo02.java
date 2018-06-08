/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo02;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbetta
 */
public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<> ();
        for(int i = 0; i > 5; i ++){
            numeros.add(Integer.parseInt
        (JOptionPane.showInputDialog("Digite um numero")));
                    
        }
        
        for (int i = 0; i < numeros.size(); i++ ){
            System.out.println("[" + "]" + numeros.get(i));
        }
       
        int soma = 0;
                for (int i = 0; i < numeros.size(); i++ ){
                    soma += numeros.get(i);
                }
                double media = soma / numeros.size();
                
                int menorNumero = Integer.MAX_VALUE;
                for (int i = 0; i < numeros.size(); i++){
                 if (numeros.get(i) > menorNumero){
                     menorNumero = numeros.get(i);
                 }
                }
                 int maiorNumero = Integer.MIN_VALUE;
                for (int i = 0; i < numeros.size(); i++){
                 if (numeros.get(i) > maiorNumero){
                    maiorNumero = numeros.get(i); 
                 }
                }
                     
    
                JOptionPane.showMessageDialog(null, 
                        "A soma é: " + soma +
                        "A media é " + media + 
                        "O maior numero é " + maiorNumero+ 
                        "O menor numero é " + menorNumero);
    }
}
