<template>
  <div class="box">
    <div class="box__header">车间员工概况</div>
    <div style="height:300px" id="pie"></div>
  </div>
</template>

<script>
import * as echarts from 'echarts';

const option = {
  // backgroundColor: '#2c343c',
  title: {
    text: '车间设备概况',
    left: 'center',
    top: 20,
    textStyle: {
      color: '#ccc'
    }
  },
  tooltip: {
    trigger: 'item'
  },
  visualMap: {
    show: false,
    min: 80,
    max: 600,
    inRange: {
      colorLightness: [0, 1]
    }
  },
  series: [
    {
      name: 'Access From',
      type: 'pie',
      radius: '55%',
      center: ['50%', '50%'],
      data: [
        { value: 335, name: '热轧机组' },
        { value: 310, name: '退火炉' },
        { value: 274, name: '冷轧机' },
        { value: 235, name: '铳洗机组'},
        { value: 400, name: '镕铸炉' }
      ].sort(function (a, b) {
        return a.value - b.value;
      }),
      roseType: 'radius',
      label: {
        color: 'rgba(255, 255, 255, 0.3)'
      },
      labelLine: {
        lineStyle: {
          color: 'rgba(255, 255, 255, 0.3)'
        },
        smooth: 0.2,
        length: 10,
        length2: 20
      },
      itemStyle: {
        color: '#c23531',
        shadowBlur: 200,
        shadowColor: 'rgba(0, 0, 0, 0.5)'
      },
      animationType: 'scale',
      animationEasing: 'elasticOut',
      animationDelay: function (idx) {
        return Math.random() * 200;
      }
    }
  ]
};
export default {
  mounted() {
    //饼状图
    let pieDom1 = document.getElementById('pie'); // 使用 getElementById 并传递 id 值
    let pieChart1 = echarts.init(pieDom1);
    pieChart1.setOption(option);
  },
}
</script>

<style>
.box{
  padding:10px;
  height:90%;
  .box__header{
    margin-bottom:20px;
    font-size:20px;
    color:white;
  }
}

</style>
