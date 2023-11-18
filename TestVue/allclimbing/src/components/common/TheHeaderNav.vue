<template>
    <div>
        <header>
            <nav>
                <RouterLink to="/">Home</RouterLink> |
                <RouterLink to="/gym">Gym</RouterLink> |
                <RouterLink to="/login">Login</RouterLink> |
                <RouterLink to="/detail">Detail</RouterLink>
            </nav>
        </header>
    </div>
</template>

<script setup>
import { RouterLink } from 'vue-router';

</script>

<style scoped>

</style>