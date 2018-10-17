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
        {{ti.startHour}}: {{ti.startMin}}
        </td>
        <td>
          {{ti.endHour}}: {{ti.endMin}}
        </td>
      </tr>
      <tr>
        <td colspan="2">
          Total: {{totalHour}} : {{totalMin}}
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
  name: "TimeTracker",
  props: {
    msg: String
  },
  data() {
    return {
      /*
      9, 45
      12, 15
      12, 30
      18, 0
      */
      times: [
        {
          key: 1,
          startHour: 9,
          startMin: 45,
          endHour: 12,
          endMin: 15
        },
        {
          key: 2,
          startHour: 12,
          startMin: 30,
          endHour: 18,
          endMin: 0
        }
      ],
      totalHour: 8,
      totalMin: 0
    };
  }
};
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
