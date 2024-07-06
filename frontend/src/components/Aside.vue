<template>
  <div style="min-height:90vh">
    <div class="logo-container" slot="top">
      <img src="../image/logo.png" alt="">
    </div>
    <span style="color:#0F4264;padding-left:1vw;font-size:16px;">铜杆车间调度系统平台</span>
     <el-menu default-active="activeIndex" class="el-menu-vertical-demo" width="500px"
            background-color="#eee" text-color="#545c64" active-text-color="#ffd04b" router>
<!-- 默认高亮第一栏-->
        <el-menu-item index="/back/map">
          <i class="el-icon-location"></i>
          <span>三维地图</span>
        </el-menu-item>
        <el-menu-item index="/back/staff">
          <i class="el-icon-menu"></i>
          <span slot="title">人员管理</span>
        </el-menu-item>
        <el-menu-item index="/back/task" >
         <i class="el-icon-document"></i>
         <span slot="title">任务发布</span>
        </el-menu-item>
        <el-menu-item index="/back/security">
          <i class="el-icon-setting"></i>
          <span slot="title">安全预警</span>
        </el-menu-item>
        <el-submenu index="5">
          <template slot="title">
          <i class="el-icon-files"></i>
          <span slot="title">行车设备管理</span>
          </template>
          <el-menu-item index="/back/car">行车管理</el-menu-item>
          <el-menu-item index="/back/device">设备管理</el-menu-item>
          <el-menu-item index="/back/material">物料管理</el-menu-item>
        </el-submenu>
      </el-menu>
  </div>

</template>

<script>
export default {
  data(){
    return {
      activeIndex:"map",
    }
  }
}

</script>

<style>
.logo-container{
  display: flex;
  margin-bottom: 2vh;
  img{
    padding-top: 5vh;
    padding-left: 1vw;
    max-width: 3vw;
    object-fit: contain;
  }
}
</style>
