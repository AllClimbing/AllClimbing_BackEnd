<template>
    <div class="login_box">
      <h1>로그인하기</h1>
  
      <form class="login_form_box">
        <div>
          <label for="user_id">아이디</label>
          <input
            type="user_id"
            id="user_id"
            v-model="user_id"
          />
        </div>
        <div>
          <label for="password">비밀번호</label>
          <input
            type="password"
            id="password"
            v-model="password"
          />
        </div>
  
        <button
          type="button"
          @click.prevent="login"
        >
          로그인
        </button>
  
  
        <router-link to="/signup">
        <button type="button">회원가입</button>
        </router-link>
        
      </form>
    </div>
  </template>
  
  <script setup>
  import { ref } from "vue";
  import { useRouter } from "vue-router";
  import axios from "axios";
  
  const user_id = ref("");
  const password = ref("");
  const USER_API = "http://localhost:8080/api/user/login";
  const router = useRouter();
  
  const signup = function () {
    console.log("정의");
  };
  
  const login = async () => {
    const user = {
      userId: user_id.value,
      password: password.value,
    };

    try {
      const res = await axios.post(USER_API, user);
      console.log(res.data);
      if (res.data) {
        window.sessionStorage.setItem("user", "isLogin");
        router.push({ name: "home" });
      } else {
        alert("로그인 실패");
      }
    } catch (err) {
      console.log(err);
    }
  };
  </script>
  
  <style scoped>
  .login_box {
    width: 400px;
    height: 400px;
    background-color: #fff;
    margin: 0 auto;
    margin-top: 100px;
    padding-top: 50px;
    padding-left: 50px;
    border-radius: 10px;
    box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.2);
  }
  </style>
  