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
    <input type="number" v-model="startHour" placeholder="Start Hour">
    <input type="number" v-model="startMin" placeholder="Start Minute">
    <input type="number" v-model="endHour" placeholder="End Hour">
    <input type="number" v-model="endMin" placeholder="End Minute">
    <button v-on:click="add()">add</button>
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
      2
      9, 34
      12, 15
      */
      times: [
      ],
      totalHour: 0,
      totalMin: 0,
      lastKey: 0,
      startHour: 9,
      startMin: 30,
      endHour: 12,
      endMin: 30
    };
  },
  methods: {
    add: function() {
      this.lastKey += 1;
      this.$data.times.push({
        key: this.lastKey,
        startHour: this.$data.startHour,
        startMin: this.$data.startMin,
        endHour: this.$data.endHour,
        endMin: this.$data.endMin
      });
      this.calc();
    },
    calc: function() {
      let times = this.$data.times;
      let resTime = 0;
      for (let i = 0; i < times.length; i++) {
        console.log(times[i]);
        let startTime = new Date( 2018, 10, 18, times[i].startHour, times[i].startMin, 0, 0 );
        let endTime = new Date( 2018, 10, 18, times[i].endHour, times[i].endMin, 0, 0 );
        resTime += endTime.getTime() - startTime.getTime();
      }
      let hours = Math.trunc(resTime / 1000 / 60 / 60);
      let mins = (resTime / 1000 / 60) % 60;
      this.$data.totalHour = hours;
      this.$data.totalMin = mins;
    }
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
