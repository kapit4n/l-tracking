import Vue from 'vue'
import App from './App.vue'
import Router from 'vue-router'
import TimeTracker from "./components/TimeTracker"

import router from './router'

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
