insert into user2(userid,password,name,email) values('guard1','1111','���ȣ1','guard1@korea.com');
insert into user2(userid,password,name,email) values('guard2','2222','���ȣ2','guard2@korea.com');
insert into user2(userid,password,name,email) values('guard3','3333','���ȣ3','guard3@korea.com');


insert into product2 values(product2_p_no_SEQ.nextval, '���', 550000, 'bigle.gif','��Ÿ �� ���� ��...', 0);
insert into product2 values(product2_p_no_SEQ.nextval, '�޸��þ�', 500000, 'dalma.gif','��Ÿ �� ���� ��...', 0);
insert into product2 values(product2_p_no_SEQ.nextval, '�۱�', 400000, 'pug.gif','��Ÿ �� ���� ��...', 0);
insert into product2 values(product2_p_no_SEQ.nextval, '��Ű����', 450000, 'pekiniz.gif','��Ÿ �� ���� ��...', 0);
select * from product2;


/*************guard1************************/
INSERT INTO cart2 
(cart_itemno, userId, p_no, cart_qty, cart_tot_price) 
VALUES 
(cart2_cart_itemno_SEQ.nextval, 'guard1', 1, 2, 550000*2);

INSERT INTO cart2 
(cart_itemno, userId, p_no, cart_qty, cart_tot_price) 
VALUES 
(cart2_cart_itemno_SEQ.nextval, 'guard1', 2, 1, 500000);

/*************guard2************************/
INSERT INTO cart2 
(cart_itemno, userId, p_no, cart_qty, cart_tot_price) 
VALUES 
(cart2_cart_itemno_SEQ.nextval, 'guard2', 3, 1, 400000);

commit;
