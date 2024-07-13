<template>
      <div ref="container" class="map-container"></div>
</template>

<script>
import * as THREE from 'three';
import {GLTFLoader} from 'three/examples/jsm/loaders/GLTFLoader.js';
import {OrbitControls} from 'three/examples/jsm/controls/OrbitControls.js';

export default {
  name:'MapView',
  props: ['width', 'height'],
  data() {
    return {
      scene: null,
      camera: null,
      renderer: null,
      ambientLight: null,
      controls: null
    };
  },
  mounted() {
    this.initScene();
    this.loadModel();
    window.addEventListener('resize', this.onWindowResize);
  },
  methods: {
    initScene() {
      this.scene = new THREE.Scene();
      // // 设置场景的背景颜色为蓝色
      this.scene.background = new THREE.Color(0x2c3e6c); // 使用十六进制颜色表示(蓝色为0x6495ED)


      this.camera = new THREE.PerspectiveCamera(100, window.innerWidth / window.innerHeight, 20, 1000);
      this.camera.position.set(0,50,25);
      this.camera.lookAt(0, 0, 0);

      this.renderer = new THREE.WebGLRenderer({antialias: true,alpha:true});
      this.renderer.setSize(window.innerWidth, window.innerHeight);
      this.$refs.container.appendChild(this.renderer.domElement);

      const axesHelper = new THREE.AxesHelper(5);
      this.scene.add(axesHelper);

      this.controls = new OrbitControls(this.camera, this.renderer.domElement);
      this.controls.enableDamping = true;
      this.controls.dampingFactor = 0.09;

      this.ambientLight = new THREE.AmbientLight(0xffffff, 0.5);
      this.scene.add(this.ambientLight);

      const directionalLight = new THREE.DirectionalLight(0xffffff, 1);
      directionalLight.position.set(0, 40);
      this.scene.add(directionalLight);

      this.animate();

      // 将渲染器添加到容器
      this.$refs.container.appendChild(this.renderer.domElement);
    },
    loadModel() {
      const gltfLoader = new GLTFLoader();
      const scene = this.scene; // 将this.scene存储在局部变量以供内部函数访问

      gltfLoader.load("/module/map1.glb", (gltf1) => {
        const baseModel = gltf1.scene;
        baseModel.scale.set(0.5, 0.5, 0.5);
        baseModel.position.set(-90, 0, -40);
        scene.add(baseModel);
        // 逆时针旋转90°
        gltf1.scene.rotation.y = Math.PI / 2; // 绕Y轴旋转

        gltfLoader.load("/module/car2.glb", (gltf2) => {
          const movingModel = gltf2.scene;
          movingModel.scale.set(0.5, 0.5, 0.5);
          movingModel.position.set(-190, 0, -70);
          scene.add(movingModel);
          // 逆时针旋转90°
          gltf2.scene.rotation.y = Math.PI / 2; // 绕Y轴旋转
          const points = [
            new THREE.Vector3(-120, 0, -140),
            new THREE.Vector3(-120, 0, -5),
            new THREE.Vector3(-320, 0, -5),
            new THREE.Vector3(-320, 0, -140),
            new THREE.Vector3(-120, 0, -140),
            new THREE.Vector3(-120, 0, -5),
            new THREE.Vector3(-70, 0, -5),
            new THREE.Vector3(10, 0, -5),
            new THREE.Vector3(10, 0, -140),
            new THREE.Vector3(-320, 0, -140),
            new THREE.Vector3(-320, 0, -5),
            new THREE.Vector3(-120, 0, -5),
          ];

          let currentIndex = 0;

          function animateModel() {
            requestAnimationFrame(animateModel);

            if (movingModel.position.distanceTo(points[currentIndex]) < 0.1) {
              currentIndex = (currentIndex + 1) % points.length;
            }

            const targetPosition = points[currentIndex];
            const direction = targetPosition.clone().sub(movingModel.position).normalize();
            const distance = movingModel.position.distanceTo(targetPosition);
            const speed = 50; // 调整速度以适应移动效果
            const step = speed * 0.1; // 调整步长以适应不同的移动速度

            // 让模型朝向目标位置
            movingModel.lookAt(targetPosition);
            // 逆时针旋转90度
            movingModel.rotateY(Math.PI / 2);

            if (distance > step) {
              movingModel.position.addScaledVector(direction, step);
            } else {
              movingModel.position.copy(targetPosition);
            }
          }
          console.log('Three.js版本：',THREE.REVISION);
          animateModel();
        });
      });
    },
    adjustSize(newWidth, newHeight) {
      // 调整渲染器尺寸
      this.renderer.setSize(newWidth, newHeight);
      this.camera.aspect = newWidth / newHeight;
      this.camera.updateProjectionMatrix();
    },
    onWindowResize() {
      this.adjustSize(this.$refs.container.offsetWidth, this.$refs.container.offsetHeight);
    },
    animate() {
      requestAnimationFrame(this.animate);
      this.controls.update();
      this.renderer.render(this.scene, this.camera);
    }
  },
  beforeDestroy() {
    window.removeEventListener('resize', this.onWindowResize);
    // 清理Three.js资源
    this.scene.dispose();
    this.renderer.dispose();
  }
};
</script>

<style scoped>
.map-container {
  width:95%;
  height: 95%;
  overflow: hidden;
  display: flex;
  }
</style>
