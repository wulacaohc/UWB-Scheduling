<template>
<div class="header" style="border-bottom: 1px solid lightgrey;height:60px">
  <div class="right" style="margin-top:2vh;">
    <div class="user" style="padding-right:1vw">
       <el-dropdown style="margin-top:1vh;">
          <span class="el-dropdown-link">
             <img src="../image/user.png" alt="" style="height:6vh;border-radius:50%;">
          </span>
       <el-dropdown-menu slot="dropdown">
         <el-dropdown-item>
           <span>{{ userinfo.username }}</span>
         </el-dropdown-item>
         <el-dropdown-item>
           <span>{{ userinfo.userrole}}</span>
         </el-dropdown-item>
         <el-dropdown-item divided>
           <span @click="logout">退出登录</span>
         </el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
    <div class="info" style="margin-left:4vw;">
      <i class="el-icon-setting" style="font-size: 30px;color:gray"></i>
      <i class="el-icon-bell" style="font-size: 30px;margin-left: 2vw;color:gray"></i>
    </div>
  </div>
</div>
</template>

<script>
import { mapState, mapMutations } from "vuex";

export default {
  computed: {
    ...mapState('user', ['userinfo']),
  },
  methods: {
    ...mapMutations('user', ['setUser']),

    logout() {
      localStorage.removeItem("user");
      this.setUser({
        username: '',
        isLogin: false,
        token: '',
      });
      this.$router.push('/login');
    },
  },
  created() {
    console.log(this.userinfo)
    const user = JSON.parse(localStorage.getItem("user"));
    if (user) {
      this.setUser(user);
    }
  },
}
</script>

<style  scoped>
.header{
  display: flex;
  height:100px;
  .right{
    display: flex;
    align-items: center;
    position: absolute;
    right: 80px;
  }
}

</style>
