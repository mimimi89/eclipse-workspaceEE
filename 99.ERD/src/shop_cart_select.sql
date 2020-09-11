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
