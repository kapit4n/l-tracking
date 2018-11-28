<template>
  <div>
    <table>
      <tr>
        <th>Start Time</th>
        <th>End Time</th>
      </tr>
      <tr v-for="ti in times" v-bind:key="ti.key">
        <td>{{ti.startHour}}: {{ti.startMin}}</td>
        <td>{{ti.endHour}}: {{ti.endMin}}</td>
        <td>
          <button v-on:click="remove(ti)">x</button>
        </td>
      </tr>

      <tr>
        <td colspan="2">Total: {{totalHour}} : {{totalMin}}</td>
        <td>
          <button v-on:click="calc()">calc</button>
        </td>
      </tr>
    </table>
    <div class="hello"></div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "TimeTrackerView",
  props: {
    msg: String
  },
  data() {
    return {
      times: [
        {
          key: 1,
          startHour: 9,
          startMin: 2,
          endHour: 12,
          endMin: 20
        },
        {
          key: 2,
          startHour: 12,
          startMin: 50,
          endHour: 17,
          endMin: 50
        }
      ],
      totalMin: 0,
      totalHour: 0
    };
  },
  methods: {
    remove: function(ti) {
      this.$data.times = this.$data.times.filter(x => x.key != ti.key);
      this.calc();
    },
    calc: function() {
      let times = this.$data.times;
      let resTime = 0;
      for (let i = 0; i < times.length; i++) {
        let startTime = new Date( 2018, 10, 18, times[i].startHour, times[i].startMin, 0, 0 );
        let endTime = new Date( 2018, 10, 18, times[i].endHour, times[i].endMin, 0, 0 );
        resTime += endTime.getTime() - startTime.getTime();
      }
      let hours = Math.trunc(resTime / 1000 / 60 / 60);
      let mins = (resTime / 1000 / 60) % 60;
      this.$data.totalHour = hours;
      this.$data.totalMin = mins;
    }
  },
  mounted() {
    this.calc();
    const jsonxx = require("../assets/times.json")
    axios
      .get(jsonxx)
      .then(response => (this.info = response));
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
