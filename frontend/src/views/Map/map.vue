<template xmlns:el-col="http://www.w3.org/1999/xhtml">
  <div>
    <el-container style="height:100vh;width:100vw;border:1px ;solid:#eee">
      <el-aside width="200px" style="background-color: #eee">
        <Aside/>
      </el-aside>
      <el-container class="header-and-main">
        <el-header>
          <Head/>
        </el-header>
        <el-main  class="main">
          <div class="container">
            <el-card style="width:100%;height: 70%;overflow: hidden;padding-right:2px">
              <mapView/>
            </el-card>
          </div>

        </el-main>

      </el-container>
    </el-container>
  </div>
</template>

<script>
import mapView from './mapView.vue';

// 引入公共组件顶部和侧边栏
import Head from "@/components/Head.vue";
import Aside from "@/components/Aside.vue";
import map_edit from "./map_edit.vue";
import map_path from "./map_path.vue";
import map_rail from "./map_rail.vue";
export default {
  components: {
    Head,
    Aside,
    mapView
  },
}
</script>

<style>
.header-and-main{
  flex-direction: column;
}
.main{
  display: flex;
  flex-direction:column;
  align-items: flex-start;
  justify-content: space-between;
  height: 100%;
}
.container{
  margin:5vh;
  img{
    width: 79vw;
    height: 70vh;
  }
}
</style>
