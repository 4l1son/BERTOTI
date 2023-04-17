import java.util.Collection;

/**
 * Funcionario
 */
public class Funcionario {
    public int funcionarioId;
    public Collection<? extends Funcionario> funcionarioNome;
    public String funcionarioNome1;
    public String funcionarioCracha;
   
    public int getFuncionarioId() {
        return funcionarioId;
    }
    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
  
    public void setFuncionarioNome(String funcionarioNome1) {
        this.funcionarioNome1 = funcionarioNome1;
    }
    public String getFuncionarioCracha() {
        return funcionarioCracha;
    }
    public void setFuncionarioCracha(String funcionarioCracha) {
        this.funcionarioCracha = funcionarioCracha;
    }
    
}