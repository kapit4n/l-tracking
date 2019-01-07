<template>
  <div id="app">
    <nav>
  <a href="/">Calculate</a> |
  <a href="/#/view">View</a>
</nav>

    <img alt="Vue logo" src="./assets/logo.png">
    
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: 'app'
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
