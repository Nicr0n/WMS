import Vue from 'vue'
import Router from 'vue-router'


Vue.use(Router)

export default new Router({
    mode: "history",
    routes: [{
        path: '/login',
        name: 'login',
        component: () =>
            import ('../views/login/Login.vue')
    }, {
        path: '/layout',
        name: 'layout',
        component: () =>
            import ('../views/layout/Layout.vue')
    }]
})