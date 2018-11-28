import Vue from 'vue'
import Router from 'vue-router'
import TimeTracker from '../components/TimeTracker'
import TimeTrackerView from '../components/TimeTrackerView'

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/',
            name: 'TimeTrackerView',
            component: TimeTrackerView
        }
    ]
})