package dao.dept;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * dept 테이블과 관련된 비즈니스 규약 메소드 선언
 *
 * @author  
 */
public interface DeptDao {
	
	// 부서 등록
	int insert(Dept insertDept) throws Exception;
	
	// 부서번호로 부서정보 반환
	Dept selectByNo(int fno) throws Exception;
	
	// 부서 전체목록 반환
	ArrayList<Dept> selectAll() throws Exception;
	
}






