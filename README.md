<h1  >API REST - Cadastro de times</h1>
 <hr>
<p align="left">O projeto se baseia em uma SPA que consome uma api para cadastro de empresa,funcionario e equipe</p>

<h2>Tecnologias utilizadas</h2>
<div style="display: inline_block">
  <li>Vue.js</li>
  <li>Axios</li>
  <li>Materialize</li>
</div>


<h2>Como usar</h2>
<div style="display: inline_block">
  <li>Inciar a API</li>
  <li>Iniciar o front (npm run serve)</li>

  <h1  >API REST - Cadastro de veículos</h1>
 <hr>
<p align="left">O projeto se baseia em uma API Rest que fornece os métodos (GET,POST,PUT,PATCH,DELETE) para controle  de uma empresa,funcionario e equipe. O front-end que consome esta api se encontra no mesmo repositório</p>

<h2>Tecnologias utilizadas</h2>

<div style="display: inline_block">

<img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/java.svg" width=100 />

<img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/spring.svg" width=100 />

<img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/vue-dot-js.svg" width=100 />

<img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/html5.svg" width=100 />

<img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/css3.svg" width=100 />

<img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@9.19.1/icons/axios.svg" width=100 />
       
</div>


<h2>Requisitos</h2>
  <li>Permitir o cadastro de empresa,equipe e funcionario</li>
  <li>Permitir a atualização de dados de uma empresa,equipe e funcionario</li>
  <li>Permitir a exclusão de dados de uma empresa,equipe e funcionario</li>
  <li>Exibir a informação  de dados de uma empresa,equipe e funcionario</li>
  <li>Deverá haver consistência das marcas fornecidas. Não poderá haver marcas escritas de forma errada<li>


<h2>Endpoints</h2>
<h3>Empresa</h3>
<ol>GET<ol>
  <li><b>localhost:8080/empresa</b> -- retorna todos os veiculos (metodo: obterEmpresas)</li>
  <li><b>localhost:8080/empresa/id</b> -- retorna a empresa de acordo com o id informado (metodo: obterEmpresaPorId)</li>
</ol>
</ol>

<ol>POST<ol>
  <li><b>localhost:8080/empresa</b> -- cadastrar um novo veiculo (metodo: criarEmpresa)</li>
</ol>
</ol>


<ol>PUT<ol>
  <li><b>localhost:8080/empresa/id</b> -- altera os dados do veiculo  (metodo: editarEmpresa)</li>
</ol>
</ol>




<ol>DELETE<ol>
  <li><b>localhost:8080/empresa/id</b> -- exclui um veiculo (metodo: deletarEmpresa)</li>
</ol>
</ol>



<h3>Equipe</h3>
<ol>GET<ol>
  <li><b>localhost:8080/equipe</b> -- retorna todos os veiculos (metodo: getEquipes)</li>
  <li><b>localhost:8080/equipe/id</b> -- retorna a empresa de acordo com o id informado (metodo: obterEmpresaPorId)</li>
</ol>
</ol>

<ol>POST<ol>
  <li><b>localhost:8080/equipe</b> -- cadastrar uma nova equipe (metodo: cadastrarLider)</li>
</ol>
</ol>


<ol>PUT<ol>
  <li><b>localhost:8080/equipe/id</b> -- altera os dados do veiculo  (metodo: editarLider)</li>
</ol>
</ol>




<ol>DELETE<ol>
  <li><b>localhost:8080/equipe/id</b> -- exclui uma equipe (metodo: deletarEquipe)</li>
</ol>
</ol>




<h2>Demonstração da aplicação </h2>
<li>https://drive.google.com/file/d/1aguzMaNdeiEWl49rv3Q3Xgslm6LOFH2I/view?usp=sharing</li>
