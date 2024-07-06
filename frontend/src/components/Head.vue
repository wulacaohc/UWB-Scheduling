<template>
<div class="header" style="border-bottom: 1px solid lightgrey;height:100px">
  <div class="right">
    <div class="user" style="padding-right:1vw">
       <el-dropdown style="margin-top:1vh;">
          <span class="el-dropdown-link">
             <img src="../image/user.png" alt="" style="height: 60px;border-radius:50%;">
          </span>
       <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>用户名</el-dropdown-item>
          <el-dropdown-item>用户职位</el-dropdown-item>
          <el-dropdown-item>用户工号</el-dropdown-item>
          <el-dropdown-item divided>用户角色</el-dropdown-item>
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
