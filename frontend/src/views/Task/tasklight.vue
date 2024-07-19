<template>
  <div>
    <canvas id="glowAreasCanvas" width="1600px" height="700px" class="lightbox"></canvas>
  </div>
</template>

<script>
import Head from "@/components/Head.vue";
import Aside from "@/components/Aside.vue";
import request from "@/utils/request";
export default {
  components: {Head, Aside, request},
  data() {
    return {
      areas: [
        {
          id: 'A',
          x: 220,
          y: 33,
          width: 920,
          height: 95,
          glowStrength: 10,
          isLit: false
        },
        {
          id: 'B',
          x: 550,
          y: 150,
          width: 440,
          height: 105,
          glowStrength: 8,
          isLit: false
        },
        {
          id: 'C',
          x: 845,
          y: 310,
          width: 140,
          height: 100,
          glowStrength: 9,
          isLit: false
        },
        {
          id: 'C2',
          x: 695,
          y: 310,
          width: 132,
          height: 96,
          glowStrength: 9,
          isLit: false
        },
        {
          id: 'C3',
          x: 540,
          y: 310,
          width: 137,
          height: 96,
          glowStrength: 9,
          isLit: false
        },
        {
          id: 'C4',
          x: 390,
          y: 310,
          width: 134,
          height: 100,
          glowStrength: 9,
          isLit: false
        },
        {
          id: 'C5',
          x: 228,
          y: 310,
          width: 135,
          height: 98,
          glowStrength: 9,
          isLit: false
        },

        {
          id: 'D',
          x: 25,
          y: 170,
          width: 155,
          height: 240,
          glowStrength: 12,
          isLit: false
        },
        {
          id: 'E',
          x: 29,
          y: 453,
          width: 180,
          height: 97,
          glowStrength: 7,
          isLit: false
        },
        {
          id: 'E2',
          x: 233,
          y: 453,
          width: 187,
          height: 97,
          glowStrength: 7,
          isLit: false
        },
        {
          id: 'E3',
          x: 29,
          y: 577,
          width: 180,
          height: 97,
          glowStrength: 7,
          isLit: false
        },
        {
          id: 'E4',
          x: 233,
          y: 577,
          width: 187,
          height: 97,
          glowStrength: 7,
          isLit: false
        },
        {
          id: 'F',
          x: 575,
          y: 453,
          width: 187,
          height: 97,
          glowStrength: 7,
          isLit: false
        },
        {
          id: 'F2',
          x: 575,
          y: 577,
          width: 185,
          height: 97,
          glowStrength: 7,
          isLit: false
        },
        {
          id: 'F3',
          x: 801,
          y: 453,
          width: 187,
          height: 97,
          glowStrength: 7,
          isLit: false
        },
        {
          id: 'F4',
          x: 801,
          y: 577,
          width: 185,
          height: 97,
          glowStrength: 7,
          isLit: false
        },

      ],
      dataFromBackend: '',
      loading: false  // 新增一个标识，用于表示是否正在加载数据
    };
  },
  mounted() {
    this.fetchData();
  },
  methods: {
    fetchData() {
      this.loading = true;  // 开始加载时设置为 true
      fetch('http://localhost:9090/scheduler/task')
        .then(response => response.json())
        .then(data => {
          if (data.code ==='success' && data.hasOwnProperty('data')) {
            this.dataFromBackend = data.data;
          } else {
            console.error('后端返回的数据不符合预期格式');
          }
          console.log(this.dataFromBackend);
          this.loading = false;  // 加载完成设置为 false
          this.updateAreasFromBackend();
        })
        .catch(error => {
          console.error('获取数据时出错：', error);
          this.loading = false;  // 出错时也设置为 false
        });

    },
    drawGlowAreas() {
      const canvas = document.getElementById('glowAreasCanvas');
      const ctx = canvas.getContext('2d');

      ctx.clearRect(0, 0, canvas.width, canvas.height);

      this.areas.forEach(area => {
        if (area.isLit) {
          this.drawSingleGlowArea(ctx, area.x, area.y, area.width, area.height, area.glowStrength);
          this.drawBorder(ctx, area.x, area.y, area.width, area.height);
        }
      });
    },
    drawSingleGlowArea(ctx, x, y, width, height, glowStrength) {
      // 绘制发光效果
      for (let i = 0; i < glowStrength; i++) {
        ctx.fillStyle = `rgba(255, 255, 0, ${0.1 * (glowStrength - i)})`;
        ctx.fillRect(x - i, y - i, width + 2 * i, height + 2 * i);
      }
      // 绘制矩形
      ctx.fillStyle = 'rgba(0, 0, 0, 0)';
      ctx.fillRect(x, y, width, height);
    },
    drawBorder(ctx, x, y, width, height) {
      ctx.strokeStyle = 'rgba(0,0,0,0)';
      ctx.lineWidth = 2;
      ctx.strokeRect(x, y, width, height);
    },
    updateAreasFromBackend() {
      const selectedAreaId = this.dataFromBackend;
      this.areas.forEach(area => {
        area.isLit = area.id === selectedAreaId;
      });
      this.drawGlowAreas();
    },
  },
  watch: {
    dataFromBackend: 'updateAreasFromBackend'
  }
};
</script>

<style scoped>
.lightbox{
  background: rgb(0,0,0,0);
}
</style>
