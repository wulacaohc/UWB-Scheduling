<template>
  <div class="box">
    <div class="box__header">车间员工概况</div>
    <dv-active-ring-chart :config="config" style="width:300px;height:300px" />
  </div>
</template>

<script>
export default {
    data() {
      return {
        config: {
          data: [
            {
              name: '仓库管理员',
              value: 55
            },
            {
              name: '熔铸工',
              value: 120
            },
            {
              name: '轧制工',
              value: 78
            },
            {
              name: '精整工',
              value: 66
            },
            {
              name: '运输员',
              value: 80
            }
          ]
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
