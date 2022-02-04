<template>
    <div id = "graph" style = "display: flex; ">
            <b-card
            v-for = "mainBoard in mainBoardList" :key = "mainBoard.mainBoardNum"
            border-variant="primary"
            tag="article"
            style="width: 20rem; margin: 10px;"
            class="mb-2"
            @click="mainBoardDetail(mainboard.mainBoardNum)"
            >
                <b-card-title>
                    {{mainBoard.title}}
                </b-card-title>
                <b-card-text>
                    {{mainBoard.content}}
                    <br/>
                    {{mainBoard.writer}}
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
    methods: {
        detail(mainBoardNum: number){
            
        }
    },
    async mounted() {
        const response = await AxiosService.Instance.get('/v1');
        this.mainBoardList = response.data;
    }
    
});
</script>

<style>

</style>