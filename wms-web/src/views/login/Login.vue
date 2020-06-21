<template>
  <el-container class="login">
    <!-- 登录 -->
    <el-form
      class="login-container"
      v-show="showLogin"
      label-position="left"
      label-width="0px"
    >
      <h3 class="login_title">系统登录</h3>
      <el-form-item>
        <el-input
          type="text"
          v-model="loginForm.username"
          auto-complete="off"
          placeholder="账号"
        ></el-input>
      </el-form-item>

      <el-form-item>
        <el-input
          type="password"
          v-model="loginForm.password"
          auto-complete="off"
          placeholder="密码"
        ></el-input>
      </el-form-item>

      <el-form-item style="width: 100%">
        <el-button
          type="primary"
          style="border: none;float:left;width:40%;"
          v-on:click="toRegister"
          >注册</el-button
        >
        <el-button
          type="success"
          style="border: none;float:right;width:40%;"
          v-on:click="login"
          >登录</el-button
        >
      </el-form-item>
    </el-form>
    <!-- 注册 -->
    <el-form
      class="login-container"
      v-show="showRegister"
      label-position="left"
      label-width="0px"
    >
      <h3 class="register_title">新用户注册</h3>
      <el-form-item>
        <el-input
          type="text"
          v-model="registerForm.username"
          auto-complete="off"
          placeholder="用户名"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-input
          type="password"
          v-model="registerForm.password"
          auto-complete="off"
          placeholder="密码"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-input
          type="text"
          v-model="registerForm.email"
          auto-complete="off"
          placeholder="邮箱"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-input
          type="text"
          v-model="registerForm.name"
          auto-complete="off"
          placeholder="姓名"
          style="width:49%"
        ></el-input>
        <el-select
          v-model="registerForm.sex"
          placeholder="性别"
          style="width:49%"
        >
          <el-option
            v-for="sex in sexOption"
            :key="sex.value"
            :label="sex.label"
            :value="sex.value"
          ></el-option>
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-input
          type="text"
          v-model="registerForm.tel"
          auto-complete="off"
          placeholder="联系方式"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-input
          type="text"
          v-model="registerForm.adress"
          auto-complete="off"
          placeholder="联系地址"
        ></el-input>
      </el-form-item>
      <el-row type="flex" style="margin-bottom:22px">
        <span style="float:left">我是:</span>
        <el-switch
          v-model="registerForm.identity"
          active-color="#13ce66"
          inactive-color="#ff4949"
          active-value="supplier"
          inactive-value="customer"
          active-text="供应商"
          inactive-text="顾客"
        ></el-switch>
      </el-row>
      <el-form-item style="width: 100%">
        <el-button
          type="success"
          style="border: none;float:left;width:50%;"
          v-on:click="toLogin"
          >我有账号了,去登陆</el-button
        >
        <el-button
          type="primary"
          style="border: none;float:right;width:40%;"
          v-on:click="register"
          >注册</el-button
        >
      </el-form-item>
    </el-form>
  </el-container>
</template>

<script>
// eslint-disable-next-line no-unused-vars
import axios from "../../utlis/request";
export default {
  name: "Login",
  data() {
    return {
      showRegister: false,
      showLogin: true,
      loginForm: {
        username: "",
        password: ""
      },
      registerForm: {
        username: "",
        password: "",
        email: "",
        adress: "",
        name: "",
        identity: "customer"
      },
      responseResult: [],
      sexOption: [
        {
          value: "男",
          label: "男"
        },
        {
          value: "女",
          label: "女"
        }
      ]
    };
  },
  methods: {
    login() {
      let requestData = {
        username: this.loginForm.username,
        password: this.loginForm.password
      };
      this.$store
        .dispatch("login", requestData)
        // eslint-disable-next-line no-unused-vars
        .then(response => {
          this.$router.push({ name: "layout" });
        })
        .catch(error => {
          console.log(error);
        });
    },
    register() {
      this.$axios.post("/api/register", {
        user: {
          username: this.registerForm.username,
          password: this.registerForm.password
        },
        userInformation: {
          email: this.registerForm.email,
          name: this.registerForm.name,
          sex: this.registerForm.sex,
          tel: this.registerForm.tel,
          adress: this.registerForm.adress
        },
        identity: "customer"
      });
    },
    toRegister() {
      this.showRegister = true;
      this.showLogin = false;
    },
    toLogin() {
      this.showRegister = false;
      this.showLogin = true;
    }
  }
};
</script>
<style scoped>
.el-container {
  background-image: url("../../assets/img/backgroud.jpg");
  background-position: center;
  width: 100%;
  background-size: cover;
  position: fixed;
}
.login {
  height: 100%;
  align-items: center;
  justify-content: center;
}
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}

.login_title {
  margin: 0px auto 20px auto;
  text-align: center;
  color: #505458;
}
.register_title {
  margin: 0px auto 20px auto;
  text-align: center;
  color: #505458;
}
</style>
