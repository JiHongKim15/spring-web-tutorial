<template>
  <div class="wisdomWritingForm">
    <b-form @submit="onSubmit" @reset="onReset">
      <b-form-input
        v-model="text"
        placeholder="제목을 입력하시오"
      ></b-form-input>
      <br />
      <b-form-textarea
        id="textarea"
        v-model="text"
        placeholder="내용을 입력하시오"
        rows="20"
      ></b-form-textarea>
      <b-button type="submit" variant="primary">Submit</b-button>
      <b-button type="reset" variant="danger">Reset</b-button>
    </b-form>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";

export default class WisdomWritingForm extends Vue {}
</script>
