<template>
  <div>
    <nav>
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> |
      <router-link to="/funcionario">Funcionario</router-link> |
      <router-link to="/equipe">Equipe</router-link> |
      <router-link to="/localizacao">Localizacao</router-link> |
      <router-link to="/empresa">Empresa</router-link>
    </nav>
    <router-view />
  </div>
</template>
<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  background-color: #333; /* Cor de fundo do nav */
  color: #fff; /* Cor do texto */
  padding: 10px; /* Espaçamento interno */

  a {
    font-weight: bold;
    text-decoration: none;
    color: #fff;
    margin-right: 20px; /* Espaço entre os links */

    &.router-link-exact-active {
      color: #42b983;
    }

    &:hover {
      text-decoration: underline; /* Sublinhar o link no hover */
    }
  }
}
</style>
