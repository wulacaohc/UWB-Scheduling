<template>
  <div class="box">
    <div class="box__header">任务调度信息</div>
    <dv-scroll-board :config="config" style="width:98%;height:90%" />
  </div>
</template>

<script>
export default {
  data(){
    return{
      config:{
        header: ['任务名', '任务时间', '任务到达时间'],
        data: [
          ['A', '60', '13:54:16'],
          ['B', '30', '13:54:16'],
          ['C', '30', '13:54:16'],
          ['D', '30', '13:54:16'],
          ['E', '30', '13:54:16'],
          ['F', '30', '13:54:16'],
        ],
        index: true,
        columnWidth: [50],
        align: ['center']
      }
    }

  }
}

</script>

<style>
.box{
  padding:10px;
  height:90%;
  .box__header{
    margin:10px;
    font-size:20px;
    color:white;
  }
}

</style>
