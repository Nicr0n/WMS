import Vue from "vue";
import Router from "vue-router";
import store from "../store";

Vue.use(Router);

//页面刷新时自动添加token
if (sessionStorage.getItem("token")) {
  store.commit("set_token", sessionStorage.getItem("token"));
}

export const constantRouteMap = [
  {
    path: "/login",
    name: "login",
    component: () => import("../views/login/Login.vue")
  },
  {
    path: "/layout",
    name: "layout",
    component: () => import("../views/layout/Layout.vue"),
    children: [
      {
        path: "/login",
        name: "innerlogin",
        component: () => import("../views/login/Login.vue"),
        meta: { role: ["supplier"] }
      }
    ]
  }
];

export const asyncRouteMap = [
  {
    path: "/layout",
    name: "layout",
    component: () => import("../views/layout/Layout.vue"),
    children: [
      {
        path: "/login",
        name: "innerlogin",
        component: () => import("../views/login/Login.vue"),
        meta: { role: ["supplier"] }
      }
    ]
  }
];

export default new Router({
  mode: "history",
  routes: constantRouteMap
});
