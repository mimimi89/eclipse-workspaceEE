//
package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		
		/**************설정파일로부터 DB접속정보얻기*************
		Properties dbProperties=new Properties();
		dbProperties.load(
				JDBCFlowMain.class.getResourceAsStream("db.properties"));
		
		String driverClass=dbProperties.getProperty("driverClass");
		String url=dbProperties.getProperty("url");
		String user=dbProperties.getProperty("user");
		String password=dbProperties.getProperty("password");
		*/
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javapython10";
		String password="javapython10";
		
		String selectSql="select * from emp";
		
		/*
		 * 1.Driver Class loading
		 */
		Class.forName(driverClass);
		System.out.println("1. driver class loading");
		
		/*
		 * 2. Connection 생성
		 */
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("2. Connection생성:"+con);
		
		/*
		 * 3.Statement 객체생성(SQL전송객체)
		 */
		Statement stmt=con.createStatement();
		System.out.println("3. Statement객체생성"+stmt);
		
		/*
		 * 4. SQL문 전송
		 * 5. ResultSet(결과집합) 얻기
		 */
		ResultSet rs=stmt.executeQuery(selectSql);
		System.out.println("4. SQL문 전송:"+selectSql);
		System.out.println("5. ResultSet(결과집합) 얻기:"+rs);
		
		while(rs.next()) {
			System.out.println(
					rs.getNString("EMPNO")+"\t"+
					rs.getNString("ENAME")+"\t"+
					rs.getNString("JOB"));
			
		}
		/*
		 * 6. Resource 해지
		 */
		System.out.println("6. Resource 해지 close()");
		rs.close();
		stmt.close();
		con.close();
		
	}

}
