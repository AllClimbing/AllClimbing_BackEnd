import { ref} from 'vue'
import { defineStore } from 'pinia'
import router from '@/router'
import axios from 'axios'

const REST_USER_API = `http://localhost:8080/api/user`

export const useUserStore = defineStore('user', () => {

  const loginUserId = ref('')
  const userLogin = function(userId, password){
    axios.post(`${REST_USER_API}/login`, {userId, password})
    .then((response)=>{
      console.log(response)
      console.log("이줄까진되네?") 
      localStorage.setItem('access-token', response.data)
      sessionStorage.setItem('access-token', response.data)

      const token = response.data['access-token'].split('.')
      console.log("이건왜"+token);
      let id = token[1]
      console.log(id);
      //base64 문자열 디코딩
      id = atob(id)
      id = JSON.parse(id)
      console.log(id['id'])
      loginUserId.value = id['id']
      router.push({name: "home"});

    })
    .catch(()=>{

    })
  }
  return { userLogin, loginUserId }
})
