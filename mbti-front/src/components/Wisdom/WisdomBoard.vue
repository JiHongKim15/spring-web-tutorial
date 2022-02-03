<template>
  <div class="wisdomBoard">
    <wisdomHeader></wisdomHeader>
    This is {{ $route.params.id }} page;
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import wisdomHeader from "./WisdomHeader.vue";

@Component({
  components: {
    wisdomHeader,
  },
})
export default class WisdomBoard extends Vue {}
</script>
