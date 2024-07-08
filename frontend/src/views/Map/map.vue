<template xmlns:el-col="http://www.w3.org/1999/xhtml">
  <div>
    <el-container style="height:100vh;width:100vw;border:1px;solid:#eee">
      <el-aside width="200px" style="background-color: #eee">
        <Aside/>
      </el-aside>
      <el-container>
        <el-header>
          <Head/>
        </el-header>
        <div class="container">
          <el-card style="width:70%;height:70%;padding-right:2px">
            <mapView/>
          </el-card>
        </div>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import mapView from './mapView.vue';

// 引入公共组件顶部和侧边栏
import Head from "@/components/Head.vue";
import Aside from "@/components/Aside.vue";

export default {
  components: {
    Head,
    Aside,
    mapView
  },
}
</script>

<style>
.header-and-main {
  flex-direction: column;
}

.container {
  margin: 5vh;
  width: 100vw;
  height: 100vh;
}
</style>
