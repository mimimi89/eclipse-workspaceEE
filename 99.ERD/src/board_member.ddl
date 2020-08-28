DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		m_id                          		VARCHAR2(50)		 NULL ,
		m_name                        		VARCHAR2(127)		 NULL ,
		m_address                     		VARCHAR2(512)		 NULL ,
		m_point                       		NUMBER(10)		 DEFAULT 100		 NULL ,
		m_gender                      		CHAR(1)		 DEFAULT 'M'		 NULL ,
		m_date                        		DATE		 DEFAULT sysdate		 NULL 
);


CREATE TABLE board(
		b_no                          		NUMBER(10)		 NULL ,
		b_title                       		VARCHAR2(255)		 NULL ,
		b_content                     		VARCHAR2(255)		 NULL ,
		b_date                        		DATE		 DEFAULT sysdate		 NULL ,
		b_readcount                   		NUMBER(10)		 DEFAULT 0		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL 
);



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE board ADD CONSTRAINT IDX_board_PK PRIMARY KEY (b_no);
ALTER TABLE board ADD CONSTRAINT IDX_board_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);


INSERT INTO member (m_id, m_name, m_address, m_point, m_gender, m_date) VALUES (m_id, m_name, m_address, m_point, m_gender, m_date);INSERT INTO member () VALUES ();INSERT INTO member (m_id, m_name, m_address, m_point, m_gender, m_date) VALUES (m_id, m_name, m_address, m_point, m_gender, m_date);
