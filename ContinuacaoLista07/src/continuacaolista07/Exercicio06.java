
package continuacaolista07;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 6. Desenvolver um algoritmo que crie um ArrayList para armazenar números inteiros .
Solicite ao usuário quinze números e ao final apresente os números que estão
armazenados no ArrayList.
 *
 * @author Barbetta
 */
public class Exercicio06 {
    
    public static void main (String[] arg){
        
        ArrayList<Integer> numeros = new ArrayList();
        
        String numeros1 = "";
        
        for(int i = 0; i < 15; i++ ){
           int x =Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
          numeros1 += x + "\n";
          
          numeros.add (x);
                  
        }
        
        JOptionPane.showMessageDialog(null,numeros1);
    }
}

        
            
        
     
      
        
        
    
    

