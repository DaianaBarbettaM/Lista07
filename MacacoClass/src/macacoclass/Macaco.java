
package macacoclass;

/**
 *
 * @author Alunos
 */
public class Macaco {
    
    public String nome, nomeCientifico, subfamília, corPelo, apelido, reino,
            filo, classe, origem,familia; 
    public float altura, peso;
    public int idade;
    public char genero;
    
    
    @Override
    public String toString(){
        return "\nNome: " + nome
                +"\nFamilia: " + familia 
                +"\nSubfamilia: " + subfamília
                +"\nApelido: "+ apelido
                +"\nGenero: "+ genero
                +"\nAltura:"+ altura
                +"\nCor de pele:" + corPelo
                +"\nClasse: " + classe
                +"\nFilo: " + filo
                +"\nOrigem: " + origem
                +"\nPeso: " + peso
                +"\nNome Cientifico: "+ nomeCientifico
                +"\n Reino:" + reino;
    }
    
    }
    
    

