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
select jd.*,p.* from jumun1 j 
join jumun_detail1 jd 
on j.jumun_no=jd.jumun_no
join product1 p
on jd.product_no=p.product_no
where j.user_id='guard1' and j.jumun_no=3001;

/*************관리자 입장*************/
/* 1. 모든 멤버의 특정 날짜의 주문전체목록 */
select j.* from 
user1 u join jumun1 j 
on u.user_id=j.user_id and to_char(j.jumun_date, 'YYYY/MM/DD')='2020/09/02';

/* 3-1. 주문 한 건의 멤버의 정보 */
select * from user1 u
join jumun1 j
on u.user_id=j.user_id
where j.jumun_no=3003;

/* 3-2. 특정 멤버의 주문정보 출력 */
select * from user1 u
inner join jumun1 j
on u.user_id=j.user_id
where u.user_id='guard1';

/* 3-2. 특정 멤버의 정보를 주문 정보를 포함해서 출력 */
select * from user1 u
left outer join jumun1 j
on u.user_id=j.user_id
where u.user_id='guard1';


/* 5. 주문 한 개의 주문자 정보&제품 여러 개 정보들(주문상세) */
select u.*, p.* from user1 u
join jumun1 j
on u.user_id=j.user_id
join jumun_detail1 jd
on j.jumun_no=jd.jumun_no
join product1 p on jd.product_no=p.product_no
where j.jumun_no=3001;

/*
 * 1. 멤버 한사람의 카트 정보(카트아이템리스트)
 * 2. 카트 아이템 한 개의 제품 1개 정보
 * 3. 멤버 한 사람의 카트 정보 출력(제품정보)
 */

/* 1. 멤버 한사람의 카트 정보(카트아이템리스트) */
select * from cart1 c where c.user_id='guard1';
select * from cart1 c where c.user_id='guard2';
select * from cart1 c where c.user_id='guard3';

/* 2. 카트 아이템 한 개의 제품 1개 정보 */
select * from cart1 c join product1 p on c.product_no=p.product_no where c.cart_item_no=2001; 

/* 3. 멤버 한 사람의 카트 정보 출력(제품정보) */
select p.product_name 제품이름, c.cart_item_qty 수량, p.product_price*c.cart_item_qty 총가격 
from cart1 c join product1 p 
on c.product_no=p.product_no 
where c.user_id='guard1';













