<template>
  <div>
    <table>
      <tr>
        <th>
          Start date
        </th>
        <th>
          End date
        </th>
      </tr>
      <tr v-for="ti in times" v-bind:key="ti.key">
        <td>
        {{ti.startHour}}
        </td>
        <td>
        16:23
        </td>
      </tr>
      <tr>
        <td colspan="2">
          Total: 6:21:0
        </td>
      </tr>      
    </table>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
  </div>
</template>

<script>
export default {
  name: 'TimeTracker',
  props: {
    msg: String,
    times: Array
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
