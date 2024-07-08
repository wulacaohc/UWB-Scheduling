<template>
  <div class="box">
    <div class="box__header">车间物料概况</div>
  <div class="column">
  <dv-conical-column-chart :config="config" style="width:90%;height:200px;" />
  </div>
  </div>
</template>

<script>
export default {
  data(){
    return {
      config: {
        data: [
          {
            name: '铜矿',
            value: 55
          },
          {
            name: '铜箔',
            value: 120
          },
          {
            name: '电解铜',
            value: 71
          },
          {
            name: '氧化铁',
            value: 66
          },
          {
            name: '铜板',
            value: 80
          },
          {
            name: '铜卷',
            value: 35
          },
        ],
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
