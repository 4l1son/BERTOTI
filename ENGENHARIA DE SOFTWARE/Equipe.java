import java.util.ArrayList;
import java.util.List;

public class Equipe {
    public String nomeLider;

    public String getNomeLider() {
        return nomeLider;
    }
    
   private List<Funcionario> nomedoFuncionario  = new ArrayList<>();

   public void cadastroFuncionario(Funcionario fun){
    nomedoFuncionario.addAll( fun.funcionarioNome);
   }

   public List<Funcionario> getFuncionario(){
    return nomedoFuncionario;
   }

}
