<template>
  <div>
    <el-container style="height:100vh;width:100vw;border:1px ;solid:#eee">
      <el-aside width="200px" style="background-color: #eee">
        <Aside/>
      </el-aside>
      <el-container class="header-and-main">
        <el-header>
          <Head/>
        </el-header>
        <el-main  class="main" style="margin-top: 4vh">
          <div >
            <!--搜索框-->
            <div style="margin-bottom: 40px;margin-top:30px;">
              <el-input style="width:260px;" placeholder="输入报警号查询" v-model="params.warningid"></el-input>
              <el-input style="width:260px;" placeholder="输入报警类型查询" v-model="params.warningtype"></el-input>
              <el-button style="margin-left:5px;background-color: #4F4F4F;color: white" @click="load"><i class="el-icon-search"></i>搜索</el-button>
              <el-button title="" style="margin-left:5px;background-color: #4F4F4F;color: white;" @click="reset" ><i class="el-icon-refresh" ></i>  重置</el-button>
            </div>
            <!--表格-->
            <el-card>
              <el-table :data="tableData" :row-class-name="tableRowClassName">
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
export default {
  components: {
    Head,
    Aside,
    request
  },
  data () {
    return {
      dialogVisible: false,
      tableData: [],
      total: 0,
      params: {
        pageNum: 1,
        pageSize: 8,//向后台发送数据
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
