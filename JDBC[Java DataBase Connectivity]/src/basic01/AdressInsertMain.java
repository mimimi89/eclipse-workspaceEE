package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class AdressInsertMain {

	public static void main(String[] args) throws Exception {
		
		//설정 파일로부터 DB 접속 정보 얻기
		Properties dbProperties=new Properties();
		dbProperties.load(
				JDBCFlowMain.class.getResourceAsStream("db.properties"));
		
		String driverClass=dbProperties.getProperty("driverClass");
		String url=dbProperties.getProperty("url");
		String user=dbProperties.getProperty("user");
		String password=dbProperties.getProperty("password");
		
		String insertSql=
				"insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";
		/*
		 * 1. driver class loading
		 */
		Class.forName(driverClass);
		/*
		 * 2. connection 생성
		 */
		Connection con=DriverManager.getConnection(url, user, password);
		/*
		 * 3. statement 생성
		 */
		Statement stmt=con.createStatement();
		/*
		 * 4. statement를 사용해서 sql문 전송(DML전송)
		 */
		stmt.executeUpdate(insertSql);
		
		int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(rowCount+"행 insert..");
		
		stmt.close();
		con.close();
		
		
	}

}
