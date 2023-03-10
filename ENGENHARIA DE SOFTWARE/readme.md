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
https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#R7Vpbc5s6EP41nmkf0jFgwH507KTNzGkmrdPp6aMMCmiOQD5Cju38%2BgqQACH5OiFJnT4ZVmKF9tvLp8U9Z5KsP1OwiL%2BSEOKe3Q%2FXPWfas23LH%2Fb5Ty7ZlBLP8kpBRFEoJtWCGXqCQiiei5YohJkykRGCGVqowoCkKQyYIgOUkpU67YFgddUFiKAmmAUA69KfKGRxKR3afi3%2FAlEUy5Utb1SOJEBOFjvJYhCSVUPkXPWcCSWElVfJegJxbjxpl%2FK56y2j1YtRmLJDHrj59mPy9PV%2BMBtubkfL2Zefd782F0LLI8BLseGrZEFhBsQ7s400RLZCCQYpv7tcxYjB2QIE%2BdCK485lMUswv7P4pf5ichVIGVw3ROJFP0OSQEY3fIoYvXAl%2FsJtpBFXNQZOX8jihv1tKQQC96jSXZuGXwjrHGEpX7NUz%2FZAku89nWeLYt%2F9tijli%2FecMR%2BZMYrSSLMqtwdTrZcxSv6DE4IJ5ZKUFBZ%2FQBi3RACjKOW3Abcy5PLL3LqIO%2B5YDCQoDPE2uChZpiHM99s3IrbTWfbDuFGDuIHayACa2xVmcv3doFGQkPcIkow1y1VCbaCDZskpaqh1hNrolEgziB6WaYBICigiWYnvPyhj1SycY3pdz6kGIlbq%2B38JUoZCEMIpHFMIPnzkWqZkOeeAvW8XcXUXqWK96SKDzgLblI1bkMA0HOcEoDZ1Ax3VbnCN2L%2F59ae%2Bb4n7X%2FlMfu%2BK%2B%2Bm6MXm6adzcQYr4tnLwTkAhI0sawP3hAEOFqOhYNcBwdyRZCjFg6FGlNyaAxAp3BPFtVK5gq3V51EK43I14pklGWmqq4i31OKoeBmgEmaancJZqz6f7j2Nr%2FsOXu%2BV6iyCXdcArcsSc8qsiKfA533mx2DnntFz1V%2FSeRBlkjcKTfVCqUD8ljyT3sKOq1d56dHid4fQfPYF5oSrPZ4s8Cou4dC977jTXtWQkK49qx5S6zsqT3c4men1yTacFr7P65Gr5RcHuVc9Wvqtaa9DXzVWVboXxdUfUh89azw91NPdtlNbqtHRiMeXVVAFUU9RxNbUHGnpN7n3Dnx3Lpf9c0ixD%2BgjW3IZFCzPLfsmsZOtZqYnTbdmsOItD8NFgDVSsDCcczwCV0xVUjt6Ya0I1oSCIQXmo%2FRtZtm%2BILFOi7g4ux1C%2FVM4XKZzvJiwOEQV2r81GzSL1fbO9Z6MDtLZUlk5cKO2dSe%2FteE9u5Z2h%2F8nVyZgp9fhuV1zM03x5Bhm37Ouy1nbnwchaTd3lDlmrqVPZPWv13hRrPbUDVD24RU%2FXnFXvIOYfa6ZE%2BHr%2FjLKSDOiDv9sYvrZZpgOh01UOsk3nwb31hVEwBzj%2FzEphJpE8E450NIamzzgvyolsPTuWEXZfw1SiY2prVSi%2FE9RkmfPUrOjqbMBxjEWuK2arn%2B0PY3q3dTZtU7yXbJnzN7k3pIUG%2Bz6f%2Fn0ZXpmyX77NXZ3HP7pPfHx0%2BWp0DQ0UcmiIru46MqY%2FKGxnkAEGWYaC40ik9TboYpXgWjzeGbaMeyiBvHBbZ6eqwfZSFNLWwLN2oUcWMFWh44PiH2%2BWXcQHoEzODhFISBrexyiVQ3LuQAquEa5UcXhnYllCWUwiHvH4qpZWgY3hAzOE9ZwwRpJn9KeqV6PC%2FTxe5La%2B%2BLhtGnOwF9n%2BHk1bvIjjBDaNaSL7bX%2Fl9oFHLlR7ZanyQB%2Flt%2FV%2FB8vp9T8wnavf
