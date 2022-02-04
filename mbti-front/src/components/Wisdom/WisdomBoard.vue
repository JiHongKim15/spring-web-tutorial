<template>
  <div class="wisdomBoard">
    <wisdomHeader></wisdomHeader>
    This is {{ board.boardName }} page
    <router-link :to="`${$route.params.id}/write`"
      ><button>write</button>
    </router-link>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import wisdomHeader from "./WisdomHeader.vue";
import AxiosService from "../../service/axios.service";

export default Vue.extend({
  data() {
    return {
      board: {},
    };
  },
  components: {
    wisdomHeader,
  },
  methods: {
    async changeBoardName() {
      const response = await AxiosService.Instance.get(
        `/mbtis/${this.$route.params.id}/v1`
      );
      this.board = response.data;
      alert(this.board);
    },
  },
});
</script>
