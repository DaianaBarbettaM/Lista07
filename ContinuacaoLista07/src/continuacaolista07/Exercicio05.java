/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuacaolista07;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 5. Solicite ao usuário quatro nomes e um outro nome, com esse nome, deve-se
verificar se ele está contido o ArrayList ou não e esta informação deve ser
apresentada ao usuário.
 *
 * @author Barbetta
 */
public class Exercicio05 {

    public static void main(String[] args) {
    
        ArrayList<String>nomes = new ArrayList<>();
        
        for ( int i = 0; i < 4; i++){
            nomes.add(JOptionPane.showInputDialog("Informe um nome: "));
    }
        String nome = JOptionPane.showInputDialog("Informe o nome para busca: ");
        
  
        
        for (int i = 0; i < nomes.size(); i++ ){
            //size é tamanho da ArrayList;
            //get é para buscar a informaçao;
            
            if (nome.equalsIgnoreCase(nomes.get(i))){
                System.out.println("Encontrado");
               
                
            }else {
                System.out.println("Não encontrado");
            }
           
            
        }
        
        
    
}
}
