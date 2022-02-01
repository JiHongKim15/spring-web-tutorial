<template>
    <div id = "graph">
        <thead>
            <tr>
                <th>제목</th>
                <th>내용</th>
            </tr>
        </thead>
        <!-- <tbody v-for="item in items" :key="item.title">
            <td> <span v-html = "item.title"/> </td>
            <td> <span v-html = "item.content"/> </td>
        </tbody> -->
    </div>
</template>

<script lang = "ts">
import AxiosService from '../../service/axios.service';
import AxiosResponse from '../../service/axios.service';

class MainBaord {
    public mainBoardNum?: number;
    public content?: string;
    public writer?: string;
    public writeTime?: Date;
}
export default {
    mainBoardList: [],
    async mounted() {
        const response: AxiosResponse = await AxiosService.Instance.get('/v1');
        
        console.log(response);
    },
};
</script>

<style>

</style>