import Vue from "vue";
import Vuex from "vuex";
import { Login, Logout } from "@/api/login";
import { setToKen, removeToKen } from "@/utlis/app";

//使用vuex
Vue.use(Vuex);

//创建Vue实例
const store = new Vuex.Store({
  state: {
    token: "",
    isCollapse: false,
    roles: []
  },
  getters: {
    roles: state => state.roles
  },
  mutations: {
    set_collapse(state) {
      state.isCollapse = !state.isCollapse;
    },
    Set_ToKen(state, token) {
      state.token = token;
    },
    Del_ToKen(state) {
      state.token = "";
    }
  },
  actions: {
    login(content, requestData) {
      return new Promise((resolve, reject) => {
        Login(requestData)
          .then(response => {
            let token = response.data.data.token.token;
            content.commit("Set_ToKen", token);
            setToKen(token);
            resolve(response);
          })
          .catch(error => {
            reject(error);
          });
      });
    },
    logout(content, requestData) {
      return new Promise((resolve, reject) => {
        Logout(requestData)
          .then(response => {
            content.commit("Del_ToKen");
            removeToKen();
            resolve(response);
          })
          .catch(error => {
            reject(error);
          });
      });
    }
  }
});

//导出store
export default store;
