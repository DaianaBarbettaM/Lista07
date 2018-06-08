/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macacoclass;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ClassPrincipal {

    public static void main(String[] arg){
        
        
        Macaco macaco3 = new Macaco();
        
        macaco3.nome = "Macaco-Prego";
        macaco3.familia = 
        macaco3.apelido = 
        macaco3.classe = 
        
        
        
        Macaco macaco = new Macaco();
            
        macaco.nome = JOptionPane.showInputDialog("Infome o nome do macaco: ");
        macaco.familia = JOptionPane.showInputDialog("Informe a familia: ");
        macaco.subfamília = JOptionPane.showInputDialog("Informe a subfamilia: ");
        macaco.apelido = JOptionPane.showInputDialog("Informe o apelido: ");
        macaco.genero = JOptionPane.showInputDialog(null, "Informe o genero").charAt(0);
        macaco.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura"));
        macaco.corPelo = JOptionPane.showInputDialog("Informe a cor do pelo: ");
        macaco.classe = JOptionPane.showInputDialog("Informe a classe");
        macaco.filo = JOptionPane.showInputDialog("Informe o filo:");
        macaco.origem = JOptionPane.showInputDialog("Informe a origem: ");
        macaco.peso = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o peso: "));
        macaco.nomeCientifico = JOptionPane.showInputDialog("Informe o nome cientifico");
        macaco.reino = JOptionPane.showInputDialog( "Informe o reino: ");
        
        
        JOptionPane.showMessageDialog(null, macaco.toString());
        
        Macaco macaco2 = new Macaco();
            
        macaco2.nome = JOptionPane.showInputDialog("Infome o nome do macaco: ");
        macaco2.familia = JOptionPane.showInputDialog("Informe a familia: ");
        macaco2.subfamília = JOptionPane.showInputDialog("Informe a subfamilia: ");
        macaco2.apelido = JOptionPane.showInputDialog("Informe o apelido: ");
        macaco2.genero = JOptionPane.showInputDialog(null, "Informe o genero").charAt(0);
        macaco2.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura"));
        macaco2.corPelo = JOptionPane.showInputDialog("Informe a cor do pelo: ");
        macaco2.classe = JOptionPane.showInputDialog("Informe a classe");
        macaco2.filo = JOptionPane.showInputDialog("Informe o filo:");
        macaco2.origem = JOptionPane.showInputDialog("Informe a origem: ");
        macaco2.peso = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o peso: "));
        macaco2.nomeCientifico = JOptionPane.showInputDialog("Informe o nome cientifico");
        macaco2.reino = JOptionPane.showInputDialog( "Informe o reino: ");
        
        
        JOptionPane.showMessageDialog(null, macaco2.toString());
        
        
               
               
        
        
        
        
        
    }
}
