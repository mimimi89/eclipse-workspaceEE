package dao.dept;

import java.util.ArrayList;

import dao.address03.Address;

public class DeptDao2TestMain {

	public static void main(String[] args) throws Exception {
		
		DeptDao2 deptDao2=new DeptDao2();
		
		System.out.println("1. insert ");
		//int insertRowCount=deptDao2.insert(new Dept(87, "B", "BUSAN"));
		//System.out.println("insert: "+insertRowCount);


		System.out.println("2. selectByNo ");
		Dept findDept=deptDao2.selectByNo(10);
		System.out.println(findDept);
		
		System.out.println("3. selectAll ");
		ArrayList<Dept> findDeptList=deptDao2.selectAll();
		System.out.println(findDeptList);

	}

}
