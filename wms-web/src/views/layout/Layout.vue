<template>
  <el-container direction="vertical" style="height:100%">
    <NavBar> </NavBar>
    <el-container>
      <SideBar></SideBar>
      <AppLayout></AppLayout>
    </el-container>
  </el-container>
</template>

<script>
import NavBar from "../../components/layout/NavBar";
import SideBar from "../../components/layout/SideBar";
import AppLayout from "../../components/layout/AppLayout";

export default {
  name: "Layout",
  components: {
    NavBar,
    SideBar,
    AppLayout
  }
};
</script>
