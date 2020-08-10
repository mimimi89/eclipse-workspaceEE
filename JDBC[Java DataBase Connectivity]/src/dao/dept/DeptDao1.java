package dao.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DeptDao1 {
	
	/*
	// 부서 등록
	public void insert(Dept deparment) throws Exception;
	
	// 부서번호로 부서정보 반환
	public Dept selectByNo(int deptno) throws Exception;
	
	// 부서 전체목록 반환
	public List selectByAll() throws Exception;
	 */
	
	String driverClass = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@182.237.126.19:1521:XE";
	String user = "javapython10";
	String password = "javapython10";
	
	public void insert(int deptno, String dname, String loc) throws Exception{

		String insertSql = "insert into dept values('"+deptno +"','"+dname+"','"+loc+"')";
		System.out.println("insertSql:"+insertSql);
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		
		System.out.println(rowCount + " 행 insert..");
		stmt.close();
		con.close();
		
	}
	
	public void delete(int dno) throws Exception {
		
		String deleteSql = "delete dept where deptno ="+dno;
		System.out.println("deleteSql:"+deleteSql);

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(rowCount + " 행 delete..");

		stmt.close();
		con.close();
		
		
	}
	
	
	public void selectByNo(int fno) throws Exception{
		
		String selectSql = "select deptno, dname, loc from dept where deptno="+fno;
		System.out.println("selectSql:"+selectSql);
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		if (rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno + "\t" + dname + "\t" + loc);
		}
		rs.close();
		stmt.close();
		con.close();
		
	}
	
	public void selectAll() throws Exception{
		
		String selectAllSql="select deptno, dname, loc from dept";
		System.out.println("selectAllSql:"+selectAllSql);
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectAllSql);
		while (rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno + "\t" + dname + "\t" + loc);
		}
		rs.close();
		stmt.close();
		con.close();
		
	}
	
	
	

	
	

}
