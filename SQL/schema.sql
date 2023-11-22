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

-- CREATE TABLE IF NOT EXISTS `gymInfo`(
--   `gymId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
--   FOREIGN KEY (`gymId`) REFERENCES `gym` (`gymId`),
--   PRIMARY KEY (`gymId`)
-- );

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
  CONSTRAINT `gym_ibfk_1` FOREIGN KEY (`gymId`) REFERENCES `gym` (`gymId`) ON DELETE CASCADE,
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS `likedgym`(
  `userId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `gymId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`userId`, `gymId`),
  FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE CASCADE,
  FOREIGN KEY (`gymId`) REFERENCES `gym` (`gymId`) ON DELETE CASCADE
);

-- CREATE TABLE IF NOT EXISTS `visitedgym`(
--   `visitNo` int(52) AUTO_INCREMENT NOT NULL,
--   `userId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
--   `gymId` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
--   `visitDate` DATE NOT NULL,
--   PRIMARY KEY (`visitNo`),
--   FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE CASCADE,
--   FOREIGN KEY (`gymId`) REFERENCES `gym` (`gymId`) ON DELETE CASCADE
-- );

DESC gym;
DESC user;

SELECT * FROM gym WHERE gymId = 635872075;

SELECT * FROM user;
SELECT * FROM review;
SELECT * FROM likedgym;

SELECT *
		FROM review
		WHERE userId = 'ssafy';