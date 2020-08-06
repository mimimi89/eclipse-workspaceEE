package dao.address03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AddressDao3 {
	/************** DB접속정보 **************/
	String driverClass = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@182.237.126.19:1521:XE";
	String user = "javapython10";
	String password = "javapython10";
	
	public int create(Address insertAddress) {
		return 0;
	}
	
	
	public int delete(int no) throws Exception {

		String deleteSql = "delete address where no ="+no;
		System.out.println("deleteSql:"+deleteSql);

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSql);

		stmt.close();
		con.close();
		return rowCount;
	}

	public int update(Address updateAddress) throws Exception {
		
		return 0;

	}

	public Address selectByNo(int fno) throws Exception {
		return null;
	}
	
	public ArrayList<Address> selectAll() throws Exception {
		return null;
	
		
	}
	
}