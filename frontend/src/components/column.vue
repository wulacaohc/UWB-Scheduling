<template>
  <div class="column">
  <dv-conical-column-chart :config="config" style="width:90%;height:200px;" />
  </div>
</template>

<script>
export default {
  data(){
    return {
      config: {
        data: [
          {
            name: '周口',
            value: 55
          },
          {
            name: '南阳',
            value: 120
          },
          {
            name: '西峡',
            value: 71
          },
          {
            name: '驻马店',
            value: 66
          },
          {
            name: '新乡',
            value: 80
          },
          {
            name: '信阳',
            value: 35
          },
          {
            name: '漯河',
            value: 15
          }
        ],
      }
    }
  }
}

</script>

<style>
.column{
  padding:10px;

}

</style>
