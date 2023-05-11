import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Empresa<Funcionario> {
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
    private List<Funcionario> funcionario = new LinkedList<>();

    public static void main(String[] args) {
        Empresa empresa = new Empresa<>("alsmls", "aeronave");
        Equipe equipe = new Equipe();
        Scanner nomeL = new Scanner(System.in);
        System.out.println("Empresa: "+empresa.getNome());
        System.out.println("Ramo: "+empresa.getRamo());
        System.out.print("Digite o nome do lider da equipe:");
        equipe.nomeLider= nomeL.next();
        System.out.println("Lider:"+equipe.getNomeLider());
      
        equipe.cadastroFuncionario("ssssss");;
        

      
    }
    
}
