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