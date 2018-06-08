/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploClass;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ClassPrincipal {
    
    public static void main(String[] arg){
    
    Pessoa lucas = new Pessoa();
    lucas.nome = "Lucas";
    lucas.idade = 16;
    lucas.sexo = 'm';
    lucas.peso = 94.0f;
    lucas.altura = 1.94f;
    lucas.cpf = "123.456.789-52";
    lucas.sobrenome = "Rodrigo";
    
    Pessoa carlos = new Pessoa();
    carlos.nome= "Carlos";
    carlos.idade = 18;
    carlos.sexo = 'm';
    carlos.peso = 78.0f;
    carlos.altura = 1.78f;
    carlos.cpf = "123.456.789-85";
    carlos.sobrenome = "Augusto";
    
    JOptionPane.showMessageDialog(null, 
            "Nome: "+ lucas.nome
            +"\nSobrenome: " + lucas.sobrenome 
            +"\nIdade: " + lucas.idade  
            +"\nPeso: " + lucas.peso 
            +"\nAltura: "+ lucas.altura 
            +"\nSexo" + lucas.sexo
            +"\nCPF: " + lucas.cpf);
    
     JOptionPane.showMessageDialog(null, 
            "Nome: "+ carlos.nome
            +"\nSobrenome: " + carlos.sobrenome 
            +"\nIdade: " + carlos.idade  
            +"\nPeso: " + carlos.peso 
            +"\nAltura: "+ carlos.altura 
            +"\nSexo" + carlos.sexo
            +"\nCPF: " + carlos.cpf); 
            
    
}
}
