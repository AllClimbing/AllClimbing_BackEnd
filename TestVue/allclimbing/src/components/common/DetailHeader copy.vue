<template>

        <div id="head">
            <button id="backButton"><img src="@/assets/back.svg"></button>
            <p>{{ title }}</p>
            <button id="addButton"><img src="@/assets/add.svg"></button>
        </div>
</template>

<script setup>
import {ref} from 'vue';
const title = ref("클라이밍파크 한티점");

</script>

<style scoped>

button{
  border: 0;
  background-color: transparent;
  cursor: pointer;
}


#head {
    display: flex;
    background-color: #292929;
    height: 6.7vh;
    font-size: 18px;
    justify-content: space-evenly;
}

button img {
    border : none;
    margin: none;
    padding : 10px;
}

#backButton{
    margin-right: auto;
    width:3vh; 
    height:3vh;
}

#addButton{
    margin-left: auto;
    width:2.5vh; 
    height:2.5vh;
}

</style>