INSERT INTO member (m_id, m_name, m_address, m_point, m_gender, m_date) 
	   VALUES ('guard1', '���ȣ1', '��⵵1', 0, 'M', sysdate);
	   
INSERT INTO member (m_id, m_name, m_address) 
	   VALUES ('guard2', '���ȣ2', '��⵵2');
INSERT INTO member (m_id, m_name, m_address) 
	   VALUES ('guard3', '���ȣ3', '��⵵3');
INSERT INTO member (m_id, m_name, m_address) 
	   VALUES ('guard4', '���ȣ4', '��⵵4');
INSERT INTO member (m_id, m_name, m_address) 
	   VALUES ('guard5', '���ȣ5', '��⵵5');
	   
INSERT INTO board (b_no, b_title, b_content, b_date, b_readcount, m_id) 
	   VALUES (1000, 'Ÿ��Ʋ1', '����1', sysdate, 0, 'guard1');	   
	   
INSERT INTO board (b_no, b_title, b_content, m_id) 
	   VALUES (2000, 'Ÿ��Ʋ2', '����2', 'guard1');	   
INSERT INTO board (b_no, b_title, b_content, m_id) 
	   VALUES (3000, 'Ÿ��Ʋ3', '����3', 'guard1');	  
  
INSERT INTO board (b_no, b_title, b_content, m_id) 
	   VALUES (4000, 'Ÿ��Ʋ4', '����4', 'guard2');	   
INSERT INTO board (b_no, b_title, b_content, m_id) 
	   VALUES (5000, 'Ÿ��Ʋ5', '����5', 'guard2');	  

INSERT INTO board (b_no, b_title, b_content, m_id) 
	   VALUES (6000, 'Ÿ��Ʋ6', '����6', 'guard3');	  

commit;