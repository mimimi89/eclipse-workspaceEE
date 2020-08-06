package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class AdressUpdateByNoMain {

	public static void main(String[] args) throws Exception {

		/**************설정파일로부터 DB접속정보얻기**************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javapython10";
		String password="javapython10";
		
		String updateSql=
				"update address set id='xxx',name='김경호',phone='888-8888',address='서울시 강남구' where no=2";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		/*
		<< java.sql.Satement >>
		public int executeUpdate(String sql) throws SQLException
			Executes the given SQL statement,
			which may be an INSERT, UPDATE, or DELETE statement 
			or an SQL statement that returns nothing, 
			such as an SQL DDL statement.
		 return:
		 	either (1) the row count for SQL Data Manipulation Language (DML) statements 
		 	or (2) 0 for SQL statements that return nothing	
			
		 */
		int rowCount = stmt.executeUpdate(updateSql);
		System.out.println(rowCount+ " 행 update..");

		stmt.close();
		con.close();

	}

}
