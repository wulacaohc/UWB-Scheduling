
  <template >
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
            <el-row :style="task1" class="gutter1">
            <el-row :gutter="20"  >
              <el-col :span="4"><div class="grid-1 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/QFZ.png" class="QFZ" alt="QFZ"/>
              </div></el-col>
              <el-col :span="15"><div class="grid-2 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/RZJZ.png" class="RZJZ" alt="RZJZ"/>
              </div></el-col>
              <el-col :span="3"><div class="grid-3 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/CCQ.png" class="CCQ" alt="CCQ"/>
              </div></el-col>
              <el-col :span="2"><div class="grid-4 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/sclq.png" class="sclq" alt="sclq"/>
              </div></el-col>
            </el-row>
            <el-row :gutter="20" style="margin-top: 7vh">
              <el-col :span="8"><div class="grid2-1 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/ZSTHL.png" class="ZSTHL" alt="ZSTHL"/>
              </div></el-col>
              <el-col :span="8"><div class="grid2-2 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/SMCXJ.png" class="SMCXJ" alt="SMCXJ"/>
              </div></el-col>
              <el-col :span="1"><div class="grid2-3 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/BJJRL.png" class="BJJRL" alt="BJJRL"/>
              </div></el-col>
              <el-col :span="5"><div class="grid2-4 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage2/RZCLQ.png" class="RZCLQ" alt="RZCLQ"/>
              </div></el-col>
              <el-col :span="1"><div class="grid2-5 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/PLQ.png" class="PLQ" alt="PLQ"/>
              </div></el-col>
            </el-row>
            <el-row :gutter="20" style="margin-top: 7vh">
              <el-col :span="4"><div class="grid3-1 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/HQXX1.png" class="HQXX1" alt="HQXX1"/>
              </div></el-col>
              <el-col :span="4"><div class="grid3-2 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/HQXX2.png" class="HQXX2" alt="HQXX2"/>
              </div></el-col>
              <el-col :span="2"><div class="grid3-3 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/QXCLQ.png" class="QXCLQ" alt="QXCLQ"/>
              </div></el-col>
              <el-col :span="2"><div class="grid3-4 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/YHJJX.png" class="YHJJX" alt="YHJJX"/>
              </div></el-col>
              <el-col :span="2"><div class="grid3-5 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/YHJQX.png" class="YHJQX" alt="YHJQX"/>
              </div></el-col>
              <el-col :span="3"><div class="grid3-6 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/cpbzq.png" class="cpbzq" alt="cpbzq"/>
              </div></el-col>
              <el-col :span="2"><div class="grid3-7 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/CPCK.png" class="CPCK" alt="CPCK"/>
              </div></el-col>
              <el-col :span="4"><div class="grid3-8 bg-purple">
                <img src="../../image/TaskPageImage/TaskPageImage1/YLCK.png" class="YLCK" alt="YLCK"/>
              </div></el-col>
            </el-row>
            </el-row>

            <el-row :style="task2" class="gutter2">
              <el-row :gutter="20" >
                <el-col :span="4"><div class="grid21-1 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/RZCLQ.png" class="RZCLQ" alt="RZCLQ"/>
                </div></el-col>
              </el-row>

              <el-row :gutter="20" >
                <el-col :span="2"><div class="grid22-1 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/LZJ150.png" class="LZJ150" alt="LZJ150"/>
                </div></el-col>
                <el-col :span="2"><div class="grid22-2 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/LZJ165.png" class="LZJ165" alt="LZJ165"/>
                </div></el-col>
                <el-col :span="2"><div class="grid22-3 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/HDZJJ.png" class="HDZJJ" alt="HDZJJ"/>
                </div></el-col>
                <el-col :span="2"><div class="grid22-4 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/LZJ230.png" class="LZJ230" alt="LZJ230"/>
                </div></el-col>
                <el-col :span="8"><div class="grid22-5 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/LZJ330.png" class="LZJ330" alt="LZJ330"/>
                </div></el-col>
                <el-col :span="2"><div class="grid22-6 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/JQJ.png" class="JQJ" alt="JQJ"/>
                </div></el-col>

              </el-row>
              <el-row :gutter="20" >
                <el-col :span="4"><div class="grid23-1 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/qxx3.png" class="qxx3" alt="qxx3"/>
                </div></el-col>
                <el-col :span="6"><div class="grid23-2 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/QXX4.png" class="QXX4" alt="QXX4"/>
                </div></el-col>
                <el-col :span="4"><div class="grid23-3 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/JJX2.png" class="JJX2" alt="JJX2"/>
                </div></el-col>
                <el-col :span="4"><div class="grid23-4 bg-purple">
                  <img src="../../image/TaskPageImage/TaskPageImage2/JQX2.png" class="JQX2" alt="JQX2"/>
                </div></el-col>
              </el-row>
            </el-row>


          </el-main>

        </el-container>


      </el-container>
    </div>

</template>

<script >
import {defineComponent} from "vue";
import Aside from "@/components/Aside.vue";
import Head from "@/components/Head.vue";
import request from "@/utils/request";

export default {
  components: {Head, Aside, request},
  data() {
    return {
      dialogVisible: false,
      task1: {
        position: 'absolute',
        zIndex: 1,
      },
      task2: {
        position: 'absolute',
        zIndex: 2,
      },
    }
  },

}
</script>

<style scoped>
  .header-and-main{
    margin-top: 20px;
  }
  .bg-purple {
    background: #d3dce6;
      }
  .gutter1{
          .grid-1{
            width: 10vw;
            height: 10vh;
            .QFZ{
              width: 10vw;
              height: 10vh;
            }
          }
          .grid-2{
            width: 50vw;
            height: 10vh;
            margin-left: -2vw;
            .RZJZ{
              width: 50vw;
              height: 10vh;
            }
          }
          .grid-3{
            width: 8vw;
            height: 10vh;
            margin-left: -4vw;
            .CCQ{
              width: 8vw;
              height: 10vh;
            }
          }
          .grid-4{
            width: 8vw;
            height: 10vh;
            margin-left: -4vw;
            .sclq{
              width: 8vw;
              height: 10vh;
            }
          }

          .grid2-1{
            width: 10vw;
            height: 25vh;
              .ZSTHL{
                width: 10vw;
                height: 25vh;
              }
          }

          .grid2-2{
            width: 24vw;
            height: 10vh;
              .SMCXJ{
                width: 24vw;
                height: 10vh;
              }
          }

          .grid2-3{
            width: 5vw;
            height: 25vh;
            margin-left: -4vw;
            .BJJRL{
              width: 5vw;
              height: 25vh;
            }
          }

          .grid2-4{
            width: 15vw;
            height: 13vh;
            margin-left: 2vw;
              .RZCLQ{
                width: 15vw;
                height: 13vh;
              }
          }
          .grid2-5{
            width: 5vw;
            height: 25vh;
            margin-left: -1vw;
              .PLQ{
                width: 5vw;
                height: 25vh;
              }
          }
          .grid3-1{
            width: 12vw;
            height: 10vh;
            .HQXX1{
              width: 12vw;
              height: 10vh;
            }
          }
          .grid3-2{
            width: 12vw;
            height: 10vh;
            margin-left: -2vw;
            .HQXX2{
              width: 12vw;
              height: 10vh;
            }
          }
          .grid3-3{
            width: 7vw;
            height: 25vh;
            margin-left:-4vw;
              .QXCLQ{
                width: 7vw;
                height: 25vh;
              }
          }
          .grid3-4{
            width: 12vw;
            height: 10vh;
            margin-left:-2vw;
            .YHJJX{
                width: 12vw;
                height: 10vh;
              }
          }
          .grid3-5{
            width: 12vw;
            height: 10vh;
            margin-left:4vw;
              .YHJQX{
                width: 12vw;
                height: 10vh;
              }
          }
          .grid3-6{
            width: 8vw;
            height: 25vh;
            margin-left:9vw;
              .cpbzq{
                width: 8vw;
                height: 25vh;
              }
          }
          .grid3-7{
            width: 6vw;
            height: 25vh;
            margin-left:10vw;
              .CPCK{
                width: 6vw;
                height: 25vh;
              }
          }
          .grid3-8{
            width: 6vw;
            height: 25vh;
            margin-left:9vw;
              .YLCK{
                width: 6vw;
                height: 25vh;
              }
          }
  }
  .gutter2 {
          .grid21-1 {
            width: 10vw;
            height: 15vh;
            margin-top: 10vh;
            margin-left: 13svw;
            .RZCLQ {
              width: 10vw;
              height: 15vh;
            }
          }
          .grid22-1{
            width: 8vw;
            height: 9vh;
            margin-top: 8vh;
            margin-left: 13vw;
              .LZJ150{
                width: 8vw;
                height: 9vh;
              }

          }
          .grid22-2{
            width: 8vw;
            height: 9vh;
            margin-top: 8vh;
            margin-left: 14vw;
            .LZJ165{
              width: 8vw;
              height: 9vh;
            }
          }
          .grid22-3{
            width: 8vw;
            height: 9vh;
            margin-top: 8vh;
            margin-left: 15vw;
              .HDZJJ{
                width: 8vw;
                height: 9vh;
              }

          }
          .grid22-4{
            width: 8vw;
            height: 9vh;
            margin-top: 8vh;
            margin-left: 16vw;
              .LZJ230{
                width: 8vw;
                height: 9vh;
              }
          }
          .grid22-5{
            width: 8vw;
            height: 9vh;
            margin-top: 8vh;
            margin-left: 17vw;
              .LZJ330{
                width: 8vw;
                height: 9vh;
              }
          }
          .grid22-6{
            width:15vw;
            height: 9vh;
            margin-top: 8vh;
            margin-left: 11vh;
              .JQJ{
                width:15vw;
                height: 9vh;
              }
          }
          .grid23-1{
            width:12vw;
            height: 10vh;
            margin-top: 22vh;
            
              .qxx3{
                width:12vw;
                height: 10vh;
              }
          }
          .grid23-2{
            width:12vw;
            height: 10vh;
            margin-top: 22vh;
            margin-left:-4vh;
              .QXX4{
                width:12vw;
                height: 10vh;
              }
          }
          .grid23-3{
            width:12vw;
            height: 10vh;
            margin-top: 22vh;
            margin-left: -4vh;
              .JJX2{
                width:12vw;
                height: 10vh;
              }
          }
          .grid23-4{
            width:12vw;
            height: 10vh;
            margin-top: 22vh;
            margin-left: -7vh;
                .JQX2{
                  width:12vw;
                  height: 10vh;
                }
          }
  }
</style>
