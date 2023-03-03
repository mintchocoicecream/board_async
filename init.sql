-- --------------------------------------------------------
-- 호스트:                          localhost
-- 서버 버전:                        8.0.31 - MySQL Community Server - GPL
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- board 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `board` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `board`;

-- 테이블 board.board 구조 내보내기
CREATE TABLE IF NOT EXISTS `board` (
  `boardno` int NOT NULL AUTO_INCREMENT,
  `writer` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `writermail` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `title` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `content` text COLLATE utf8mb4_general_ci NOT NULL,
  `views` int DEFAULT '0',
  `writedate` date DEFAULT NULL,
  PRIMARY KEY (`boardno`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 board.board:~9 rows (대략적) 내보내기
INSERT INTO `board` (`boardno`, `writer`, `writermail`, `password`, `title`, `content`, `views`, `writedate`) VALUES
	(2, '오렌지', 'test2@email.com', '123456', '제목2', '내용입니다.', 2, '2023-03-03'),
	(3, '수박', 'test3@email.com', '123456', '제목3', '내용입니다.', 1, '2023-03-03'),
	(4, '포도', 'test4@email.com', '123456', '제목4', '내용입니다.', 3, '2023-03-03'),
	(5, '복숭아', 'test5@email.com', '123456', '제목5', '내용입니다.', 5, '2023-03-03'),
	(6, '키위', 'test6@email.com', '123456', '제목6', '내용입니다.', 5, '2023-03-03'),
	(7, '바나나', 'test7@email.com', '123456', '제목7', '내용입니다.', 7, '2023-03-03'),
	(8, '체리', 'test8@email.com', '123456', '제목8', '내용입니다.', 8, '2023-03-03'),
	(9, '멜론', 'test9@email.com', '123456', '제목9', '내용입니다.', 17, '2023-03-03'),
	(10, '망고', 'test10@email.com', '123456', '제목10', '내용입니다100', 0, '2023-03-03');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
