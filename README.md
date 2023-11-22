# AllClimbing_BackEnd
AllClimbing_BackEnd_Repository

## 2023년 11월 22일 

- 사진 업로드할 때, 서버에서 java.nio.file.NoSuchFileException 에러 발생
    - 발생 이유 : multipartfile로 받으면 비동기 처리에 의해서 파일을 생성할 때와 파일을 복사할 때 서로 다른 쓰레드가 처리하게 되어
    쓰레드에서 다른 쓰레드의 파일을 참조할 수 없기 때문에 에러가 발생
    
    - file.getcontentType 메서드에 뭔가 문제가있음

    https://everydayyy.tistory.com/167