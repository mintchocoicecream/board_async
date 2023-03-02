/*게시판: 게시글번호, 작성자, 제목, 게시글내용, 분류, 작성일*/
drop table board;

create table board(
	boardno int primary key auto_increment,
	writer varchar(45) not null,
	writermail varchar(50) not null,
	password varchar(45) not null,
	title varchar(50) not null,
	content text not null,
	views int default 0,
	writedate date
);

--dummy data
insert into board values (0, '딸기', 'test1@email.com', '123456', '제목1', '내용입니다.', 5, now());
insert into board values (0, '오렌지', 'test2@email.com', '123456', '제목2', '내용입니다.', 2, now());
insert into board values (0, '수박', 'test3@email.com', '123456', '제목3', '내용입니다.', 1, now());
insert into board values (0, '포도', 'test4@email.com', '123456', '제목4', '내용입니다.', 3, now());
insert into board values (0, '복숭아', 'test5@email.com', '123456', '제목5', '내용입니다.', 5, now());
insert into board values (0, '키위', 'test6@email.com', '123456', '제목6', '내용입니다.', 5, now());
insert into board values (0, '바나나', 'test7@email.com', '123456', '제목7', '내용입니다.', 7, now());
insert into board values (0, '체리', 'test8@email.com', '123456', '제목8', '내용입니다.', 8, now());
insert into board values (0, '멜론', 'test9@email.com', '123456', '제목9', '내용입니다.', 17, now());
insert into board values (0, '사과', 'test10@email.com', '123456', '제목10', '내용입니다.', 15, now());

commit;
select * from board;