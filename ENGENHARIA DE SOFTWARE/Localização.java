public class Localização {
    public String nomedoEndereço;
    public String cep;
    public String getNomedoEndereço() {
        return nomedoEndereço;
    }
    public String showCep() {
        return cep;
    }
    Empresa<Funcionario> empresa = new Empresa<>(nomedoEndereço, cep);
    public String getEmpresa(){
        return empresa.nome;
    }
    
}
