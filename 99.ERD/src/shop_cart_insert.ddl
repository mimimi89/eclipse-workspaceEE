/*********guard1이 cart에 제품담기*********/
INSERT INTO cart1 (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no) 
VALUES (2001, 1, 54400, 'guard1', 1001);

INSERT INTO cart1 (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no) 
VALUES (2002, 2, 179400, 'guard1', 1002);

INSERT INTO cart1 (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no) 
VALUES (2003, 1, 54400, 'guard1', 1003);

/*********guard2이 cart에 제품담기*********/
INSERT INTO cart1 (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no) 
VALUES (2004, 1, 32700, 'guard2', 1004);

INSERT INTO cart1 (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no) 
VALUES (2005, 1, 999990, 'guard2', 1005);

/*********guard3이 cart에 제품담기*********/
INSERT INTO cart1 (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no) 
VALUES (2006, 1, 34000, 'guard3', 1006);

commit;


