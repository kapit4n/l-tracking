<template>
  <div>
    <table>
      <tr>
        <th>
          Start Time
        </th>
        <th>
          End Time
        </th>
      </tr>
      <tr v-for="ti in times" v-bind:key="ti.key">
        <td>
        {{ti.startHour}}: {{ti.startMin}}
        </td>
        <td>
          {{ti.endHour}}: {{ti.endMin}}
        </td>
        <td>
          <button v-on:click="remove(ti)">x</button>
        </td>
      </tr>
      <tr>
        <td>
          <input type="number" v-model="startHour" placeholder="Start Hour">:
          <input type="number" v-model="startMin" placeholder="Start Minute">
        </td>
        <td>
          <input type="number" v-model="endHour" placeholder="End Hour">
          <input type="number" v-model="endMin" placeholder="End Minute">
        </td>
        <td>
          <button v-on:click="add()">add</button>
          <button v-on:click="save()">save</button>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          Total: {{totalHour}} : {{totalMin}}
        </td>
      </tr>      
    </table>
  <div class="hello">
    
  </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: "TimeTracker",
  props: {
    msg: String
  },
  data() {
    return {
      times: [
      ],
      totalHour: 0,
      totalMin: 0,
      lastKey: 0,
      startHour: 9,
      startMin: 20,
      endHour: new Date().getHours(),
      endMin: new Date().getMinutes(),
      info: null
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
      this.$data.startHour = this.$data.endHour;
      this.$data.startMin = this.$data.endMin;
      
      this.$data.endHour = new Date().getHours();
      this.$data.endMin = new Date().getMinutes();

      this.calc();
    },
    save: function() {
      console.log("Save it");
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
    },
    remove: function(ti) {
      this.$data.times = this.$data.times.filter(x => x.key != ti.key);
      this.calc();
    }
  },
  mounted () {
    axios
      .get('https://api.coindesk.com/v1/bpi/currentprice.json')
      .then(response => (this.info = response))
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
