<template xmlns:el-col="http://www.w3.org/1999/xhtml" xmlns="http://www.w3.org/1999/html">
  <div>
    <el-container style="height:100vh;width:100vw;border:1px ;solid:#eee">
      <el-aside width="200px" style="background-color: #363636">
        <Aside/>
      </el-aside>
      <el-container class="header-and-main">
        <el-header>
          <Head/>
        </el-header>

        <el-main  class="main" style="margin-top: 2vh">
          <div style="border-bottom:1px solid gray;width:80vw;height:36vh;padding-left:15px;padding-right:5px;">
            <el-col :span="6" class="btn">
              <el-button round  style="width: 15vw;height:32vh ">
                <h1 style="font-size:50px">8</h1>
                <i class="el-icon-s-claim">待完成</i>
                <br>
                <div>
                  <br><br>
                  <i class="el-icon-user-solid">  </i>
                  <p >巡检</p>
                </div>
              </el-button>
            </el-col>
            <el-col :span="6" class="btn">
              <el-button round  style="width: 15vw;height:32vh ">
                <h1 style="font-size:50px">4</h1>
                <i class="el-icon-s-claim">待完成</i>
                <br>
                <div>
                  <br><br>
                  <i class="el-icon-orange">  </i>
                  <p >装车</p>
                </div>
              </el-button>
            </el-col>
            <el-col :span="6" class="btn">
              <el-button round  style="width: 15vw;height:32vh ">
                <h1 style="font-size:50px">10</h1>
                <i class="el-icon-s-claim">待完成</i>
                <br>
                <div>
                  <br><br>
                  <i class="el-icon-loading">  </i>
                  <p >熔炼</p>
                </div>
              </el-button>
            </el-col>
            <el-col :span="4" class="btn">
              <el-button round  style="width: 15vw;height:32vh ">
                <h1 style="font-size:50px">10</h1>
                <i class="el-icon-s-claim">待完成</i>
                <br>
                <div>
                  <br><br>
                  <i class="el-icon-magic-stick">  </i>
                  <p >拉条</p>
                </div>
              </el-button>
            </el-col>
          </div>
          <div style="margin:3vh">
            <el-card>
                <el-row :gutter="12">
                <el-col :span="5" style="font-weight: bold;font-size:26px;color:#4F4F4F;margin:3vh">任务情况</el-col>
                <el-col :span="7">

                  <el-card>
                    <div style="font-weight: bold;font-size:26px;color:#4F4F4F;margin:3vh">
                    任务情况：{{ taskname }}
                    </div>
                  </el-card>

                </el-col>
                <el-col :span="7">
                  <el-button @click="handleshow()">任务调度</el-button>
                </el-col>

                </el-row>
              <el-table :data="tableData" stripe>
                <el-table-column prop="name" label="任务名称"></el-table-column>
                <el-table-column prop="formattedArrivalTime" label="任务等待时间"></el-table-column>
                <el-table-column prop="labelCount" label="物料数量"></el-table-column>
                <el-table-column prop="priority" label="任务优先级" sortable default></el-table-column>
                <el-table-column prop="runTime" label="任务时间"></el-table-column>
              </el-table>
              <div style="padding:1vh;text-align:center;">
                <el-pagination
                  :page-size="10"
                  background
                  layout="prev, pager, next"
                  :total="tableData.length">
                </el-pagination>
              </div>
            </el-card>
          </div>


        </el-main>

      </el-container>
    </el-container>
  </div>
</template>
/<script>

import {defineComponent} from "vue";
import Aside from "@/components/Aside.vue";
import Head from "@/components/Head.vue";
import request from "@/utils/request";

export default {
  components: {Head, Aside, request},

  data(){
    return{
      dialogVisible:false,
      tableData:[],
      taskname:null,
    }
  },


  methods: {
    handleshow(){
      this.scheduleTask();
      this.load();
    },
    scheduleTask(){
      request.get('/scheduler/task').then(res=>{
        this.taskname=res.data
      })
    },
    load(){   //查询数据的方法，fetch是查询后台数据的api，获取并格式转换，出现跨域错误
      request.get('/scheduler/task-priorities', {
        params: this.params
      }).then(res => {
        this.tableData = res.data;
        // 排序
        this.tableData.sort((a, b) => b.priority - a.priority);
        // 重新编号
        this.tableData.forEach((task, index) => {
          task.priority = index + 1;
        });
      });
    },

  },
  created(){
    this.load()//方法调用
  },

}

</script>

<style>

.btn{
  padding-top:2vh;
  margin-bottom: 4vh;
  padding-left:3vh;
}

</style>
