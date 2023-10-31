<template>
  <div>
    <div class="d-flex justify-content-end mb-3">
      <button class="btn btn-outline-primary" @click="openCreateModal">Cadastrar Novo Funcionário</button>
    </div>
    <div class="center-table">
      <div class="row justify-content-center">
        <table class="table table-responsive no-wrap-table">
          <table class="table table-responsive no-wrap-table">
    <thead>
      <tr>
        <th scope="col" class="text-left">Cod</th>
        <th scope="col" class="text-left">Nome</th>
        <th scope="col" class="text-center">Status</th>
        <th scope="col" class="text-center">Ações</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="funcionario in funcionarios" :key="funcionario.id">
        <td class="text-left">{{ funcionario.id }}</td>
        <td class="text-left">
          <span v-if="!funcionario.editing">{{ funcionario.name }}</span>
          <input v-else type="text" v-model="funcionario.name" class="form-control">
        </td>
        <td class="text-center">
          <input type="checkbox" v-model="funcionario.leader" class="form-check-input">
          {{ funcionario.leader ? 'Ativo' : 'Inativo' }}
        </td>
        <td class="text-center">
          <button class="btn btn-link btn-action" @click="updateFuncionario(funcionario)">
            {{ funcionario.editing ? 'Salvar' : 'Editar' }}
          </button>
          <button class="btn btn-link btn-action" @click="deleteFuncionario(funcionario.id)">
            Excluir
          </button>
        </td>
      </tr>
    </tbody>
  </table>
        </table>
      </div>
    </div>      
<div class="modal" tabindex="-1" role="dialog" v-show="isCreateModalOpen">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title">Criar Novo Funcionário</h5>
            <button type="button" class="close" @click="closeCreateModal">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <form @submit.prevent="createUser">
              <div class="form-group">
                <label for="name">Nome:</label>
                <input type="text" class="form-control" v-model="newFuncionario.name" id="name" required>
              </div>
              <div class="form-group">
                <label for="id">ID:</label>
                <input type="number" class="form-control" v-model="newFuncionario.id" id="id" required>
              </div>
              <button type="submit" class="btn btn-primary">Criar</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import http from "@/service/http";

export default {
  name: "FuncionarioView",
  data() {
    return {
      funcionarios: [],
      isCreateModalOpen: false,
      newFuncionario: {
        name: "",
        id: 0
      }
    };
  },
  methods: {
    loadAllFuncionarios() {
      http
        .get("/funcionarios")
        .then((response) => {
          this.funcionarios = response.data.map(funcionario => ({
            ...funcionario,
            editing: false
          }));
        })
        .catch((error) => {
          console.error("Erro ao buscar a lista de funcionários", error);
          alert("Algo deu errado, tente novamente mais tarde.");
        });
    },
    createUser() {
      http
        .post("/funcionarios", this.newFuncionario)
        .then((response) => {
          console.log("Funcionário criado", response.data);
          this.closeCreateModal();
          this.loadAllFuncionarios();
        })
        .catch((error) => {
          console.error("Erro ao criar o funcionário", error);
          alert("Algo deu errado, tente novamente mais tarde.");
        });
    },
    openCreateModal() {
      this.isCreateModalOpen = true;
    },
    updateFuncionario(funcionario) {
      if (funcionario.editing) {
        http
          .put(`/funcionarios/${funcionario.id}`, { name: funcionario.name })
          .then(() => {
            funcionario.editing = false;
          })
          .catch((error) => {
            console.error("Erro ao atualizar o funcionário", error);
            alert("Algo deu errado, tente novamente mais tarde.");
          });
      } else {
        funcionario.editing = true;
      }
    },
    deleteFuncionario(id) {
      const idToDelete = id;
      const updatedFuncionarios = this.funcionarios.filter((funcionario) => funcionario.id !== idToDelete);
      http
        .delete(`/funcionarios/${idToDelete}`)
        .then(() => {
          this.funcionarios = updatedFuncionarios;
        })
        .catch((error) => {
          console.error("Erro ao deletar o funcionário", error);
          alert("Algo deu errado, tente novamente mais tarde.");
        });
    },
    closeCreateModal() {
      this.isCreateModalOpen = false;
      this.newFuncionario = {
        name: "",
        id: 0
      };
    },
  },
  mounted() {
    this.loadAllFuncionarios();
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