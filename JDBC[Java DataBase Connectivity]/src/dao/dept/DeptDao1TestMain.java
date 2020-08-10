package dao.dept;

public class DeptDao1TestMain {

	public static void main(String[] args) throws Exception {
		DeptDao1 deptDao1=new DeptDao1();
		
		System.out.println("1. insert ");
		//deptDao1.insert(99, "A", "SEOUL");

		System.out.println("2. selectByNo ");
		deptDao1.selectByNo(10);
		
		System.out.println("3. selectAll ");
		deptDao1.selectAll();
		
		

		
		
		
		
		

	}

}
