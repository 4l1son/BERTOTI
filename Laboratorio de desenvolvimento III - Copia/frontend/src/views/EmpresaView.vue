<template>
  <div >
    <h1>Empresas</h1>

    <!-- Formulário para adicionar novas empresas -->
    <div class="form-group">
      <label for="nomeEmpresa">Nome da Empresa:</label>
      <input type="text" class="form-control" id="nomeEmpresa" v-model="nomeEmpresa" />
      <label for="ramoAtuacao">Ramo de Atuação:</label>
      <input type="text" class="form-control" id="ramoAtuacao" v-model="ramoAtuacao" />
      <button type="submit" @click="createEmpresa">Cadastrar Empresa</button>
    </div>

    <!-- Tabela para exibir as empresas -->
    <div class="center-table" >
    <table class="table">
      <thead>
        <tr>
          <th>Nome da Empresa</th>
          <th>Ramo de Atuação</th>
          <th>Ações</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(empresa, index) in empresas" :key="index">
          <td>{{ empresa.nome }}</td>
          <td>{{ empresa.ramo }}</td>
          <td>
            <button @click="editarEmpresa(index)">Editar</button>
            <button @click="deletarEmpresa(index)">Excluir</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</div>
</template>

<script>
export default {
  data() {
    return {
      nomeEmpresa: '',
      ramoAtuacao: '',
      empresas: [],
      empresaEditIndex: -1
    };
  },
  methods: {
    createEmpresa() {
      // Verifique se está editando ou criando uma nova empresa
      if (this.empresaEditIndex === -1) {
        // Adicionar uma nova empresa à lista
        this.empresas.push({ nome: this.nomeEmpresa, ramo: this.ramoAtuacao });
      } else {
        // Atualizar uma empresa existente
        this.empresas[this.empresaEditIndex] = { nome: this.nomeEmpresa, ramo: this.ramoAtuacao };
        // Ressete o índice de edição
        this.empresaEditIndex = -1;
      }

      // Limpar o formulário
      this.nomeEmpresa = '';
      this.ramoAtuacao = '';
    },
    editarEmpresa(index) {
      // Preencher o formulário com os dados da empresa selecionada para edição
      this.nomeEmpresa = this.empresas[index].nome;
      this.ramoAtuacao = this.empresas[index].ramo;
      this.empresaEditIndex = index;
    },
    deletarEmpresa(index) {
      // Remover a empresa da lista
      this.empresas.splice(index, 1);
    }
  }
};
</script>

<style>
.center-table {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100v;
}
</style>