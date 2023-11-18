<template>
    <div>
        <h1>파일업로드 설정</h1>
        <form @submit.prevent="submitForm">
            <div>
                <label for="text-input">Text Input:</label>
                <input id="text-input" type="text" v-model="textInput">
                <h2>{{ textInput }}</h2>
            </div>
            <div>
                <label for="image-input">Image Input:</label>
                <input id="image-input" type="file" ref="imageInput" @change="handleImageChange">
            </div>
            <button type="submit">Submit</button>
        </form>
    </div>
</template>
  
<script setup>
import axios from 'axios';
import {ref} from 'vue';

const review = ref({
    gymId : 1796322688,
    userId : 'ssafy',
    content : null,
    visitDate : '2023-11-06',
})

const textInput = ref(null);
const selectedImage = ref(null);

const handleImageChange = function(event) {
    console.log("왜안되는데");
    console.log(event.target.files);
    selectedImage.value = event.target.files[0];
};

const submitForm = function() {
    const formData = new FormData();
    review.value.content = textInput.value;
    formData.append('review', review.value);
    console.log(review.value);
    formData.append('image', selectedImage.value);
    console.log(formData);

    // 여기서는 간단히 /api/upload로 POST 요청을 보내는 것을 가정합니다.
    axios.post('http://localhost:8080/api/review/write', formData)
        .then(response => {
            console.log('Server response:', response.data);
            // 성공적으로 서버 응답을 받았을 때 수행할 작업
        })
        .catch(error => {
            console.error('Error sending data to server:', error);
        });
};

</script>

<style scoped></style>