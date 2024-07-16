

<template>
 <div>

    <el-container style="height:100vh;width:100vw;border:1px ;solid:#eee">
      <el-aside width="200px" style="background-color: #363636">
       <Aside/>
      </el-aside>
       <el-container class="header-and-main">
         <el-header>
            <Head/>
         </el-header>

           <dv-border-box-9 class="bigmap">
             <img src="../../image/TaskPageImage_2/bigmap.png" class="bigmapImage" alt="bigmapImage"/>
           </dv-border-box-9>



    </el-container>
  </el-container>

 </div>





</template>

<script >
import Aside from "@/components/Aside.vue";
import Head from "@/components/Head.vue";
import request from "@/utils/request";
export default {
  components: {Head, Aside, request},
  data() {
    return {
      dialogVisible: false,
    }
  }
}

</script>

<style scoped>
.bigmap{
    display: block; /* 确保它是一个块级元素 */
    width: 75vw; /* 设置一个明确的宽度 */
    height: 70vh; /* 设置一个明确的高度 */
    overflow: hidden; /* 如果图片被裁剪，隐藏超出部分 */
    position: relative; /* 如果需要内部元素绝对定位 */
    margin-top: 2vh;
    .bigmapImage{
     width:73vw;
      height:68vh;
      margin-top: 1.2vh;
      margin-left: 2.3vh;
    }


}

.header-and-main{
  margin-top: 20px;
}

</style>
