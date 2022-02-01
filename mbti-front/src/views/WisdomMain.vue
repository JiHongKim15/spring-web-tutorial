<template>
  <div class="wisdomMain">
    <wisdomHeader></wisdomHeader>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import wisdomHeader from "../components/Wisdom/WisdomHeader.vue";

@Component({
  components: {
    wisdomHeader,
  },
})
export default class WisdomMain extends Vue {}
</script>
