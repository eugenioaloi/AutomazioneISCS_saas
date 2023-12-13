import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

import ServicePage from '../components/ServicePage.vue'
import BlogPage from '../components/BlogPage.vue'
import LoginDemo from '../components/LoginDemo.vue'
import LabPage from '../components/LabPage.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/servizi',
    name: 'servizi',
    component: ServicePage
  },
  {
    path: '/blog',
    name: 'blog',
    component: BlogPage
  },
  {
    path: '/login-demo',
    name: 'login',
    component: LoginDemo
  },
  {
    path: '/laboratorio',
    name: 'laboratorio',
    component: LabPage
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
