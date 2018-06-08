
package personagem;

/**
 *
 * @author Alunos
 */
public class Personagem {

        
        private String nome, cla, aldeia;
        private long nivelChakra;
        
        //permitir guardar a informação
        
        public void setNome(String nome){
            if(nome.trim().equals("")){
                // .trim() retira os epacos
                throw new 
                    IllegalArgumentException("Nome não pode ser vazio!");
              }
            if(nome.trim().length()< 3 ){
                throw new IllegalArgumentException(
                "Nome tem que conter no minimo 3 caracteres");
            }
            this.nome = nome;
        }
        
        public String getNome(){
            return nome;
        }
        

    
    
}
