--멤버게시글목록
select m.m_id,m_name,b_no,b_title 
from member m
left join board b on m.m_id=b.m_id;

select m.m_id,m_name,b_no,b_title from member m join board b on m.m_id=b.m_id 
where m.m_id='guard2';

--게시글쓴사람 정보 
select m.* from board b join member m on b.m_id=m.m_id where b_no=1000;



