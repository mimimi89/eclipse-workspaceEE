package statement05;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Properties;

/*
<<PreparedStatement>>
	1. sql문작성
	    - ?(파라메타) 를 사용해서 나중에 외부에서 데이타(리터럴)를 받을수있게한다.
	      ex> insert into emp(empno,ename,job,manager,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)	
	    - 테이블이름,컬럼이름등은 ? 를 사용해서 외부에서 입력받을수없다.
	      ex> select * from ? 
	          select ?,? from emp    
	2. PreparedStatement 객체생성시 인자로 sql문을 넣어서생성한다
	   ex> PreparedStatement pstmt = con.prepareStatement(sql);
	3. 생성된 PreparedStatement 객체에 파라메타를 setting 한다
	    - sql 좌측 ? 부터 1,2,3...
	   ex> 	pstmt.setInt(1,1234);              
	 	   	pstmt.setString(2,"KIM");              
	   		pstmt.setString(3,"MANAGER");              
	  		pstmt.setInt(4,7839);              
	   		pstmt.setDate(5,new Date());              
	   		pstmt.setDouble(6,1000.12);              
	   		pstmt.setInt(7,0);              
	   		pstmt.setInt(8,10);              
	 4.  실행
	    - 실행시 sql문을 인자로 넣지안는다.
	    ex> pstmt.executeUpdate();         
	        pstmt.executeQuery();         
*/
public class PreparedStatementMain {

	public static void main(String[] args) throws Exception {
		
		Properties dbProperties=new Properties();
		dbProperties.load(
				StatementMain.class.getResourceAsStream("../basic01/db.properties"));
		
		String driverClass=dbProperties.getProperty("driverClass");
		String url=dbProperties.getProperty("url");
		String user=dbProperties.getProperty("user");
		String password=dbProperties.getProperty("password");
		
		int startSal=1000;
		int endSal=3000;
		String job="SALESMAN";
		
		
		String selectSql1=
				"select * from emp where sal >= "+startSal+" and job='"+job+"'";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		
		System.out.println("--------------select(statement)------------------");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql1);
		while(rs.next()) {
			int empno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String jobs=rs.getString("job");
			double sal=rs.getDouble("sal");
			System.out.println(empno+"\t"+
							   ename+"\t"+
							   jobs+"\t"+
							   sal);
		}
		rs.close();
		stmt.close();
		
		System.out.println("--------------select(prepared statement)------------------");
		String selectSql2="select * from emp where sal>=? and sal<=? and job=?";
		PreparedStatement pstmt=con.prepareStatement(selectSql2);
		
		pstmt.setInt(1, startSal);
		pstmt.setInt(2, endSal);
		pstmt.setString(3, job);
		//resultset 선언 위치
		rs=pstmt.executeQuery();
		while(rs.next()) {
			int empno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String jobs=rs.getString("job");
			double sal=rs.getDouble("sal");
			System.out.println(empno+"\t"+
							   ename+"\t"+
							   jobs+"\t"+
							   sal);
		}
		rs.close();
		pstmt.close();
		
		
		System.out.println("--------------insert(prepared statement)------------------");
		System.out.println("-------------여러 가지 방법으로 날짜 입력-----------------");
		String insertSql="insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		/*
		pstmt=con.prepareStatement(insertSql);//준비하려면 괄호 안에 sql 주기
		
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "ALICE");
		pstmt.setString(3, "CLERK");
		pstmt.setInt(4, 7369);
		pstmt.setDate(5, new Date(System.currentTimeMillis()));
		pstmt.setDouble(6, 561.93);
		pstmt.setDouble(7, 30.67);
		pstmt.setInt(8, 30);
		
		int insertRowCount=pstmt.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		*/
		
		String insertSql2=
				"insert into emp values(?, ?, ?, ?, sysdate, ?, ?, ?)";
		/*
		pstmt=con.prepareStatement(insertSql2);
		
		pstmt.setInt(1, 2000);
		pstmt.setString(2, "TOM");
		pstmt.setString(3, "MANAGER");
		pstmt.setInt(4, 7369);
		pstmt.setDouble(5, 561.93);
		pstmt.setDouble(6, 30.67);
		pstmt.setInt(7, 30);
		
		int insertRowCount=pstmt.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		*/
		
		String insertSql3=
				"insert into emp values(?, ?, ?, ?, to_date(?,?), ?, ?, ?)";
		/*
		pstmt=con.prepareStatement(insertSql3);
		
		pstmt.setInt(1, 3000);
		pstmt.setString(2, "MARK");
		pstmt.setString(3, "SALESMAN");
		pstmt.setInt(4, 7369);
		
		pstmt.setString(5, "2019/01/12"); 
		pstmt.setString(6, "YYYY/MM/DD"); 
		
		pstmt.setDouble(7, 561.93);
		pstmt.setDouble(8, 30.67);
		pstmt.setInt(9, 30);
		
		int insertRowCount=pstmt.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		*/
		
		String insertSql4=
				"insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		pstmt=con.prepareStatement(insertSql4);
		
		pstmt.setInt(1, 5000);
		pstmt.setString(2, "MARK");
		pstmt.setString(3, "SALESMAN");
		pstmt.setInt(4, 7369);
		
		/****************DATE 객체 생성******************/
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//자바 format 오라클과 다름
		Date date=new Date(sdf.parse("2018-05-01").getTime());
		pstmt.setDate(5, date); 
		
		pstmt.setDouble(6, 561.93);
		pstmt.setDouble(7, 30.67);
		pstmt.setInt(8, 30);
		
		int insertRowCount=pstmt.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		
		pstmt.setInt(1, 5500);
		//setting 안 된 인덱스는 바로 이전의 것으로 들어감
		//이를 방지하기 위해서 186행
		insertRowCount=pstmt.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		
		pstmt.clearParameters();
		
	}

}
