public class Localização {
    public String nomedoEndereço;
    public String cep;
    public String getNomedoEndereço() {
        return nomedoEndereço;
    }
    public String showCep() {
        return cep;
    }
    Empresa empresa = new Empresa(nomedoEndereço, cep);
    public String getEmpresa(){
        return empresa.getNome();
    }
    public static void Localizacao(){}
    
}
