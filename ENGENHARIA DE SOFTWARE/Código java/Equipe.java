import java.util.ArrayList;
import java.util.List;

class Equipe {
    private String nomeLider;
    private List<Funcionario> funcionarios;

    public Equipe() {
        this.funcionarios = new ArrayList<>();
    }

    public String getNomeLider() {
        return nomeLider;
    }

    public void setNomeLider(String nomeLider) {
        this.nomeLider = nomeLider;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
