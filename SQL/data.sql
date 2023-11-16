INSERT INTO `user` (`userId`, `password`, `email`, `nickname`)
VALUES
('ssafy', '1234', 'ssafy@ssafy.com', '김남준'),
('ssafy1', '1234', 'ssafy1@ssafy.com', '석지명'),
('ssafy2', '1234', 'ssafy2@ssafy.com', '조현수'),
('ssafy3', '1234', 'ssafy3@ssafy.com', '이승헌'),
('ssafy4', '1234', 'ssafy4@ssafy.com', '유승호'),
('ssafy5', '1234', 'ssafy5@ssafy.com', '김중광'),
('ssafy6', '1234', 'ssafy6@ssafy.com', '전은평'),
('byy', '1234', '배유열@ssafy.com', '알빠노');

-- 중복된 이메일 안되게해야함

INSERT INTO `allclimbing`.`gym` (`gymId`, `gymname`, `operationTime`, `area`, `contact`, `shower`, `park`, `tutoring`, `homepage`, `detail`) 
VALUES 
('asy1bascgt1sdf', '올클라이밍', '9시부터 10시까지 영업해요~', '30', '010-1234-5678', 1, 1, 1, '', '우리 암장 아주아주 넓고 좋고 깨끗하고 신생이에요~\n'),
('1bascgt1sdf24', '클라이밍짐', '9시부터 12시까지 영업해요~', '20', '010-1234-5678', 1, 0, 0, '', '우리 암장 아주아주 넓고 좋고 깨끗하고 신생이에요~\n'),
('gt1sd235f', '웨어하우스짐', '9시부터 13시까지 영업해요~', '50', '010-1234-5678', 1, 1, 1, '', '우리 암장 아주아주 넓고 좋고 깨끗하고 신생이에요~\n'),
('at5478451sdf', '클라이밍파크', '9시부터 14시까지 영업해요~', '100', '010-1234-5678', 1, 1, 1, '', '우리 암장 아주아주 넓고 좋고 깨끗하고 신생이에요~\n'),
('as2424as68f', 'PEAKERS클라이밍', '9시부터 15시까지 영업해요~', '70', '010-1234-5678', 1, 0, 0, '', '우리 암장 아주아주 넓고 좋고 깨끗하고 신생이에요~\n');

INSERT INTO `review` ( `gymId`, `userId`, `content`, `visitDate`) 
VALUES 
('1bascgt1sdf24', 'ssafy', '이 암장 너무 넓고 좋네요~!', '2023-09-15'),
('1bascgt1sdf24', 'ssafy', '난 사실 바이럴임 ㅋ 돈받고 리뷰씀!', '2023-09-15'),
('asy1bascgt1sdf', 'ssafy', '이 암장은 좀... 거리는 가까운데 김중광같네요', '2023-09-15'),
('gt1sd235f', 'ssafy', '클라이밍의 신 석지명님이 여기 다닌다고 하시던데...', '2023-09-15'),
('at5478451sdf', 'ssafy', '클라이밍 여제 Haley님일 여기서 뵈었습니다. 실물이 참 이쁘시네요 ㅎㅎ', '2023-09-15'),
('as2424as68f', 'ssafy', '김남준 프론트열심히 해라.', '2023-09-15');

INSERT INTO `likedgym` (`userId`, `gymId`)
VALUES
('ssafy','1bascgt1sdf24'),
('ssafy','asy1bascgt1sdf');