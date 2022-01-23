<template>
    <div id = "graph">
        <thead>
            <tr>
                <th>제목</th>
                <th>내용</th>
            </tr>
        </thead>
        <tbody v-for="item in items" :key="item.title">
            <td> <span v-html = "item.title"/> </td>
            <td> <span v-html = "item.contents"/> </td>
            
        </tbody>
    </div>
</template>


<script lang="ts">
    
</script>