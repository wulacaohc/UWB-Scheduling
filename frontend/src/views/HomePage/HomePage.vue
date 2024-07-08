<template>
  <dv-full-screen-container>
    <div style="height: 100%;background-color:#2c3e6c;overflow:auto">
    <div class="decoration-container">
      <dv-decoration-8 style="width:300px;height:50px;" />
      <dv-decoration-5 style="width:300px;height:40px;"></dv-decoration-5>
      <dv-decoration-8 :reverse="true" style="width:300px;height:50px;" />
    </div>
<!--    <dv-loading>Loading...</dv-loading>-->
<!--    <dv-border-box-1>dv-border-box-1</dv-border-box-1>-->
    <div class="row" style="display: flex;justify-content: flex-end;width: 100%;"><el-button style="margin:10px;background-color: #4F4F4F;color: white;" @click="coming">进入后台</el-button></div>
    <div class="row1">
      <div class="cell">
        <dv-border-box-13>
          <RingChart />
        </dv-border-box-13>
      </div>
      <div class="cell">
        <dv-border-box-8></dv-border-box-8>
      </div>
      <div class="cell">
        <dv-border-box-13><ScrollBoard /></dv-border-box-13>
      </div>
    </div>
    <div class="row2">
      <div class="cell">
        <dv-border-box-12><pieChart /></dv-border-box-12>
      </div>
      <div class="cell">
        <dv-border-box-12><column /></dv-border-box-12>
      </div>
      <div class="cell">
        <dv-border-box-12><number /></dv-border-box-12>
      </div>
    </div>
    </div>
  </dv-full-screen-container>
</template>

<script>
import RingChart from "@/components/RingChart.vue";
import ScrollBoard from "@/components/ScrollBoard.vue";
import pieChart from "@/components/pieChart.vue";
import column from "@/components/column.vue"
import number from "@/components/number.vue"
import {defineComponent} from "vue";

export default defineComponent({
  components: {
    RingChart,
    ScrollBoard,
    pieChart,
    column,
    number
  },
  methods:{
    coming(){
      this.$router.push("/back/map");
    }
  }
})

</script>


<style>
.decoration-container {
  display: flex;
  justify-content: space-between; /* 左右对齐，中间平均分布 */
  align-items: flex-start; /* 垂直顶部对齐 */
  width: 100%;
  height: 50px; /* 可以根据需要调整高度 */
  margin-top: 0; /* 确保装饰容器在顶部 */
}
.row1{
  width: 100%;
  height: 50%;
  display: flex;
  margin: 5px;
  .cell {
    padding: 1vw;
    /* 旁边两列各占1份，中间列占2份 */
    flex: 1;
  };
  .cell:nth-child(2) {
    flex: 2;
  }
}
.row2{
  width: 100%;
  height:45%;
  display: flex;
  margin:5px;
  .cell{
    padding:5px;
    flex: 1;
  }
}
</style>
