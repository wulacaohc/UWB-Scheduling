<template>
  <div>
    <el-container style="height:100vh;width:100vw;border:1px ;solid:#eee">
      <el-aside width="200px" style="background-color: #363636">
        <Aside/>
      </el-aside>
      <el-container class="header-and-main">
        <el-header style="height:80px">
          <Head/>
        </el-header>
        <el-main  class="main" style="margin-top: 4vh">
          <div >
            <!--搜索框-->
            <div style="margin-bottom: 2vh;margin-top:30px;">
              <el-input style="width:260px;" placeholder="输入报警号查询" v-model="params.warningid"></el-input>
              <el-input style="width:260px;" placeholder="输入报警类型查询" v-model="params.warningtype"></el-input>
              <el-button style="margin-left:5px;background-color: #4F4F4F;color: white" @click="load"><i class="el-icon-search"></i>搜索</el-button>
              <el-button title="" style="margin-left:5px;background-color: #4F4F4F;color: white;" @click="reset" ><i class="el-icon-refresh" ></i>  重置</el-button>
            </div>
            <!--表格-->
            <el-card>
              <el-table :data="tableData">
                <el-table-column prop="warningid" label="报警ID"></el-table-column>
                <el-table-column prop="warningtime" label="报警时间"></el-table-column>
                <el-table-column prop="warningtype" label="报警类型"></el-table-column>
                <el-table-column prop="warninglevel" label="报警等级"></el-table-column>
                <el-table-column prop="labelid" label="标签ID"></el-table-column>
              </el-table>
              <!--分页-->
              <div style="padding:30px;text-align:center;">
                <el-pagination
                  :current-page="params.pageNum"
                  :page-size="params.pageSize"
                  background
                  @current-change="handleCurrentChange"
                  layout="prev, pager, next"
                  :total="total">
                </el-pagination>
              </div>
            </el-card>
            <el-row :gutter="20">
              <el-col :span="12">
                <el-card style="height: 300px; margin: 10px; padding: 10px;">
                  <div  style="width:100%;height: 279px " id="pie"></div>
                </el-card>
              </el-col>
              <el-col :span="12">
                <el-card style="height: 300px; margin: 10px; padding: 10px;">
                  <div  style="width:100%;height:260px " id="line"></div>
                </el-card>
              </el-col>
            </el-row>
          </div>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
// 引入公共组件顶部和侧边栏
import Head from "@/components/Head.vue";
import Aside from "@/components/Aside.vue";
import request from "@/utils/request";
import * as echarts from 'echarts';

const option1={
  title:{
    text:"类型统计图"
  },
  tooltip: {
    trigger: 'item'
  },
  legend: {
    top: '5%',
    left: 'center'
  },
  series: [
    {
      name: 'Access From',
      type: 'pie',
      radius: ['40%', '70%'],
      avoidLabelOverlap: false,
      itemStyle: {
        borderRadius: 10,
        borderColor: '#fff',
        borderWidth: 2
      },
      label: {
        show: false,
        position: 'center'
      },
      emphasis: {
        label: {
          show: true,
          fontSize: 40,
          fontWeight: 'bold'
        }
      },
      labelLine: {
        show: false
      },
      data: [
        { value: 1048, name: '物料堆积' },
        { value: 735, name: '危险区域' },
        { value: 580, name: '设备故障' },
        { value: 484, name: '车辆相撞' },
      ]
    }
  ]
};

const option2 = {
  title:{
    text:"报警等级统计图"
  },
  dataset: {
    source: [
      ['score','product'],
      [20, '一级报警'],
      [30, '二级报警'],
      [35, '三级报警'],
      [70, '四级报警'],

    ]
  },
  grid: { containLabel: true },
  xAxis: { name: 'score' },
  yAxis: { type: 'category' },
  visualMap: {
    orient: 'horizontal',
    left: 'center',
    min: 10,
    max: 100,
    text: ['High Score', 'Low Score'],
    dimension: 0,
    inRange: {
      color: ['#65B581', '#FFCE34', '#FD665F']
    }
  },
  series: [
    {
      type: 'bar',
      encode: {
        // Map the "amount" column to X axis.
        x: 'amount',
        // Map the "product" column to Y axis
        y: 'product'
      }
    }
  ]
};
export default {
  components: {
    Head,
    Aside,
    request
  },
  mounted() {
    let pieDom = document.getElementById('pie'); // 使用 getElementById 并传递 id 值
    let pieChart = echarts.init(pieDom);
    pieChart.setOption(option1);

    let lineDom = document.getElementById('line'); // 使用 getElementById 并传递 id 值
    let lineChart = echarts.init(lineDom);
    lineChart.setOption(option2);
  },
  data () {
    return {
      dialogVisible: false,
      tableData: [],
      total: 0,
      params: {
        pageNum: 1,
        pageSize: 5,//向后台发送数据
        warningid: "",
        warningtype: ""
      },
    }
  },

  methods: {
    reset() {
      this.params = {
        pageNum: 1,
        pageSize: 8,//向后台发送数据
        warningid: "",
        warningtype: ""
      };
      this.load();
    },
    handleCurrentChange(pageNum) {
      //点击分页按钮触发分页
      this.params.pageNum = pageNum;
      this.load()
    },

    load() {   //查询数据的方法，fetch是查询后台数据的api，获取并格式转换，出现跨域错误
      request.get('/security/Page', {
        params: this.params
      }).then(res => {
        this.tableData = res.data.list
        this.total = res.data.total
      })
    },
  },
  created() {
    this.load()//方法调用
  },
}
</script>

<style>
.header-and-main {
  flex-direction: column;
}

.main {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: space-between;
  height: 100%;
}

</style>
