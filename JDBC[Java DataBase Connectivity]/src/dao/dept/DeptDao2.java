package dao.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptDao2 {
	/************** DB접속정보 **************/
	String driverClass = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@182.237.126.19:1521:XE";
	String user = "javapython10";
	String password = "javapython10";
	
	/*
	
	// 부서번호로 부서정보 반환
	public Dept selectByNo(int deptno) throws Exception;
	
	// 부서 전체목록 반환
	public List selectByAll() throws Exception;
	 */
	
	public int insert(Dept insertDept) throws Exception {
			
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		String insertSql="insert into dept values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		pstmt.setInt(1, insertDept.getDeptno());
		pstmt.setString(2, insertDept.getDname());
		pstmt.setString(3, insertDept.getLoc());
		int insertRowCount=pstmt.executeUpdate();
		return insertRowCount;
	}
	
	public Dept selectByNo(int fno) throws Exception {
		Dept findDept=null;
		String selectSql="select * from dept where deptno=?";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt=con.prepareStatement(selectSql);
		pstmt.setInt(1, fno);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			findDept=new Dept(rs.getInt("deptno"),
							  rs.getString("dname"),
							  rs.getString("loc"));
			
		}
		rs.close();
		pstmt.close();
		con.close();
		return findDept;
		
	}
	
	public ArrayList<Dept> selectAll() throws Exception {
		
		ArrayList<Dept> findDeptList=new ArrayList<Dept>();
		String selectAllSql="select * from dept";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt=con.prepareStatement(selectAllSql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			findDeptList.add(new Dept(rs.getInt("deptno"),
									  rs.getString("dname"),
									  rs.getString("loc")));
			
		}
		rs.close();
		pstmt.close();
		con.close();
		return findDeptList;
		
	}
	
	
	
	
	

}
