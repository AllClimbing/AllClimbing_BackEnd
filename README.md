# FINAL PROJECT README
김남준 석지명

<br/>
<br/>

## 👐 팀원 구성 및 역할 분담👐

<table align="center">
    <tr align="center">
          <td style="min-width: 220px;">
            <a href="https://github.com/NamjunKim12">
              <img src="https://github.com/ssafy10-seoul07/PJT6-M/assets/69416561/d19fb382-d4dc-481a-bcd2-a1315d4df247" width="250">
                <br />
              <b>김남준(팀장)</b>
            </a> 
        </td>
        <td style="min-width: 220px;">
            <a href="https://github.com/jseok0917">
              <img src="https://github.com/ssafy10-seoul07/PJT6-M/assets/69416561/e103b1e7-cbaa-4efe-9cc2-8c15b87b82c6" width="250">
              <br />
              <b>석지명</b>
            </a> 
        </td>
    </tr>
    <tr align="left">
        <td>
        0. 🙋 프론트엔드 리더<br>
        <br/>
        </td>
        <td>
        0. 🙋 백엔드 리더<br> 
        <br/>
        </td>
    </tr>
</table>

<br/>
<br/>

## 📌 프로젝트 개요

<br>

### 1️⃣ 프로젝트 목표

🟢 웹 아키텍처를 이해하고 이를 활용하여 웹 프로젝트를 설계하고 구현할 수 있다.

🟢 SpringBoot와 Vue를 이해하고 활용할 수 있다.

🟢 Rest API와 VueRouter을 활용하여 SPA 방식으로 프로젝트를 구성할 수 있다.

🟢 기존 관통 프로젝트에 새로운 아이디어를 추가하여 과정에서 배운 기술들을 다양하게 구현해 본다.

<br>


### 2️⃣ 요구사항

🟢 기존 진행한 관통 프로젝트의 요구사항을 정리하고 페어 별로 프로젝트에 적용할 아이디어를 추가하여 Final Project를 완성한다.

🟢 SpringBoot와 MyBatis연동을 활용한 RestAPI 서버 구현

🟢 Vue3버전을 활용한 SPA 클라이언트 구현

<br>
<hr>
<br>

## 📌 프로젝트 정보 

### 0️⃣ UX

🟢 사례1 : 친구들과의 실내 암벽등반을 즐기는 진종인(52, 남) 씨

  - 진종인 씨는 친구들과의 클라이밍을 즐긴다.
  - 친구들과 함께 놀려고 실내 클라이밍 암장을 찾아보려고 한다.
  - 네이버 지도앱에 들어가서 "클라이밍"으로 검색한다.
  - 암장의 위치와 간략한 정보는 나와있지만, 해당 암장에 주차장이 있는지,
  친구들과 함께 갈 정도로 넓은지, 샤워실이 있는지 등의
  자세한 정보들은 나와있지 않다.
  
  => 암장들의 상세정보를 볼 수 있는 곳이 있으면 좋겠다.

<br>

🟢 사례2 : 클라이밍이 취미인 이지은(42, 여) 씨

  - 이지은 씨는 태생이 클라이머다.
  - 일주일에 3번 이상 클라이밍을 하러 다닌다.
  - 주변 클라이밍 암장은 모두 정복하여, 다른 암장들을 찾으러 다닌다.
  - 클라이밍 고인물인 이지은 씨는 좀 어려운 난이도의 암장을 찾고싶다.
  - 네이버 지도를 통해서는 암장들의 난이도도 알기 어렵고, 리뷰들도 주관적이라 
  인스타그램, 네이버 블로그, 인터넷 커뮤니티 등을 통해 암장 정보를 일일이 찾아봐야한다.
  - 유일한 클라이밍 어플에서는 자신이 방문한 암장 기록은 쉽게 확인할 수 있지만,
    암장들의 상세한 정보는 알기 어렵다.
  - 또한, 다녀왔던 암장들의 구역 홀드가 변경 됐으면 가려고 하는데,
  암장들의 전화번호를 일일이 찾아 연락하기가 귀찮다. 
  
  => 암장의 상세한 정보들과 연락처들을 한 데 모아둔 곳이 있고,
  갱신된 정보 등을 바로바로 알 수 있는 서비스가 있으면 좋겠다.
  또, 정보와 함께 클라이밍을 즐기는 사람들이 쓴 리뷰들 위주로 볼 수 있는
  커뮤니티 서비스가 있으면 좋겠다.



<br>

### 1️⃣ 프로젝트 목표

🟢 클라이밍 암장의 정보를 제공하는 웹 서비스를 구현한다.

  - 카카오맵 API를 이용한 암장 검색 기능 및 주변 암장 조회 기능을 구현한다.
  - 암장 상세보기 기능을 제공한다.
  - 암장 상세 페이지에서 리뷰 조회 및 작성, 수정, 삭제 기능을 구현한다.
  - 로그인/로그아웃 및 마이페이지를 구현한다.

<br>
<br>

### 2️⃣ 페이지 정의서 & 와이어프레임

<img src="https://github.com/jseok0917/jseok0917/assets/139304962/bf23f389-aab4-4010-8078-18a66bb709ab" style="width : 700px" />
<img src="https://github.com/jseok0917/jseok0917/assets/139304962/4bbd2495-ab13-4662-bffb-86be3ed90fe5" style="width : 700px"/>

<br>
<br>

### 3️⃣ 프로젝트 요구사항 정의서 

<img src="https://github.com/jseok0917/jseok0917/assets/139304962/527f4131-5121-4bc2-8469-92077b96fb5c" style="width : 900px"/>

<br>
<br>

### 4️⃣ 화면 설계서

<img src="https://github.com/jseok0917/jseok0917/assets/139304962/34863f44-d0cb-43ec-b7e7-a57f852dac92" style="width : 900px"/>

<img src="https://github.com/jseok0917/jseok0917/assets/139304962/a746c2b0-648f-4ab6-9fb2-888243b2b4c5" style="width : 900px"/>

<br>
<hr>
<br>

### 5️⃣ 폴더 구조

🟢 프론트엔드 폴더 구조

![frontFolderStructure](https://github.com/jseok0917/jseok0917/assets/139304962/1e2c3be1-492b-4237-a354-54f52c3cab66)

<br>
<br>

🔴 백엔드 폴더 구조

![backFolderStructure](https://github.com/jseok0917/jseok0917/assets/139304962/6672802e-512f-4abd-b00a-2bc3a187d716)

<br>
<hr>
<br>


## 📌 프로젝트_백엔드 목표

🟢 웹 아키텍처를 이해하고 이를 활용하여 웹 프로젝트를 설계하고 구현

🟢 SpringBoot와 MyBatis연동을 활용한 RestAPI 서버 구현

<br>
<hr>
<br>

## 📌 프론트엔드 파트 구성도

![frontend_structure](https://github.com/jseok0917/jseok0917/assets/139304962/c429f54e-b6c6-4dd3-975e-09e1cfa2b232)

<br>
<hr>
<br>

## 📌 프로젝트_백엔드 구현 결과

### 1️⃣ 작성한 ERD와 MySQL을 이용하여 데이터베이스를 구현한다.

  🟢 E-R Diagram

  ![ERD DIAGRAM](https://github.com/jseok0917/jseok0917/assets/139304962/0ee86420-36e6-4b61-a05d-f295d9b10a9c)
  
  🟢 주어진 ERD를 통해 MySQL로 DB 및 테이블을 작성한다.

```SQL
CREATE SCHEMA allclimbing;

USE allclimbing;

DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `gym`;
DROP TABLE IF EXISTS `review`;
DROP TABLE IF EXISTS `likedgym`;


CREATE TABLE IF NOT EXISTS `user`(
  `userId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `password` varchar(45) CHARACTER SET utf8mb4 NOT NULL DEFAULT '',
  `email` varchar(100) CHARACTER SET utf8mb4 NOT NULL UNIQUE DEFAULT '',
  `nickname` varchar(45) CHARACTER SET utf8mb4 NOT NULL DEFAULT '',
  `instagram` varchar(45) CHARACTER SET utf8mb4 DEFAULT '',
  `grade` int(12) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userId`)
);

CREATE TABLE IF NOT EXISTS `gym`(
  `gymId` varchar(200) CHARACTER SET utf8mb4 NOT NULL,
  `gymAddress` varchar(200) CHARACTER SET utf8mb4 NOT NULL,
  `gymName` varchar(60) CHARACTER SET utf8mb4 NOT NULL,
  `gymImgURL` varchar(2000) CHARACTER SET utf8mb4,
  `operationTime` varchar(45) CHARACTER SET utf8mb4,
  `area` int(30) NOT NULL,
  `contact` varchar(60) CHARACTER SET utf8mb4,
  `shower` boolean NOT NULL,
  `parking` boolean NOT NULL,
  `tutoring` boolean  NOT NULL,
  `homepage` varchar(45) CHARACTER SET utf8mb4,
  `detail` varchar(2000) CHARACTER SET utf8mb4,
  
  PRIMARY KEY (`gymId`)
);

CREATE TABLE IF NOT EXISTS `review`(
  `reviewNo` int(52) AUTO_INCREMENT NOT NULL,
  `gymId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `userId` varchar(45) CHARACTER SET utf8mb4 NOT NULL DEFAULT '',
  `reviewImgURL` varchar(500) CHARACTER SET utf8mb4,
  `originalFileName` varchar(500) CHARACTER SET utf8mb4,
  `saveFileName` varchar(500) CHARACTER SET utf8mb4,
  `content` varchar(200) CHARACTER SET utf8mb4 NOT NULL DEFAULT '',
  `visitDate` DATE NOT NULL,
  `regDate` TIMESTAMP DEFAULT now() ,
  PRIMARY KEY (`reviewNo`),
  CONSTRAINT `gym_ibfk_1` FOREIGN KEY (`gymId`) REFERENCES `gym` (`gymId`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
);

CREATE TABLE IF NOT EXISTS `likedgym`(
  `userId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `gymId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`userId`, `gymId`),
  FOREIGN KEY (`userId`) REFERENCES `user` (`userId`),
  FOREIGN KEY (`gymId`) REFERENCES `gym` (`gymId`)
);

```

<br>
<br>

  🟢 카카오맵 API를 활용하여 클라이밍 암장 데이터들을 모두 크롤링하여 DB에 집어넣는다. 유저 및 리뷰, 찜 데이터는 더미데이터로 넣어놓는다.

🔹 클라이밍 암장 테이블(카카오맵 API를 이용한 크롤링)
![gymDB](https://github.com/jseok0917/jseok0917/assets/139304962/2f9ac2a9-7568-4e6f-ad19-bff7d73b6367)
<br><br>
🔹 리뷰 테이블
![reviewDB](https://github.com/jseok0917/jseok0917/assets/139304962/2a12c37d-052d-4f6b-aa47-9e734238216c) <br><br>
🔹 유저 테이블 / 자주가는암장 중계 테이블 <br><br>
![userDB](https://github.com/jseok0917/jseok0917/assets/139304962/5ced21e0-2ae0-40bb-95c0-9fdbd4c74b3e)
![likedgym](https://github.com/jseok0917/jseok0917/assets/139304962/7037c305-43c9-48f2-a79c-18039ed3edc2)

<br>
<br>


### 2️⃣ SpringBoot를 활용하여 MVC패턴을 설계하고, DB와 서버를 연결한다.

  🟢 Spring Starter Project로 프로젝트를 시작한다. 
    - Type : maven
    - Java Version : 8
    - Spring Boot Version : 2.7.17
    - dependencies : Spring Boot DevTools, Spring Web Services, MyBatis Framework, MySQL Driver, 
                    SpringFox Swagger UI(springfox-boot-starter), Java JWT

  
  🟢 applicaition.properties, Configuration을 작성하여 Spring Boot를 사용하고 DB와 연결하기 위한 설정을 진행한다.

    🔹 applicaition.properties <br>
    🔹 DBconfig <br>
    🔹 WebConfig & SwaggerConfig
```xml 
# dataSource
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/allclimbing?serverTimezone=UTC
spring.datasource.username=ssafy
spring.datasource.password=ssafy

	
# mybatis
mybatis.mapper-locations=classpath*:mappers/*.xml
mybatis.type-aliases-package=com.ssafy.climbing.model.dto
```
<br>

```java
//DBconfig

@Configuration
@MapperScan(basePackages = "com.ssafy.climbing.model.dao")
public class DBConfig {
}
```

```java

//WebConfig

@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");

		registry.addResourceHandler("/swagger-ui/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
	}

// SwaggerConfig
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ssafy.climbing.model.controller"))
				.paths(PathSelectors.ant("/api*/**"))
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("SSAFY_최종PJT_올클라이밍")
				.description("7반 김남준 & 석지명")
				.version("0.1")
				.build();
	}
}
```
<br>
<br>  

### 3️⃣ MVC패턴을 위한 클래스 설계도(UML Class Diagram)

![클래스 다이어그램](https://github.com/jseok0917/jseok0917/assets/139304962/a6d6ec61-ada7-43b5-84d9-b90ac0656653)

<br>
<br>


### 4️⃣ DTO, DAO, MAPPER 순으로 코드를 작성하고, MyBatis를 연동하여 DB와 서버를 연결한다.

  🟢 DTO(Gym, Review, User 클래스)를 작성한다. (Getter, Setter 파트 생략)

```java
//Gym DTO
public class Gym {
	private String gymId;
	private String gymImgURL;
	private String gymName;
	private String gymAddress;
	private String operationTime;
	private int area;
	private String contact;
	private boolean shower;
	private boolean parking;
	private boolean tutoring;
	private String homepage;
	private String detail;
}

//Review DTO
public class Review {
	private int reviewNo; 
	private String gymId;
	private String userId;
	private String reviewImgURL;
	private String originalFileName;
	private String saveFileName;
	private String content;
	private String visitDate;
	private String regDate; 
}


//User DTO
public class User {
	private String userId;
	private String password;
	private String email;
	private String nickname;
	private String instagram;
}

```

<br>
<br>

  🟢 DAO(GymDao, ReviewDao, UserDao 클래스)를 작성한다.

```java
//GymDao
public interface GymDao {
	
	//암장 목록 조회
	List<Gym> selectAllGym();
	
	//암장 1개 조회
	Gym selectOneGym(String gymId);
	
	//한 유저가 자주가는 암장 목록 조회
	List<Gym> selectFavoriteGym(String userId);
	
	//암장 데이터베이스 삽입
	int insertGym(Gym gym);
	
	//암장 정보 업데이트
	int updateGym(Gym gym);
	
	//암장 찜 체크용
	Keyword checkFavoriteGym(@Param("userId") String userId, @Param("gymId") String gymId);

	//암장 찜 기능
	int addFavoriteGym(Keyword keyword);

	//암장 찜 해제 기능
	int deleteFavoriteGym(Keyword keyword);
}

//ReviewDao
public interface ReviewDao {

	// 리뷰 등록
	int insertReview(Review review);

	// 해당 암장의 리뷰들 조회
	List<Review> selectGymReview(String gymId);
	
	// 유저가 쓴 리뷰들 모두 조회
	List<Review> selectUserReview(String userId);

	// 리뷰 한개 조회
	Review selectOneReview(@Param("reviewNo") int reviewNo);
 
	// 리뷰 수정
	int updateReview(Review review);

	// 리뷰 삭제
	int deleteReview(@Param("reviewNo") int reviewNo);

}


//UserDao
public interface UserDao {

	// 유저 생성
	int insertUser(User user);

	// 유저 수정
	int updateUser(User user);

	// 유저 삭제
	int deleteUser(String userId);

	// 유저 조회
	User selectOneUser(String userId);
	
	// 유저 목록 조회
	List<User> selectAllUser();
}

```

<br>
<br>

  🟢 마지막으로 Mappers(GymMapper, ReviewMapper, UserMapper)을 작성하여 DB와 서버의 연동을 완료한다.

```xml
<!-- GymMapper.xml -->
<mapper namespace="com.ssafy.climbing.model.dao.GymDao">

	<!-- 암장 목록 조회 -->
	<select id = "selectAllGym" resultType = "Gym">
		SELECT *
		FROM gym
	</select>
	
	
	<!-- 암장 1개 조회 -->
	<select id ="selectOneGym" resultType = "Gym" parameterType = "String">
		SELECT *
		FROM gym
		WHERE gymId = #{gymId}
	</select>
	
	
	<!-- 자주가는 암장목록 조회 -->
	<select id="selectFavoriteGym" resultType="Gym" parameterType="String">
		SELECT v.gymId, v.gymAddress, v.gymName, v.gymImgURL, v.operationTime, v.area, v.contact, v.shower, v.parking, v.tutoring, v.homepage, v.detail FROM 
		gym v JOIN likedgym u ON v.gymId = u.gymId
		WHERE u.userId = #{userId}
	
	</select>
	
	<!-- 암장 DB에 추가 -->
	<insert id="insertGym" parameterType="Gym">
		INSERT IGNORE INTO `gym` (gymId, gymName, gymAddress, operationTime, area, contact, shower, parking, tutoring, homepage, detail)
		VALUES 
			(#{gymId}, #{gymName}, #{gymAddress}, #{operationTime}, #{area}, #{contact}, #{shower}, #{parking}, #{tutoring}, #{homepage}, #{detail});
	</insert>
	
	<!-- 암장 정보 업데이트 -->
	<update id="updateGym" parameterType="Gym">
		UPDATE `gym` 
		SET gymName = #{gymName},gymAddress = #{gymAddress}
		,operationTime = #{operationTime},area = #{area}
		,contact = #{contact},shower = #{shower}, parking = #{parking}
		,tutoring = #{tutoring},homepage = #{homepage}, detail =  #{detail}
		WHERE gymId = #{gymId}
	</update>
	
	<!-- 암장 찜 체크 -->
	<select id="checkFavoriteGym" resultType="Keyword">
		SELECT * FROM `likedgym`
		WHERE gymId = #{gymId} AND userId = #{userId} 
	</select>
	
	<!-- 암장 찜 기능 -->
	<insert id="addFavoriteGym" parameterType="Keyword">
		INSERT INTO `likedgym` (userId, gymId)
		VALUES
			(#{userId}, #{gymId});
	</insert>
	
	<!-- 암장 찜 해제 기능 -->
	<delete id="deleteFavoriteGym" parameterType="Keyword">
		DELETE FROM `likedgym`
		WHERE gymId = #{gymId} AND userId = #{userId}
	</delete>

</mapper>


<!-- ReviewMapper.xml -->
<mapper namespace="com.ssafy.climbing.model.dao.ReviewDao">
	
	<insert id="insertReview" parameterType="Review">
		INSERT INTO review (gymId, userId, reviewImgURL, originalFileName, saveFileName, content, visitDate, regDate)
		VALUES
			(#{gymId}, #{userId}, #{reviewImgURL}, #{originalFileName}, #{saveFileName}, #{content}, #{visitDate}, NOW());
	</insert>
	
	<select id="selectGymReview" resultType="Review" parameterType="String">
		SELECT *
		FROM review
		WHERE gymId = #{gymId};
	</select>
	
	<select id="selectUserReview" resultType="Review" parameterType="String">
		SELECT *
		FROM review
		WHERE userId = #{userId};
	</select>
	
	<select id="selectOneReview" resultType="Review">
		SELECT *
		FROM review
		WHERE reviewNo = #{reviewNo};
	</select>
	
	<update id="updateReview" parameterType="Review">
		UPDATE review
		SET content = #{content}
		WHERE reviewNo = #{reviewNo};
	</update>
	
	<delete id="deleteReview">
		DELETE FROM review
		WHERE reviewNo = #{reviewNo};
	</delete>
	
</mapper>


<!-- UserMapper.xml -->
<mapper namespace="com.ssafy.climbing.model.dao.UserDao">
	 <!-- 유저 생성 -->
    <insert id="insertUser" parameterType="User">
        INSERT INTO user (userId, password, email, nickname, instagram)
        VALUES (#{userId}, #{password}, #{email}, #{nickname}, #{instagram});
        WHERE NOT EXISTS (SELECT * FROM user WHERE userId = #{userId});
    </insert>

    <!-- 유저 수정 -->
    <update id="updateUser" parameterType = "User">
        UPDATE user
        SET password = #{password} AND email = #{email} AND nickname = #{nickname} AND instagram = #{instagram}
        WHERE userId = #{userId};
    </update>

    <!-- 유저 삭제 -->
    <delete id="deleteUser">
        DELETE FROM user
        WHERE userId = #{userId};
    </delete>

    <!-- 유저 조회 -->
    <select id="selectOneUser" resultType="User" parameterType="String">
        SELECT *
        FROM user
        WHERE userId = #{userId};
    </select>
    
    <!-- 유저 목록 조회 -->
    <select id="selectAllUser" resultType="User">
        SELECT *
        FROM user;
    </select>

</mapper>

```

<br>
<br>

### 5️⃣ Service, Controller 를 모두 구현하여 RESTAPI 서버로 핵심기능을 구현한다.

🟢 Service(GymService, ReviewService, UserService 클래스)를 작성한다. - 코드 생략

🟢 Controller(GymController, ReviewController)를 작성하여 핵심 기능을 우선적으로 구현한다. <br>
    @RestController, @Get/Post/Put/Delete+Mapping @RequestBody 등 Annotation을 이용하여 RESTAPI 서버를 구현한다. <br>
    UserController는 핵심기능 API 테스트 후 Jwt토큰을 이용하여 프론트엔드와 협업하여 작성할 예정

```java
//GymController
@RestController
@RequestMapping("/api/gym")
@Api(tags="암장 컨트롤러")
@CrossOrigin("*")
public class GymController  {
	
	@Autowired
	private GymService gService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private ReviewService rService;
	
	@GetMapping("/list")
	@ApiOperation(value="암장 목록 조회")
	public ResponseEntity<?> allGymList(){
		List<Gym> gymList = gService.selectAllGym();
		return new ResponseEntity<List<Gym>>(gymList, HttpStatus.OK);
	}
	
	@GetMapping("/list/{userId}")
	@ApiOperation(value="자주가는 암장 목록 조회")
	public ResponseEntity<?> favoriteGymList(@PathVariable String userId){
		List<Gym> gymList = gService.selectFavoriteGym(userId);
		return new ResponseEntity<List<Gym>>(gymList, HttpStatus.OK);
	}
	
	@GetMapping("/{gymId}")
	@ApiOperation(value="암장 상세조회")
	public ResponseEntity<?> selectGym(@PathVariable String gymId){
		Gym gym = gService.selectOneGym(gymId);
		return new ResponseEntity<Gym>(gym, HttpStatus.OK);
	}
	
	
	@PostMapping("/insert")
	@ApiOperation(value="암장 정보삽입")
	public ResponseEntity<?> insertGym(@RequestBody Gym gym){
		int result = gService.insertGym(gym);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	@ApiOperation(value="암장 정보업데이트")
	public ResponseEntity<?> updateGym(@RequestBody Gym gym){
		System.out.println(gym.toString());
		int result = gService.updateGym(gym);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/favorite")
	@ApiOperation(value="암장 찜 체크용")
	public ResponseEntity<?> checkFavoriteGym(@RequestBody Keyword keyword){
		Keyword resultType = gService.checkFavoriteGym(keyword.getUserId(), keyword.getGymId());
		if (resultType == null) {
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
		System.out.println(resultType.toString());
		return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/favorite/{gymId}")
	@ApiOperation(value="암장 찜")
	public ResponseEntity<?> addFavoriteGym(@RequestBody Keyword keyword){
		int result = gService.addFavoriteGym(keyword);
		if (result == 0) {
			return new ResponseEntity<Integer>(result, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Integer>(result, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/favorite/delete")
	@ApiOperation(value="암장 찜 해제")
	public ResponseEntity<?> deleteFavoriteGym(@RequestBody Keyword keyword){
		System.out.println("찜해제?"+keyword.toString());
		int result = gService.deleteFavoriteGym(keyword);
		if (result == 0) {
			return new ResponseEntity<Integer>(result, HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Integer>(result, HttpStatus.ACCEPTED);
	}
	
}


//ReviewController
@RestController
@RequestMapping("/api/review")
@Api(tags="리뷰 컨트롤러")
@CrossOrigin("*")
public class ReviewController  {
	
	@Autowired
	private GymService vService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private ReviewService rService;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	//=======================리뷰파트 CURD 구현===========================
	@GetMapping("/{gymId}")
	@ApiOperation(value="암장 리뷰 조회")
	public ResponseEntity<List<Review>> gymReviewlist(@PathVariable String gymId){
		List<Review> reviewList = rService.getGymReview(gymId);
		return new ResponseEntity<List<Review>>(reviewList, HttpStatus.OK);
	}
	
	@GetMapping("/list/{userId}")
	@ApiOperation(value="유저 리뷰 조회")
	public ResponseEntity<List<Review>> userReviewlist(@PathVariable String userId){
		List<Review> reviewList = rService.getUserReview(userId);
		return new ResponseEntity<List<Review>>(reviewList, HttpStatus.OK);
	}
	
	@GetMapping("/select/{reviewNo}")
	@ApiOperation(value="리뷰 한개 조회")
	public ResponseEntity<?> selectOneReview(@PathVariable int reviewNo){
		Review review = rService.getOneReview(reviewNo);
		if (review == null) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Review>(review, HttpStatus.OK);
	}
	
	@PostMapping("/write")
	@ApiOperation(value="리뷰 작성")
		public ResponseEntity<Void> write(@RequestPart(value="image", required = false) MultipartFile file, @RequestPart("review") Review review){
		
		//파일이 존재하고 가짜파일이 아닐때만
		if (file != null && file.getSize() > 0) {
			String uploadPath = "C:\\uploadTemp";
			
			File folder = new File(uploadPath);
			if (!folder.exists()) {
				folder.mkdir();
			}
			
			
			//작성일까지만 불러온다
			String writtenDay = sdf.format(System.currentTimeMillis());
			
			//작성일 폴더가 없다면 폴더 생성
			//저장될 폴더경로
			String saveFolder = uploadPath+"/"+writtenDay;
			folder = new File(saveFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}
		
			
			//실제 파일이름을 가져와
			//기존 파일이름
			String originalFileName = file.getOriginalFilename();
			int nameLength = originalFileName.length();
			//저장될 파일이름
			UUID uuid = UUID.randomUUID();
			String saveFileName = uuid.toString()+originalFileName.substring(nameLength-4, nameLength);
			
			// 파일 Dto 생성하여 우선 경로만
			// DAO를 통해 저장
			review.setReviewImgURL(saveFolder);
			review.setOriginalFileName(originalFileName);
			review.setSaveFileName(saveFileName);
			
			File target = new File(saveFolder, saveFileName);

			//target에 file복사
			try {
				FileCopyUtils.copy(file.getBytes(), target);
			} catch (IOException e) {
				System.out.println("왜 예외로들어오는거지");
				e.printStackTrace();
			}
			
		}
		
		int result = rService.writeReview(review);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	
	@PutMapping("/update")
	@ApiOperation(value="리뷰 수정")
	public ResponseEntity<Void> update(@RequestPart(value="image", required = false) MultipartFile file, @RequestPart("review") Review review){
		if (file != null && file.getSize() > 0) {
			String uploadPath = "C:\\uploadTemp";
			
			File folder = new File(uploadPath);
			if (!folder.exists()) {
				folder.mkdir();
			}
			
			
			//작성일까지만 불러온다
			String writtenDay = sdf.format(System.currentTimeMillis());
			System.out.println(writtenDay);
			
			//작성일 폴더가 없다면 폴더 생성
			//저장될 폴더경로
			String saveFolder = uploadPath+"/"+writtenDay;
			folder = new File(saveFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}
		
			
			//실제 파일이름을 가져와
			//기존 파일이름
			String originalFileName = file.getOriginalFilename();
			int nameLength = originalFileName.length();
			//저장될 파일이름
			UUID uuid = UUID.randomUUID();
			String saveFileName = uuid.toString()+originalFileName.substring(nameLength-4, nameLength);
			
			// 파일 Dto 생성하여 우선 경로만
			// DAO를 통해 저장
			review.setReviewImgURL(saveFolder);
			review.setOriginalFileName(originalFileName);
			review.setSaveFileName(saveFileName);
			
			File target = new File(saveFolder, saveFileName);

			//target에 file복사
			try {
				FileCopyUtils.copy(file.getBytes(), target);
			} catch (IOException e) {
				System.out.println("왜 예외로들어오는거지");
				e.printStackTrace();
			}
			
		}
		
		int result = rService.modifyReview(review);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{reviewNo}")
	@ApiOperation(value="리뷰 삭제")
	public ResponseEntity<Void> delete(@PathVariable int reviewNo){
		int result = rService.removeReview(reviewNo);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
```

<br>
<br>


### 6️⃣ 구현한 RESTAPI 서버의 각 기능들을 Swagger-ui를 이용하여 테스트한다.


<img src="https://github.com/jseok0917/jseok0917/assets/139304962/87a91b74-c2dc-43b5-9994-5f0135383c81" style="width : 300px;" />
<img src="https://github.com/jseok0917/jseok0917/assets/139304962/7e828bbf-8159-4358-ad22-1cda173d3d86" style="width : 300px;" />

<br>
<br>

### 7️⃣ JWT를 이용하여 토큰을 이용한 로그인 인증 기능과 인터셉터를 구현한다.

  🟢 토큰 생성과 유효성 검사를 위한 JwtUtil 클래스를 작성한다.

```java
@Component
public class JwtUtil {
	
	private static final String SALT = "SSAFIT";
	
	
	//토큰 생성 메서드
	//데이터가 하나만 인자로 들어온다라고 가정하고 / 테스트에 방해가 되는 유효기간 제거
	public String createToken(String key, String value) throws UnsupportedEncodingException {
		return Jwts.builder()
				.setHeaderParam("alg", "HS256")
				.setHeaderParam("typ", "JWT") //헤더완료	
				.claim(key, value)
				.setExpiration(new Date(System.currentTimeMillis()+36000000)) //세션 만료시간 10시간
				.signWith(SignatureAlgorithm.HS256, SALT.getBytes("UTF-8")) //서명완료
				.compact();
	}
		
	//토큰 유효성 검사 메서드
	public void valid(String token) throws Exception {
		Jwts.parser().setSigningKey(SALT.getBytes("UTF-8")).parseClaimsJws(token);
	}
}

```

<br>
<br>

  🟢 UserController를 작성하여 로그인 시 JwtUtil을 활용하여 Token을 생성해 클라이언트에게 전달해준다.
  클라이언트에서 페이지 전환이 일어날 때마다 서버로 토큰을 전달하여 유효성을 검사하도록 구현한다.

```java
//UserController
@RestController
@RequestMapping("/api/user")
@Api(tags="유저 컨트롤러")
@CrossOrigin("*")
public class UserController  {
	
	@Autowired
	private GymService vService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private ReviewService rService;
	
	//로그인 토큰 생성용
	@Autowired
	private JwtUtil jwtUtil;
	
	private static final String HEADER_AUTH = "access-token";

	//=======================유저파트 CURD 구현===========================
	@GetMapping("/{userId}")
	@ApiOperation(value="유저 정보 조회")
	public ResponseEntity<?> list(@PathVariable String userId){
		User user = uService.getUser(userId);
		user.setPassword("*");
		if (user == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);			
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	
	@PostMapping("/login")
	@ApiOperation(value="로그인")
	public ResponseEntity<?> login(@RequestBody User user) {
		User selectedUser = uService.getUser(user.getUserId());
		if (selectedUser == null) {
			return new ResponseEntity<String>("", HttpStatus.OK);
		} 
		
		if (selectedUser.getPassword().equals(user.getPassword())) {
			try {
				//로그인 성공 시 토큰을 전송
				return new ResponseEntity<String>(jwtUtil.createToken("userId", user.getUserId()), HttpStatus.OK);
			} catch (UnsupportedEncodingException e) {
				String msg = "토큰 생성 시 인코딩 에러가 발생하였습니다.";
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			}
		}
		
		return new ResponseEntity<String>("", HttpStatus.OK);
		
	}
	
  //토큰 유효성 검사
	@GetMapping("/validation")
	@ApiOperation(value="유효성 검사")
	public ResponseEntity<Boolean> validate(@RequestParam String token){
		
		
		if(token != null) {
			try {
				jwtUtil.valid(token);
				return new ResponseEntity<Boolean>(true, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<Boolean>(false, HttpStatus.OK);
			}
		}
		
		
		return new ResponseEntity<Boolean>(false, HttpStatus.OK);
	}
	
}

```

<br>
<br>

  🟢 로그인 인터셉터 사용이 가능하도록 
  WebConfig에 인터셉터 설정을 추가한다.

```java
//WebConfig 인터셉터 설정 코드
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/api/user/login");
	}	
```
<br>
<br>

  🟢 로그인 인터셉터를 구현하여, 클라이언트로부터 요청을 받을 때마다 토큰을 전달받아 
  유효하지않은 토큰일 경우 false를 반환한다. 

```java
@Component
public class JwtInterceptor implements HandlerInterceptor{
	private static final String HEADER_AUTH = "access-token";
	
	
	//인터셉터는 클라이언트 요청을 받을 경우에 작용
	@Autowired
	private JwtUtil jwtUtil;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

		String token = request.getHeader(HEADER_AUTH);
		
		if(token != null) {
			try {
				jwtUtil.valid(token);
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return false;
			}
		}
		return false;
		
		
	}
}
```

<br>
<br>

### 8️⃣ 유저 RESTAPI의 작동에 문제가 없는지 프론트엔드와 협업하여 검증한다.

<img src="https://github.com/jseok0917/jseok0917/assets/139304962/1020e620-8766-40ad-8931-0089890c8ce6" style="width : 300px;" />

<br>
<hr>
<br>






