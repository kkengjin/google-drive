<template>

    <v-data-table
        :headers="headers"
        :items="dashboard"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DashboardView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "fileSize", value: "fileSize" },
                { text: "fileNm", value: "fileNm" },
                { text: "videoUrl", value: "videoUrl" },
                { text: "inexYn", value: "inexYn" },
                { text: "uploadYn", value: "uploadYn" },
                { text: "type", value: "type" },
                { text: "path", value: "path" },
                { text: "isuploaded", value: "isuploaded" },
                { text: "isindexed", value: "isindexed" },
            ],
            dashboard : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/dashboards'))

            temp.data._embedded.dashboards.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.dashboard = temp.data._embedded.dashboards;
        },
        methods: {
        }
    }
</script>

