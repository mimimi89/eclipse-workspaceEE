package resultset06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.address03.ConnectionFactory;

public class ScrollableResultSetMain {

	public static void main(String[] args) throws Exception {

		String selectSql="select * from emp order by empno asc";
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement(selectSql,
									 ResultSet.TYPE_SCROLL_SENSITIVE,
									 ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=pstmt.executeQuery();
		/*
		 * Cursor를 자유롭게 움직일 수 있는 ResultSet 생성
		 */
		System.out.println("------------rs.next()-----------");
		while(rs.next()) {
			System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		}	
		
		System.out.println("------------rs.previous()-----------");
		while(rs.previous()) {
			System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		}
		
		System.out.println("------------rs.first()-----------");
		rs.first();
		System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		
		System.out.println("------------rs.last()-----------");
		rs.last();
		System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		
		System.out.println("------------rs.getRow()-----------");
		int rowCount=rs.getRow();
		System.out.println("rowCount: "+rowCount+"개");
		
		System.out.println("------------rs.beforeFirst()-----------");
		rs.beforeFirst();
		//결과 집합을 모두 소모했음
		rs.next();
		System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		
		System.out.println("------------rs.afterLast()-----------");
		rs.afterLast();
		rs.previous();
		System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		
		rs.beforeFirst();
		if(rs.isBeforeFirst()||rs.isAfterLast()) {
			System.out.println("rs cursor 가 BeforeFirst 혹은 AfterLast에 위치해 있음");
		}
		
		System.out.println("------------rs.absolute(row번호)-----------");
		rs.absolute(10);
		System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		
		System.out.println("------------rs.relative()-----------");
		rs.relative(2);//현재 위치(10)에서 앞으로 2개 갔다가 다시 원래 위치로 돌아가는 것
		System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		rs.relative(-2);//현재 위치(10)에서 이전으로 2개 갔다가 다시 원래 위치로 돌아가는 것
		System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
		
		rs.close();
		
		
		
	}

}
