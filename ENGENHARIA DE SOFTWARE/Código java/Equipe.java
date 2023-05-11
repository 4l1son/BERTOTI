import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Equipe {
    public String nomeLider;

    public String getNomeLider() {
        return nomeLider;
    }
    
   List<Funcionario> nomedoFuncionario  = new LinkedList<>();

   public void cadastroFuncionario(String string){   
   nomedoFuncionario.add(new Funcionario());

   }

   public  List<Funcionario> getEquipe(){
        return nomedoFuncionario;
  
   }

}
