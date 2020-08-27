DROP TABLE member CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: 회원 */
/**********************************/
CREATE TABLE member(
		m_id                          		VARCHAR2(50)		 NULL ,
		m_name                        		VARCHAR2(127)		 NULL ,
		m_address                     		VARCHAR2(512)		 NULL ,
		m_point                       		NUMBER(10)		 DEFAULT 100		 NULL ,
		m_gender                      		CHAR(1)			 DEFAULT 'M'		 NULL ,
		m_date                        		DATE			 DEFAULT sysdate	 NULL 
);

COMMENT ON TABLE member is '회원';
COMMENT ON COLUMN member.m_id is '회원아이디';
COMMENT ON COLUMN member.m_name is '회원이름';
COMMENT ON COLUMN member.m_address is '주소';
COMMENT ON COLUMN member.m_point is '포인트';
COMMENT ON COLUMN member.m_gender is '회원성별';
COMMENT ON COLUMN member.m_date is '가입일';



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);


--INSERT INTO member (m_id, m_name, m_address, m_point, m_gender, m_date) VALUES (m_id, m_name, m_address, m_point, m_gender, m_date);INSERT INTO member () VALUES ();INSERT INTO member (m_id, m_name, m_address, m_point, m_gender, m_date) VALUES (m_id, m_name, m_address, m_point, m_gender, m_date);
