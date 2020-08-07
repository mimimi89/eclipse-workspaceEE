//
package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdressSelectByNoMain {

	public static void main(String[] args) throws Exception {
		
		/**************DB접속정보**************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javapython10";
		String password="javapython10";
		///
		String selectSql="select no, id, name, phone, address from address where no=3";
		///
		Class.forName(driverClass);
		
		Connection con=DriverManager.getConnection(url,user,password);
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(selectSql);
		
		/*
		int rowCount=stmt.executeUpdate(sql문):
			삽입, 업데이트, 삭제된 행의 숫자를 알고 싶을 때
			
		ResultSet rs=stmt.executeQuery(sql문):
		 	추출된 행(테이블)을 보고 싶을 때
		+하나면 if(rs.next()){
				데이터타입 컬럼이름=rs.get데이터타입("컬럼이름")
				System.out.println(출력하고 싶은 내용);}
		 */
		
		if(rs.next()) { //한 개는 if, 여러 개는 while
			/*
			 DB NUMBER        --> java int, double
			 DB VARCHAR2,CHAR --> String
			 DB DATE          --> Date
			 xxx var=rs.getxxx(컬럼이름)
			 */
			int no=rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			System.out.println(no+"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
			
		}
		
		rs.close();
		stmt.close();
		con.close();
		//차례대로 닫아주기

	}

}
