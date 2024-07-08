import Vue from 'vue'
import VueRouter from 'vue-router'
import HomePageView from '../views/HomePage/HomePage.vue'
import EntranceView from '../views/Entrance/Entrance.vue'
import LoginView from '../views/Login/Login.vue'
import StaffView from '../views/staffManagement/Staff.vue'
import CarView from '@/views/CarManagement/Car.vue'
import MaterialView from '../views/MaterialManagement/Material.vue'
import DeviceView from '../views/DeviceManagement/Device.vue'
import BackView from '../views/Login/back.vue'
import MapView from '../views/Map/map.vue'
import SecurityView from '../views/Security/security.vue'
import TaskView from '../views/Task/task.vue'
import CalenderView from '../views/staffManagement/StaffView.vue'


Vue.use(VueRouter)
  //  entrance与login同级路由，基础路由配置
const routes = [
  {
    path: '/homepage',
    name: 'homepage',
    component:  HomePageView
  },
  {
    path: '/',
    name: 'entrance',
    component: EntranceView
  },
  {
    path: '/login',
    name: 'login',
    component: LoginView
  },
  {
    path:'/back',
    name: 'back',
    component:BackView,
    children:[
      {
        path:'staff',
        name:'staff',
        component: StaffView
      },
      {
        path:'staCalender',
        name:'staCalender',
        component: CalenderView
      },
      {
        path:'car',
        name:'car',
        component: CarView
      },
      {
        path:'material',
        name:'material',
        component: MaterialView
      },
      {
        path:'device',
        name:'device',
        component: DeviceView
      },
      {
        path:'map',
        name:'map',
        component: MapView
      },
      {
        path:'security',
        name:'security',
        component: SecurityView
      },
      {
        path:'task',
        name:'task',
        component: TaskView
      }
    ]
  }
];

const router = new VueRouter({
  mode: 'history',
  //base: process.env.BASE_URL,
  routes
})

export default router
