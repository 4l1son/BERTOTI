import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Equipe {
    public String nomeLider;

    public String getNomeLider() {
        return nomeLider;
    }
    
   private List<Funcionario> nomedoFuncionario  = new ArrayList<>();

   public void cadastroFuncionario(Funcionario fun){
    String nome = fun.funcionarioNome;
    nomedoFuncionario.add(nome);
   }

   public List<Funcionario> getFuncionario(){
    return nomedoFuncionario;
   }

}
