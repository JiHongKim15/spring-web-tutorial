<template>
    <div>
        <button>{{name}}</button>
    </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';
@Component
export default class NameButton extends Vue {
    @Prop() private name: string = '';
}
</script>
