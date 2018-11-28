import Vue from 'vue'
import Router from 'vue-router'
import TimeTracker from '../components/TimeTracker'

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/',
            name: 'TimeTracker',
            component: TimeTracker
        }
    ]
})