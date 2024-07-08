<template>
  <div :style="Hstylebg" class="home-pagebackground" >
    <div :style="Hstylebox">
      <div class="H1box">
        <div class="Hbox1"></div>
        <div class="Hbox2"></div>
      </div>>
      <div class="H2box">
        <div class="Hbox3"></div>
        <div class="Hbox4"></div>
      </div>
      <div class="H3box">
        <div class="Hbox5"></div>
        <div class="Hbox6"></div>
        <div class="Hbox7"></div>
        <div class="Hbox8"></div>
      </div>
    </div>

  </div>
</template>



<script >

export default {


   methods:{
     Hstylebg:{
       position: 'absolute',
       zIndex: 1,
     },
     Hstylebox:{
       position: 'absolute',
       zIndex: 2,
     },

   },

  }


</script>


<style scoped>
  /*图层1*/
  .home-pagebackground {
    background: url("../../image/HomePageImage/background.png");
    background-size: cover; /* 背景图片覆盖整个元素 */
    background-position: center; /* 背景图片居中 */
    height: 100vh; /* 高度占满整个视口高度 */
    width: 100vw; /* 宽度占满整个视口宽度 */
    position: fixed; /* 定位为固定，这样背景就会固定在视口中 */
    top: 0; /* 顶部对齐 */
    left: 0; /* 左边对齐 */
  }
  .H1box{
    display: flex;
    .Hbox1{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 10vh;
      margin-left: 1vw;
    }
    .Hbox2{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 10vh;
      margin-left: 58vw;
    }
  }
  .H2box{
    display: flex;
    .Hbox3{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 0vh;
      margin-left: 1vw;
    }
    .Hbox4{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 0vh;
      margin-left: 58vw;
    }
  }
  .H3box{
    display: flex;
    .Hbox5{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 2vh;
      margin-left: 1vw;
    }
    .Hbox6{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 2vh;
      margin-left: 1vw;
    }
    .Hbox7{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 2vh;
      margin-left: 1vw;
    }
    .Hbox8{
      background: url("../../image/HomePageImage/homebox0.png");
      height: 25vh;
      width: 20vw;
      margin-top: 2vh;
      margin-left: 1vw;
    }
  }







</style>
