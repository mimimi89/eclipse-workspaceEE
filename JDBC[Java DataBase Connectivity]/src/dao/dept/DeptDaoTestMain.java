package dao.dept;

import java.util.ArrayList;

public class DeptDaoTestMain {

	public static void main(String[] args) throws Exception {
		DeptDao deptDao=new DeptDaoImpl();
		
		System.out.println("1.insert");
		int insertRowCount=deptDao.insert(new Dept(79, "C", "JEJU"));
		System.out.println("insert: "+insertRowCount);
		
		System.out.println("2.selectByNo");
		Dept findDept=deptDao.selectByNo(10);
		System.out.println(10);
		
		System.out.println("3.selectAll");
		ArrayList<Dept> findDeptList=deptDao.selectAll();
		System.out.println(findDeptList);

	}
}
