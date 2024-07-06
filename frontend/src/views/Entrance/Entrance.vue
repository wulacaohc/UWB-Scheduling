<template>
  <!--    入口-->
  <div class="back-entrance">
    <img  class="logo" src="../../image/logo.png" alt="">
    <div style="display: flex; flex-direction: column;justify-content: center;">
      <h1 class="logoName">铜杆车间调度系统平台</h1>
      <h1 class="welcome">欢迎使用铜杆车间调度系统平台</h1>
      <h2 class="target">致力于打造车间流程全可视化、人员调度更便捷的铜杆车间调度系统</h2>
      <el-button id="button" @click="goToLogin"> 进入 </el-button>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
export default{
  methods:{
    goToLogin(){
      this.$router.push({name:'login'})
    }
  }
}

</script>

<style>
.back-entrance{
  background-image: url("../../../public/module/backpage.jpg");
  background-size: cover;
  background-position: center;
  height: 100vh;
  width: 100vw;
  margin: 0 auto;
  display:flex;
  justify-content: center;
  .logo{
    width: 157px;
    height: 140px;
    margin-top:25vh;
    margin-left:10vw;
  };
  .logoName{
    width: 378px;
    height: 106px;
    font-size: 37px;
    font-weight: bold;
    line-height: 53px;
    color: #0F4264;
    margin-top:0vh;
  };
  .welcome{
    width: 672px;
    height: 67px;
    font-size: 48px;
    font-weight: bold;
    line-height: 67px;
    letter-spacing: 0;
    color: #000000;
    margin-left:-10vw;
    margin-top:-8vh;
  };
  .target{
    width: 720px;
    height: 34px;
    font-size: 24px;
    font-weight: bold;
    line-height: 34px;
    display: flex;
    align-items: center;
    letter-spacing: 0;
    color: #BB4430;
    margin-left:-12vw;
    margin-top:-2vh;
  }
  #button{
    width: 300px;
    height: 49px;
    background: #4F4F4F;
    font-size: 25px;
    color: white;
  }
}
</style>
