<template>
  <div>
    <h1 class="team-title">Equipe</h1>
    <ul class="list-group">
      <li v-for="(funcionario, index) in funcionarios" :key="index" class="list-group-item">
        <div class="checkbox-container">
          <input type="checkbox" v-model="funcionario.leader" @change="selectLeader(funcionario)" class="leader-checkbox" />
          <span :class="{ leader: funcionario.leader }" class="funcionario-name">{{ funcionario.name }}</span>
        </div>
      </li>
    </ul>
  </div>
</template>

<script lang="js">
import http from '@/service/http';

export default {
  name: 'EquipeView',
  data() {
    return {
      funcionarios: [],
      leaderSelected: false,
    };
  },
  created() {
    http.get('/funcionarios')
      .then((response) => {
        this.funcionarios = response.data;
      })
      .catch((error) => {
        console.error('Erro ao buscar a lista de funcionários', error);
        alert('Algo deu errado, tente novamente mais tarde.');
      });
  },
  methods: {
    selectLeader(selectedFuncionario) {
      // Desmarque outros funcionários como líderes
      this.funcionarios.forEach((funcionario) => {
        if (funcionario !== selectedFuncionario) {
          funcionario.leader = false;
        }
      });
      
      if (selectedFuncionario.leader) {
        this.leaderSelected = true;
        alert(`O funcionário ${selectedFuncionario.name} foi selecionado como líder.`);
      } else {
        this.leaderSelected = false;
      }
    },
  },
};
</script>

<style scoped>
/* Estilo para o título da equipe */
.team-title {
  font-size: 24px;
  margin-bottom: 20px;
}

/* Estilo para a lista de funcionários */
.list-group-item {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 10px;
  margin: 10px 0;
  background-color: #f5f5f5;
  border: 1px solid #ddd;
  border-radius: 5px;
}

/* Container para centralizar a checkbox e o nome */
.checkbox-container {
  display: flex;
  align-items: center;
}

/* Estilo para a checkbox do líder */
.leader-checkbox {
  margin-right: 10px;
  transform: scale(1.5); /* Aumenta o tamanho da checkbox */
  align-self: center; /* Centraliza verticalmente a checkbox */
}

/* Estilo para o nome do funcionário */
.funcionario-name {
  font-size: 18px;
  color: #333;
}

/* Estilo para o líder da equipe */
.leader {
  font-weight: bold;
  color: #007bff;
  /* Cor personalizada para o líder da equipe */
}
</style>
