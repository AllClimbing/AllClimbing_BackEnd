
<template>
  <div>
    <RouterView />
    <TheHeaderNav />
    <DetailHeader></DetailHeader>
  </div>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router'
import TheHeaderNav from '@/components/common/TheHeaderNav.vue'
import DetailHeader from '@/components/common/DetailHeader.vue'


</script>

<style scoped></style>
