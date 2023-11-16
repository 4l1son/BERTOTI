<template>
  <div class="home">
    <!-- Componente Funcionário -->
    <div class="section" id="Funcionario">
      <button @click="showFuncionario = !showFuncionario" class="section-button">
        Funcionário
      </button>
      <transition name="fade">
        <div v-if="showFuncionario">
          <p>
            Nome: <input v-model="funcionarioParaEdicao.name" type="text" class="input-field" name="name" />
            ID: <input v-model.number="funcionarioParaEdicao.id" type="number" class="input-field" name="id" />
            <button @click="createFuncionario" class="btn-cadastrar">Cadastrar</button>
            <button @click="getFuncionarios" class="btn-cadastrar">Mostrar funcionários cadastrados</button>
          </p>

          <div v-if="funcionarios.length > 0">
            <h2>Funcionários Cadastrados:</h2>
            <table>
              <thead>
                <tr>
                  <th>ID</th>
                  <th>Nome</th>
                  <th>Ações</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(funcionario, index) in funcionarios" :key="index">
                  <td>{{ funcionario.id }}</td>
                  <td>{{ funcionario.name }}</td>
                  <td>
                    <button @click="editarFuncionario(funcionario)" class="btn-editar"><i class="fas fa-pencil-alt"></i> Editar</button>
                    <button @click="deletarFuncionario(index)" class="btn-deletar"><i class="fas fa-trash-alt"></i> Deletar</button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>

          <!-- Formulário de Edição -->
          <div v-if="modoEdicaoFuncionario">
            <h2>Editar Funcionário</h2>
            <label>Nome: <input v-model="funcionarioParaEdicao.name" type="text" /></label>
            <label>ID: <input v-model.number="funcionarioParaEdicao.id" type="number" /></label>
            <button @click="salvarEdicaoFuncionario">Salvar</button>
            <button @click="cancelarEdicaoFuncionario">Cancelar</button>
          </div>
        </div>
      </transition>
    </div>

    <!-- Componente Empresa -->
    <div class="section" id="Empresa">
      <button @click="show = !show" class="section-button">
        Empresa
      </button>
      <transition name="fade">
        <div v-if="show">
          <p>
            Nome: <input v-model="nome" type="text" class="input-field" name="nome" id="nome" />
            Ramo: <input v-model="ramo" type="text" class="input-field" name="ramo" id="ramo" />
            <button @click="createEmpresa" class="btn-cadastrar">Cadastrar</button>
            <button @click="getEmpresas" class="btn-cadastrar">Mostrar empresas cadastradas</button>
          </p>

          <div v-if="empresas.length > 0">
            <h2>Empresas Cadastradas:</h2>
            <table>
              <thead>
                <tr>
                  <th>Nome</th>
                  <th>Ramo</th>
                  <th>Ações</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(empresa, index) in empresas" :key="index">
                  <td>{{ empresa.nome }}</td>
                  <td>{{ empresa.ramo }}</td>
                  <td>
                    <button @click="editarEmpresa(empresa)" class="btn-editar"><i class="fas fa-pencil-alt"></i> Editar</button>
                    <button @click="deletarEmpresa(index)" class="btn-deletar"><i class="fas fa-trash-alt"></i> Deletar</button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>

          <!-- Formulário de Edição -->
          <div v-if="modoEdicao">
            <h2>Editar Empresa</h2>
            <label>Nome: <input v-model="empresaParaEdicao.nome" type="text" /></label>
            <label>Ramo: <input v-model="empresaParaEdicao.ramo" type="text" /></label>
            <button @click="salvarEdicao">Salvar</button>
            <button @click="cancelarEdicao">Cancelar</button>
          </div>
        </div>
      </transition>
    </div>

    <!-- Componente Equipe -->
    <div class="section" id="Equipe">
      <button @click="showEquipe = !showEquipe" class="section-button">
        Equipe
      </button>
      <transition name="fade">
        <div v-if="showEquipe">
          <p>
            Líder: <input v-model="equipeParaEdicao.liderNome" type="text" class="input-field" name="liderNome" />
            ID: <input v-model.number="equipeParaEdicao.id" type="number" class="input-field" name="id" />
            <button @click="cadastrarLider" class="btn-cadastrar">Cadastrar Líder</button>
            <button @click="getEquipes" class="btn-cadastrar">Mostrar equipes cadastradas</button>
          </p>

          <!-- Formulário de Edição -->
          <div v-if="modalEdicaoEquipe">
            <h3>Editar Equipe</h3>
            <form @submit.prevent="editarEquipe">
              <label for="editarLiderNome">Novo Líder:</label>
              <input v-model="equipeParaEdicaoNovo.liderNome" type="text" id="editarLiderNome" name="editarLiderNome" class="input-field" />
              <button type="submit" class="btn-editar">Salvar Edição</button>
            </form>
          </div>

          <div v-if="equipes.length > 0">
            <h2>Equipes Cadastradas:</h2>
            <table>
              <thead>
                <tr>
                  <th>ID</th>
                  <th>Líder</th>
                  <th>Ações</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(equipe, index) in equipes" :key="index">
                  <td>{{ equipe.id }}</td>
                  <td>{{ equipe.liderNome }}</td>
                  <td>
                    <button @click="editarLider(equipe)" class="btn-editar"><i class="fas fa-pencil-alt"></i> Editar</button>
                    <button @click="deletarEquipe(equipe.id)" class="btn-deletar"><i class="fas fa-trash-alt"></i> Deletar</button>
                    <button @click="adicionarFuncionario(equipe.id)" class="btn-adicionar"><i class="fas fa-plus"></i> Adicionar Funcionário</button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </transition>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import http from '@/services/http';
import { FuncionarioModel } from '@/model/FuncionarioModel';
import { EmpresaModel } from '@/model/EmpresaModel';
import { EquipeModel } from '@/model/EquipeModel';

export default defineComponent({
  data() {
    return {
      // Funcionário
      showFuncionario: false,
      funcionarios: [] as FuncionarioModel[],
      funcionarioParaEdicao: {} as FuncionarioModel,
      modoEdicaoFuncionario: false,

      // Empresa
      show: false,
      empresas: [] as EmpresaModel[],
      nome: '',
      ramo: '',
      empresaParaEdicao: {} as EmpresaModel,
      modoEdicao: false,

      // Equipe
      showEquipe: false,
      modalEdicaoEquipe:false,
      equipes: [] as EquipeModel[],
      equipeParaEdicao: { id: 0, liderNome: '', funcionarios: [] } as EquipeModel,
      equipeParaEdicaoNovo: { id: 0, liderNome: '', funcionarios: [] } as EquipeModel,
    };
  },
  methods: {
    // Funcionário
    async createFuncionario() {
      try {
        const response = await http.post('/funcionario', this.funcionarioParaEdicao);
        this.funcionarios.push(response.data);
        this.funcionarioParaEdicao = new FuncionarioModel(0, ''); // Reinicializar após o cadastro
      } catch (error) {
        console.error('Erro ao cadastrar funcionário:', error);
      }
    },

    async getFuncionarios() {
      try {
        const response = await http.get('/funcionario');
        this.funcionarios = response.data;
      } catch (error) {
        console.error('Erro ao obter funcionários:', error);
      }
    },

    async editarFuncionario(funcionario: FuncionarioModel) {
      this.funcionarioParaEdicao = { ...funcionario }; // Cria uma cópia para evitar alterações diretas
      this.modoEdicaoFuncionario = true;
    },

    async salvarEdicaoFuncionario() {
      try {
        await http.put(`/funcionario/${this.funcionarioParaEdicao.id}`, this.funcionarioParaEdicao);
        const index = this.funcionarios.findIndex((f) => f.id === this.funcionarioParaEdicao.id);
        if (index !== -1) {
          this.funcionarios[index].name = this.funcionarioParaEdicao.name;
        }
        this.modoEdicaoFuncionario = false;
      } catch (error) {
        console.error('Erro ao atualizar funcionário:', error);
      }
    },

    cancelarEdicaoFuncionario() {
      this.modoEdicaoFuncionario = false;
    },

    async deletarFuncionario(index: number) {
      const funcionarioParaDeletar: FuncionarioModel = this.funcionarios[index];

      if (funcionarioParaDeletar && funcionarioParaDeletar.id !== null) {
        try {
          await http.delete(`/funcionario/${funcionarioParaDeletar.id}`);
          this.funcionarios.splice(index, 1);
          alert('Funcionário deletado com sucesso!');
        } catch (error) {
          console.error('Erro ao excluir funcionário:', error);
        }
      } else {
        console.log('Funcionário inválido para exclusão:', funcionarioParaDeletar);
      }
    },

    // Empresa
    async createEmpresa() {
      const novaEmpresa = new EmpresaModel(this.nome, this.ramo, this.empresas.length + 1);

      try {
        const response = await http.post('/empresa', novaEmpresa);
        this.empresas.push(response.data);
        this.nome = '';
        this.ramo = '';
      } catch (error) {
        console.error('Erro ao cadastrar empresa:', error);
      }
    },

    async getEmpresas() {
      try {
        const response = await http.get('/empresa');
        this.empresas = response.data;
      } catch (error) {
        console.error('Erro ao obter empresas:', error);
      }
    },

    editarEmpresa(empresa: EmpresaModel) {
      this.empresaParaEdicao = { ...empresa };
      this.modoEdicao = true;
    },

    async deletarEmpresa(index: number) {
      const empresaParaDeletar: EmpresaModel = this.empresas[index];

      if (empresaParaDeletar && empresaParaDeletar.id !== null) {
        try {
          await http.delete(`/empresa/${empresaParaDeletar.id}`);
          this.removerEmpresaDoArrayLocal(index);
          alert('Empresa deletada com sucesso!');
        } catch (error) {
          console.error('Erro ao excluir empresa:', error);
        }
      } else {
        console.log('Empresa inválida para exclusão:', empresaParaDeletar);
      }
    },

    removerEmpresaDoArrayLocal(index: number) {
      this.empresas.splice(index, 1);
    },

    async salvarEdicao() {
      try {
        if (this.empresaParaEdicao && this.empresaParaEdicao.id !== null) {
          await http.put(`/empresa/${this.empresaParaEdicao.id}`, this.empresaParaEdicao);

          const index = this.empresas.findIndex((e) => e.id === this.empresaParaEdicao.id);

          if (index !== -1) {
            if (this.empresaParaEdicao) {
              this.empresas[index].nome = this.empresaParaEdicao.nome;
              this.empresas[index].ramo = this.empresaParaEdicao.ramo;
            }
          }

          alert('Empresa atualizada com sucesso!');
          this.modoEdicao = false;
        }
      } catch (error) {
        console.error('Erro ao atualizar empresa:', error);
      }
    },

    cancelarEdicao() {
      this.modoEdicao = false;
    },

    // Equipe
    async cadastrarLider() {
      try {
        const response = await http.post('/equipe', this.equipeParaEdicao);
        this.equipes.push(response.data);
        this.equipeParaEdicao = { id: 0, liderNome: '', funcionarios: [] }; // Reinicializar após o cadastro
      } catch (error) {
        console.error('Erro ao cadastrar líder:', error);
      }
    },

    async getEquipes() {
      try {
        const response = await http.get('/equipe');
        this.equipes = response.data;
      } catch (error) {
        console.error('Erro ao obter equipes:', error);
      }
    },
    async editarLider(equipe: EquipeModel) {
  this.equipeParaEdicao = { ...equipe };
  this.modalEdicaoEquipe = true; // Update to use modoEdicaoEquipe
},

    async deletarEquipe(id: number) {
      try {
        await http.delete(`/equipe/${id}`);
        this.equipes = this.equipes.filter((equipe) => equipe.id !== id);
        alert('Equipe deletada com sucesso!');
      } catch (error) {
        console.error('Erro ao excluir equipe:', error);
      }
    },

    async adicionarFuncionario(id: number) {
      // Implemente lógica para adicionar funcionário à equipe
    },

    async editarEquipe() {
      try {
        const response = await http.put(`/equipe/${this.equipeParaEdicao.id}`, this.equipeParaEdicaoNovo);
        const index = this.equipes.findIndex((e) => e.id === this.equipeParaEdicao.id);
        if (index !== -1) {
          this.equipes[index].liderNome = this.equipeParaEdicaoNovo.liderNome;
          // Se houver outras propriedades a serem atualizadas, faça isso aqui
        }
        alert('Equipe editada com sucesso!');
        this.equipeParaEdicao = { id: 0, liderNome: '', funcionarios: [] };
        this.equipeParaEdicaoNovo = { id: 0, liderNome: '', funcionarios: [] };
      } catch (error) {
        console.error('Erro ao editar equipe:', error);
      }
    },
  },
  mounted() {
    this.getFuncionarios();
    this.getEmpresas();
    this.getEquipes();
  },
});
</script>

<style scoped>
/* Estilos gerais */
.home {
  background-color: #f2f2f2;
  padding: 20px;
}

.section {
  background-color: #fff;
  padding: 15px;
  margin-bottom: 10px;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.section-button {
  background-color: #3498db;
  color: #fff;
  border: none;
  padding: 12px 24px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 18px;
  cursor: pointer;
  border-radius: 6px;
  transition: background-color 0.3s;
  margin-bottom: 10px;
}

.section-button:hover {
  background-color: #2980b9;
}

.input-field {
  margin-bottom: 10px;
  padding: 8px;
  width: 100%;
  box-sizing: border-box;
}

table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 10px;
}

th, td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: left;
}

th {
  background-color: #4caf50;
  color: white;
}

.btn-cadastrar,
.btn-editar,
.btn-deletar {
  background-color: #4caf50;
  color: white;
  border: none;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  cursor: pointer;
  border-radius: 4px;
  transition: background-color 0.3s;
  margin-left: 10px;
}

.btn-cadastrar:hover,
.btn-editar:hover,
.btn-deletar:hover {
  background-color: #45a049;
}
</style>
