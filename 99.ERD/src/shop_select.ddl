/*
 * 1. 멤버 한 사람의 특정 날짜의 주문전체목록
 * 2. 멤버 한 사람의 특정 날짜의 주문 한 개
 * 3. 주문 한 개의 멤버의 정보
 * 4. 주문 한 개의 제품 여러 개 정보들(주문상세)
 * 5. 주문 한 개의 주문자 정보&제품 여러 개 정보들(주문상세)
 */
/*************고객 입장*************/
/* 1. 멤버 한 사람의 특정 날짜의 주문전체목록 */
select * from user1 u join jumun1 j on u.user_id=j.user_id;

select * from 
user1 u join jumun1 j 
on u.user_id=j.user_id and u.user_id='guard1' and to_char(j.jumun_date, 'YYYY/MM/DD')='2020/09/02';

/* 2. 멤버 한 사람의 특정 날짜의 주문 한 개 */
select j.* from 
user1 u join jumun1 j 
on u.user_id=j.user_id and u.user_id='guard1' and to_char(j.jumun_date, 'YYYY/MM/DD')='2020/09/02'
where j.jumun_no=3001;

/* 4. 주문 한 개의 제품 여러 개 정보들(주문상세) */

/*************관리자 입장*************/
/* 1. 모든 멤버의 특정 날짜의 주문전체목록 */
select j.* from 
user1 u join jumun1 j 
on u.user_id=j.user_id and to_char(j.jumun_date, 'YYYY/MM/DD')='2020/09/02';
/* 3. 주문 한 개의 멤버의 정보 */

/* 5. 주문 한 개의 주문자 정보&제품 여러 개 정보들(주문상세) */

/********************************/













