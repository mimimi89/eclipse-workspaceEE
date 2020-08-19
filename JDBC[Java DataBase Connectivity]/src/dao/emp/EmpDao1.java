package dao.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmpDao1 {
	
	public void create() throws Exception{
		/************** DB접속정보 **************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user = "javapython10";
		String password = "javapython10";
		/////////////////////////////////////////////
		String insertSql = 
				"insert into emp values('guard','김경호','123-4568','경기도 성남시')";
		/////////////////////////////////////////////
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(rowCount + " 행 insert..");
		stmt.close();
		con.close();
		
	}
		
	public void selectByNo() throws Exception {
		
	}
	
	public void selectAll() throws Exception {
		
	}
	
	public void update() throws Exception {
		
	}
	
	public void delete() throws Exception {
		
	}
	

}
