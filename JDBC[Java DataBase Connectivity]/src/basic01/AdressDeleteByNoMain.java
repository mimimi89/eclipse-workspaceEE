//
package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AdressDeleteByNoMain {

	public static void main(String[] args) throws Exception {
		/**************설정파일로부터 DB접속정보얻기**************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javapython10";
		String password="javapython10";
		
		String deleteSql=
				"delete address where no>=10";
		
		Class.forName(driverClass);
		
		Connection con=DriverManager.getConnection(url,user,password);
		
		Statement stmt=con.createStatement();
	
		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(rowCount+ " 행 delete..");

		stmt.close();
		con.close();

	}

}
