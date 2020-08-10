package dao.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import dao.address03.comm.ConnectionFactory;


public class DeptDaoImpl implements DeptDao{

	@Override
	public int insert(Dept insertDept) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DeptSQL.INSERT);
		pstmt.setInt(1, insertDept.getDeptno());
		pstmt.setString(2, insertDept.getDname());
		pstmt.setString(3, insertDept.getLoc());
		int insertRowCount=pstmt.executeUpdate();
		
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		
		return insertRowCount;
		
	}

	@Override
	public Dept selectByNo(int fno) throws Exception {
		Dept findDept=null;
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(DeptSQL.SELECTBYNO);
		pstmt.setInt(1,fno);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			findDept=new Dept(rs.getInt("deptno"),
							  rs.getString("dname"), 
							  rs.getString("loc"));
		}
		rs.close();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return findDept;
		
	}

	@Override
	public ArrayList selectAll() throws Exception {
		ArrayList<Dept> findDeptList=new ArrayList<Dept>();
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(DeptSQL.SELECTALL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			findDeptList.add(new Dept(rs.getInt("deptno"),
									  rs.getString("dname"), 
									  rs.getString("loc")));
		}
		rs.close();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return findDeptList;
		
	}

}
