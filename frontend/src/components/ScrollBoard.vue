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
          ['行1列1', '行1列2', '行1列3'],
          ['行2列1', '行2列2', '行2列3'],
          ['行3列1', '行3列2', '行3列3'],
          ['行4列1', '行4列2', '行4列3'],
          ['行5列1', '行5列2', '行5列3'],
          ['行6列1', '行6列2', '行6列3'],
          ['行7列1', '行7列2', '行7列3'],
          ['行8列1', '行8列2', '行8列3'],
          ['行9列1', '行9列2', '行9列3'],
          ['行10列1', '行10列2', '行10列3']
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
