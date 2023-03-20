<h1>O que é Engenharia de Software?</h1>
<hr>

<p>Engenharia de software tem como foco a manutenção e duração do produto , focando em escala operacional de modo que consiga entregar o melhor produto para o cliente  por meio de técnicas  através da análise, coleta e processamento de dados, ainda é responsavel por  identificar potenciais falhas nesses produtos e criam soluções de alta performance.</p>

Exemplo: Um sistema de grande porte que precisa suporta diveresos acessos e não pode cair seria o Whatsapp

<h1>Qual a relação com programação?</h1>
<p>A relação de engenharia de software e programação esta vinculado-se na necessidade de se levantar requisitos sobre o que um produto precisa , nisso entra a programação a qual ira execultar ou construir a aplicação daqueles requisitos </p>


<h1>O que são requisitos?</h1>
<hr>

<p> Os requisitos são as exigências, recursos, objetivos e utilidades que um sistema precisa cumprir, de acordo com as necessidades</p>
<ul>
<li><p>Funcionais: Requisitos funcionais esta relacionados às funcionalidades que o software deve ter para atender as necessidades de um cliente. Também se enquadram aqui a maneira como o software se comportara a determinadas ações dentro de seu funcionamento.Um exemplo pode ser o acesso a históricos de dados e informações pelo usuário.</p></li>

<li><p>Não funcionais:  Requisitos não-funcionais são intrínsecos ou implícitos são algo que esta relacionado a aplicações que espera ja estar prontas antes do cliente pedir. Exemplo: Aspectos de segurança do software.  </p></li>

<li><p>Não funcionais:  Requisitos não-funcionais são intrínsecos ou implícitos são algo que esta relacionado a aplicações que espera ja estar prontas antes do cliente pedir. Exemplo: Aspectos de segurança do software.  </p></li>
<hr>
<h1>De 2 exemplos de trade-offs em requisitos não funcionais?</h1>
<hr>
<p>A escolha de quem pode cadastrar usuarios em um sistema de banco de dados e outro seria a estuturação do produto em foco de sua segurança.</p>


</ul>

<h2>Diagrama de classes UML para um sistema acdemico</h2>
<h3>Model</h3>
<ul>
1-Model ClassesSalas 
 <li>string:professores</li>
 <li>string:salas</li>
 <li>Lista:alunos</li>
 <li>int:id</li>
2-Model FaltasAlunos
 <li>string:nomeAlunos</li>
 <li>int: faltas</li>
<li>int :id</li>
3-Model NotasAlunos
 <li>string: nomeAlunos</li>
<li>int: notas</li>
 <li>int:id</li>
--Controler
1-SalvarUmaClasseSala
 <li>addSenaoExistir</li>
<li>excluir</li>
2-LancarFalta
 <li>alterarFalta</li>
3-LançarNota
 <li>alterarNota</li>
--View
visualizarTodosOsDado
</ul>
##Versao -1
![image](https://user-images.githubusercontent.com/111581261/223278940-0ea5c84f-f8f3-4b30-9e6f-46c939fa317d.png)
versao1.0.1
![image](
https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#R7Vrfd6I4FP5rPGf2oXMERPTRqp32zLSnu7anM48RUshZIG4IVfvXb4AECImK7tLO2HkSbq435H73x5dAz5pGmy8ErIJb7MGwZ%2Fa9Tc%2Ba9UzTGA9G7CeTbAuJY9qFwCfI40qVYIFeIRf2uTRFHkwkRYpxSNFKFro4jqFLJRkgBK9ltWccyrOugA8VwcIFoSp9Qh4NCunIdCr5NUR%2BIGY2huNiJAJCma8kCYCH1zWRNe9ZU4IxLa6izRSGmfOEX4r%2FXe0YLR%2BMwJi2%2BcPNn4%2FT19uHwWK0vRuni%2Bun%2Bx%2FbC27lBYQpX%2FA8WhGYAP7MdCsckaxRFIKY3V2uA0ThYgXcbGjNcGeygEYhuzPYpfpgYhZIKNzURPxBv0AcQUq2TIWPXtgCfx42wonrCgOrz2VBzf%2BmEAKOu1%2FarlzDLrh3jvCUo3iqZw5BlK09XiarfN39pihmk%2FesCRtZUIJiX%2FEq8weVvZdQgv%2BGUxxiwiQxzj3%2BjMKwIQIh8mN26zIvQya%2FzLyLWOBO%2BECEPC%2FcBRfBaezBbL19LWJ7g%2BUwjFs5iWuojTWg2V1hJubfDxoBEf6IIIlcM2wp1QYqaIZQkVOtI9TGp2SaRvScxi7CMSAIJwW%2B31BCS60ww%2FSq0ikHfFrY%2BycFMUUe8OAMTggEn%2F5gVmY4XTLAPnaI2GqIlLleD5FBZ4mtq8YNSGDsTTICULm6ho7sN7hB9Ht2%2FbnvGPz%2BR6bJ7m1%2BP9vUlGfb2s09JIgtKwPvBBQSnBIXHk4H6ElERcWqBoa9p8gSGAKKXmR6owOIz3CPEVtGGQqm3JfHDYSL1fD%2F1MlIw0zZvIUdS7ZDAfEhVezkwVKu%2BfT4sUwlfth0d8xunuSiDwzzGrEk7CovCkznL9Ys9uqcVqt%2Biz6SKIG01niST1IX6sf4BWcRdlS3OtiP2vcZRv%2FRK1jmprJ6tsqyMM9L%2B7JnzzJbKcVJsVU7ptV11p7MZjVR%2B5Ot2y0MO%2BtPtlJfJOzedW%2Fl2LK3Bn3VXWXrlhhfd0R99L%2F287aBZv8crbXcLZ3YTFk3lQBVDHXcTc2Bgl6de9%2Bw%2F07E1L8uaRYpfQRrbsKipJlhvmVVMtWqVMfprjisOItN8NFgDWSsNDucoQYqqyuoLPVgrg7VlAA3AMWm9ndmmY4ms3SFuju4LE3%2FkjmfL3G%2BGy%2FfROTYvTcb1Yvk500O7o1aWG2YLII4N9o7k7O34yO5UXdGzmdbJWO60uPYXXGxoRLLC0iZZ9%2BXtTZPHrSsVXe63CFr1Z1Uds9ahz8Vaz31BKj84w47XXNW9QQxe1kzwzzW%2B2dUlURCt35vo3nbZug2hFZXNcjU7QcP9hdKwBKE2WtWAhOB5JlwpKMx1L3GeVNOZKrVsciwhwqmAh3dsVaJ8gdBTbS5oVwVbZUNWJa2yXXFbNW9fTumd1dV0ybFe8sjc%2FYkD5qyUGPf53N%2BX6RXIq2XLXPfyeMvfU58fHY5cnaNNBRypMmu7k5kTCW7DAWjGoXEKxjLcLFB%2FtGUYeYuBoQKbQ%2BBCMfeQ4BiMSR0B0JwhcLSFCOUCz4tJjTAPguacF5Jy9gI4TPVRMYSU4qjFsXSaMlgy%2B2%2BhJr133hr%2BYlR46WB3eyEbZnshekcsLSDyzKcwLamxhNo9yM3ObOYqArBwuSpTHn%2Bzbwdrx8fl%2B5XMv8K5yR9utZ8IrYvQt0QJAlyD%2B9zGuBrAuS9XnFf2I3zdOVTl9aRMWzEmNWsJCfvctht9elgoV59gGnN%2FwU%3D
)

Exercicio cinema 17/03
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    String nomeDaSala;
    String nomeDoFilme;
    public Cinema(String nomeDoFilme, String nomeDaSala) {
        this.nomeDoFilme = nomeDoFilme;
        this.nomeDaSala = nomeDaSala;
    }
    public String getNomeDaSala() {
        return nomeDaSala;
    }
    public void setNomeDaSala(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }
    public String getNomeDoFilme() {
        return nomeDoFilme;
    }
    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }
    List<String> filme = new ArrayList();
    public void addFilme(String nomeDoFilme){
        filme.add(nomeDoFilme);
    }
    public void getListaFilme(){
        for (String o : filme) {
           System.out.println(o);
        }
    }
    public static void main(String[] args) {
        Cinema  cinemainfo = new Cinema("filme1", "filme1");
        System.out.println(cinemainfo.getNomeDoFilme());
        System.out.println(cinemainfo.getNomeDaSala());
        cinemainfo.addFilme("filmeA");
        cinemainfo.addFilme("filmeB");
        cinemainfo.addFilme("filmeC");
        cinemainfo.addFilme("filmeD");
        cinemainfo.getListaFilme();
    }
}



