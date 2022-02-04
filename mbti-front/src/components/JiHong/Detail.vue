<template>
    <div>

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
        mainBoardDetail(mainBoardNum: string){
            
            this.$router.push({
                    path: this.$route.path + "/" + mainBoardNum,
            });
        }
    },
    async mounted() {
        const response = await AxiosService.Instance.get('/v1');
        this.mainBoardList = response.data;
    }
    
});
</script>