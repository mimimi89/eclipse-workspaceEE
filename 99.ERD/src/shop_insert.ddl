INSERT INTO user1 (user_id, user_password, user_name, user_email) 
VALUES ('guard1', '1111', 'FIRST', 'guard1@gmail.com');

INSERT INTO user1 (user_id, user_password, user_name, user_email) 
VALUES ('guard2', '2222', 'SECOND', 'guard2@gmail.com');

INSERT INTO user1 (user_id, user_password, user_name, user_email) 
VALUES ('guard3', '3333', 'THIRD', 'guard3@gmail.com');

INSERT INTO user1 (user_id, user_password, user_name, user_email) 
VALUES ('guard4', '4444', 'FOURTH', 'guard4@gmail.com');


INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1001, '아이폰', 54400, 'iphone.jpg', '아이폰 좋아요', 0);

INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1002, '아이패드', 89700, 'ipad.jpg', '아이패드 좋아요', 0);

INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1003, '갤러시20', 54400, 'galaxy20.jpg', '갤러시20 좋아요!!!', 0);

INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1004, '갤러시탭', 32700, 'tap.jpg', '갤러시탭 좋아요!!!', 0);

INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1005, '테슬라', 999990, 'tesla.jpg', '테슬라 좋나요?', 0);

INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1006, '블랙베리', 34000, 'berry.jpg', '블랙베리 좋아요', 0);





/*
 * 회원 아이디 guard1이 로그인한 후 제품들을 주문
 */
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3001, '아이폰 외 4종', sysdate, 345100, 'guard1');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5001, 3001, 1001, 2);

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5002, 3001, 1002, 2);

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5003, 3001, 1003, 1);


/*
 * 회원 아이디 guard2가 로그인한 후 제품들을 주문
 */
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3002, '테슬라 외 1종', sysdate, 1033990, 'guard2');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5004, 3002, 1005, 1);

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5005, 3002, 1006, 1);

/*
 * 회원 아이디 guard3가 로그인한 후 제품들을 주문
 */
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3003, '갤러시탭', sysdate, 32700, 'guard3');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5006, 3003, 1004, 1);

/*
 * 회원 아이디 guard1이 로그인한 후 두 번째 주문
 */
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3004, '테슬라 외 1종', sysdate, 1033990, 'guard1');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5007, 3004, 1005, 1);

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no, jumun_detail_count) 
VALUES (5008, 3004, 1006, 1);

commit;




