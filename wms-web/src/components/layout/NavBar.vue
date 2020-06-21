<template>
  <el-header>
    <el-menu
      :default-active="activeIndex2"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"
    >
      <el-menu-item index="1" style="font-size:18px;width:200px"
        >仓库管理系统</el-menu-item
      >
      <el-menu-item @click="SiderbarCollapse()"
        ><i class="el-icon-s-fold"></i
      ></el-menu-item>
      <el-menu-item index="2">处理中心</el-menu-item>
      <el-submenu index="3">
        <template slot="title">我的工作台</template>
        <el-menu-item index="3-1">选项1</el-menu-item>
        <el-menu-item index="3-2">选项2</el-menu-item>
        <el-menu-item index="3-3">选项3</el-menu-item>
        <el-submenu index="3-4">
          <template slot="title">选项4</template>
          <el-menu-item index="3-4-1">选项1</el-menu-item>
          <el-menu-item index="3-4-2">选项2</el-menu-item>
          <el-menu-item index="3-4-3">选项3</el-menu-item>
        </el-submenu>
      </el-submenu>
      <el-menu-item index="4" disabled>消息中心</el-menu-item>
      <el-menu-item index="5">
        <a href="https://www.ele.me" target="_blank">订单管理</a>
      </el-menu-item>
      <el-menu-item index="6" style="float:right" @click="logout">
        登出系统
      </el-menu-item>
    </el-menu>
  </el-header>
</template>

<script>
// eslint-disable-next-line no-unused-vars
import axios from "../../utlis/request";
import { getToKen } from "@/utlis/app";
export default {
  name: "navMenu",
  data() {
    return {
      activeIndex: "1",
      activeIndex2: "1"
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
    SiderbarCollapse() {
      this.$store.commit("set_collapse");
    },
    logout() {
      let token = getToKen();
      this.$store
        .dispatch("logout", token)
        // eslint-disable-next-line no-unused-vars
        .then(response => {
          console.log("退出成功");
          this.$router.push({ name: "login" });
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
};
</script>
<style lang="scss" scoped>
.el-header {
  padding: 0;
}
</style>
