import java.util.LinkedList;
import java.util.List;

public class Empresa {
    public String nome;
    public String ramo;

    public Empresa(String nome, String ramo) {
        this.nome = nome;
        this.ramo = ramo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("empresaTeste", "aeronave");
        System.out.println("Teste de metodo get");
        System.out.println();

        System.out.println("Nome da empresa:"+empresa.getNome());

        System.out.println("Area de atuacao da empresa:"+empresa.getRamo());
        System.out.println();

        

        System.out.println();

        
        System.out.println("Nome da empresa:"+empresa.getNome());

        System.out.println();
        
        
        System.out.println("Cadastrando local da empresa:");
        
        Localização local = new Localização();
        local.cep="123456";
        local.empresa= (new Empresa("teste","123"));
        local.nomedoEndereço="rua teste da silva";

        
        System.out.println("Cep da empresa:"+local.getCep());

       
       
        System.out.println("Nome da empresa:"+local.empresa.getNome());
        

        System.out.println("Nome do endereco:"+local.nomedoEndereço);
        
        
        System.out.println();

        System.out.println("***Cadastrando uma equipe em uma empresa***");

        Equipe equipe = new Equipe();
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste1"));
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste2"));
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste3"));
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste4"));

        System.out.println("Lista de funcionarios daquela empresa");
        List<Funcionario> funcionarios = equipe.getFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }


    }
}
