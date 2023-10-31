import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'
import FuncionarioView from '../views/FuncionarioView.vue'
import EquipeView from '../views/EquipeView.vue'
import LocalizacaoView from '../views/LocalizacaoView.vue'
import EmpresaView from '../views/EmpresaView.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    component: AboutView
  },
  {
    path: '/funcionario',
    name: 'funcionario',
    component: FuncionarioView
  },
  {
    path: '/equipe',
    name: 'equipe',
    component: EquipeView
  },
  {
    path: '/localizacao',
    name: 'localizacao',
    component: LocalizacaoView
  },
  {
    path: '/empresa',
    name: 'empresa',
    component: EmpresaView
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
