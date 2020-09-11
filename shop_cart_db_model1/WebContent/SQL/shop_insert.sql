/**********************user2 insert************************/
insert into user2(userid,password,name,email) values('guard1','1111','김경호1','guard1@korea.com');
insert into user2(userid,password,name,email) values('guard2','2222','김경호2','guard2@korea.com');
insert into user2(userid,password,name,email) values('guard3','3333','김경호3','guard3@korea.com');

/**********************product2 insert************************/
insert into product2 values(product2_p_no_SEQ.nextval, '비글', 550000, 'bigle.gif','기타 상세 정보 등...', 0);
insert into product2 values(product2_p_no_SEQ.nextval, '달마시안', 500000, 'dalma.gif','기타 상세 정보 등...', 0);
insert into product2 values(product2_p_no_SEQ.nextval, '퍼그', 400000, 'pug.gif','기타 상세 정보 등...', 0);
insert into product2 values(product2_p_no_SEQ.nextval, '페키니즈', 450000, 'pekiniz.gif','기타 상세 정보 등...', 0);


/**********************cart2 insert************************/
/*****guard1****/
INSERT INTO cart2 
(cart_itemno, userId, p_no, cart_qty, cart_tot_price) 
VALUES 
(cart2_cart_itemno_SEQ.nextval, 'guard1', 1, 2, 550000*2);

INSERT INTO cart2 
(cart_itemno, userId, p_no, cart_qty, cart_tot_price) 
VALUES 
(cart2_cart_itemno_SEQ.nextval, 'guard1', 2, 1, 500000);

/*****guard2***/
INSERT INTO cart2 
(cart_itemno, userId, p_no, cart_qty, cart_tot_price) 
VALUES 
(cart2_cart_itemno_SEQ.nextval, 'guard2', 3, 1, 400000);
commit;
/**********************jumun2 insert************************/
/***guard1 jumun2 insert 주문1***/
INSERT INTO jumun2 (j_no, j_desc, j_date, j_price, userId) 
VALUES (jumun2_j_no_SEQ.nextval, '비글외2종', sysdate, 1600000, 'guard1');

    /***guard1 jumun_detail2 insert 주문1*****/
INSERT INTO jumun_detail2 (jd_no, jd_qty, jd_pname, jd_tot_price, j_no, p_no) 
VALUES (jumun_detail2_jd_no_SEQ.nextval, 2, '비글', 1100000, jumun2_j_no_SEQ.currval, 1);

INSERT INTO jumun_detail2 (jd_no, jd_qty, jd_pname, jd_tot_price, j_no, p_no) 
VALUES (jumun_detail2_jd_no_SEQ.nextval, 1, '달마시안', 500000, jumun2_j_no_SEQ.currval,2);

/***guard1 jumun2 insert 주문2***/
INSERT INTO jumun2 (j_no, j_desc, j_date, j_price, userId) 
VALUES (jumun2_j_no_SEQ.nextval, '달마시안외0종', sysdate, 500000, 'guard1');
    /***guard1 jumun_detail2 insert 주문2*****/
INSERT INTO jumun_detail2 (jd_no, jd_qty, jd_pname, jd_tot_price, j_no, p_no) 
VALUES (jumun_detail2_jd_no_SEQ.nextval, 1, '달마시안', 500000, jumun2_j_no_SEQ.currval, 2);



/***guard2 jumun2 insert***/
INSERT INTO jumun2 (j_no, j_desc, j_date, j_price, userId) 
VALUES (jumun2_j_no_SEQ.nextval, '퍼그외0종', sysdate, 400000, 'guard2');

INSERT INTO jumun_detail2 (jd_no, jd_qty, jd_pname, jd_tot_price, j_no, p_no) 
VALUES (jumun_detail2_jd_no_SEQ.nextval, 1, '퍼그', 400000, jumun2_j_no_SEQ.currval, 3);




commit;



