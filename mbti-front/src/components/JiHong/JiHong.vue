<template>
    <div id = "graph">
        <b-card
         v-for = "mainBoard in mainBoardList" :key = "mainBoard.title"
         tag="article"
         style="max-width: 20rem;"
         class="mb-2"
        >
            <b-card-title>
                {{mainBoard.title}}
            </b-card-title>
            <b-card-text>
                {{mainBoard.content}}
            </b-card-text>
        </b-card>
    </div>
</template>

<script lang = "ts">
import Vue from 'vue';
import AxiosService from '../../service/axios.service';

export default Vue.extend({
    data() {
        return {
            mainBoardList: [],
        };
    },
    async mounted() {
        const response = await AxiosService.Instance.get('/v1');
        this.mainBoardList = response.data;
    }
    
});
</script>

<style>

</style>