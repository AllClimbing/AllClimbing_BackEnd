<template>
    <div id="whole">
        <div id ="viewport">
        <div>상태창</div>
        <div id="head">
            <button id="backButton"><img src="@/assets/back.svg"></button>
            <p>{{ title }}</p>
            <button id="addButton"><img src="@/assets/add.svg"></button>
        </div>
         </div>
     </div>
</template>

<script setup>
import {ref} from 'vue';

const title = ref("클라이밍파크 한티점");

</script>

<style scoped>


#whole {
    display: flex;
    justify-content: center;
}

#viewport {
    width : 390px;
    height : 844px;
    background-color: #292929;
    color : white;
}

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
    width:3vh; 
    height:3vh;
}

#backButton{
    margin-right: auto;
}

#addButton{
    margin-left: auto;
}

</style>