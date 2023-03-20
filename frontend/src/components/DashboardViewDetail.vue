<template>

    <v-card outlined>
        <v-card-title>
            Dashboard # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="FileSize" v-model="item.fileSize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="FileNm" v-model="item.fileNm" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="VideoUrl" v-model="item.videoUrl" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="InexYn" v-model="item.inexYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="UploadYn" v-model="item.uploadYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Type" v-model="item.type" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Path" v-model="item.path" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isuploaded" v-model="item.isuploaded" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isindexed" v-model="item.isindexed" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashboardViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashboards/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

