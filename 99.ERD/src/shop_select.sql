/*
 * 1. 멤버한사람의 카트아이템리스트
 * 2. 카트아이템 1개의 제품정보
 * 3. 멤버한사람의 카트정보출력(제품정보)
 */
 --1. 멤버한사람의 카트아이템리스트
select * from cart1 c where c.user_id='guard1';
select * from cart1 c where c.user_id='guard2';
select * from cart1 c where c.user_id='guard3';
--2. 카트아이템 1개의 제품정보
select * from cart1 c join product1 p on c.product_no=p.product_no where c.cart_item_no=2001; 
--3. 멤버한사람의 카트정보출력(제품정보)


/*
 * 1. 멤버 한사람의 특정날짜의 주문전체목록
 * 2. 멤버 한사람의 특정날짜의 주문한개
 * 3. 주문한개의  멤버의 정보
 * 4. 주문한개의  제품여러개 정보들(주문상세,제품)
 * 5. 주문한개의 주문자정보 & 제품여러개 정보들(주문상세)
 */

 --1. 멤버 한사람의 특정날짜의 주문전체목록
 select j.* from 
 user1 u join jumun1 j
 on u.user_id = j.user_id and u.user_id='guard1' and to_char(j.jumun_date,'YYYY/MM/DD')='2020/09/02' ;
--2. 멤버 한사람의 특정날짜의 주문한개 
 select j.* from 
 user1 u join jumun1 j
 on u.user_id = j.user_id and u.user_id='guard1' and to_char(j.jumun_date,'YYYY/MM/DD')='2020/09/02' 
 where j.jumun_no=3001; 
-- 4. 주문한개의  제품여러개 정보들(주문상세,제품)
select jd.*,p.* from jumun1 j 
join jumun_detail1 jd 
on j.jumun_no=jd.jumun_no
join product1 p
on jd.product_no=p.product_no
where j.user_id='guard1' and j.jumun_no=3001;
 
/************************ 관리자***************************/
--1. 모든멤버의 특정날짜의 주문전체목록 
 select j.* from 
 user1 u join jumun1 j
 on u.user_id = j.user_id and to_char(j.jumun_date,'YYYY/MM/DD')='2020/09/02' ;
-- 3-1. 주문한건의  멤버의 정보
 select * from user1 u
 join jumun1 j
 on u.user_id=j.user_id where j.jumun_no=3003;
-- 3-2. 특정멤버의 주문정보출력
 select * from user1 u
 inner join jumun1 j
 on u.user_id=j.user_id where u.user_id='guard4'; 
-- 3-2. 특정멤버의 정보를 주문정보를 포함해서출력
 select * from user1 u
 left outer join jumun1 j
 on u.user_id=j.user_id where u.user_id='guard4';
 
-- 5. 주문한개의 주문자정보 & 제품여러개 정보들(주문상세) 
select u.*,p.* from user1 u 
join jumun1 j on u.user_id=j.user_id
join jumun_detail1 jd on j.jumun_no=jd.jumun_no
join product1 p on jd.product_no=p.product_no
where j.jumun_no=3001; 


/**********************************************************/