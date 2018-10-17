<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Time Tracker" v-bind:times="times"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'app',
  components: {
    HelloWorld
  },
  props: {
    times: [
      {
        key: 1,
        startHour: 9,
        startMin: 42,
        endHour: 12,
        endMin: 40
      },
      {
        key: 1,
        startHour: 13,
        startMin: 0,
        endHour: 16,
        endMin: 30
      },
      {
        key: 1,
        startHour: 13,
        startMin: 0,
        endHour: 16,
        endMin: 30
      }
    ]
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
