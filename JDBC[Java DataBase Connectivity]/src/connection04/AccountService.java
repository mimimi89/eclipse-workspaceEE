package connection04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.address03.comm.ConnectionFactory;

public class AccountService {
	
	public void transfer() {
		Connection con=null;
		PreparedStatement pstmt=null;
		String updateSqlA=
				"update accounta set acc_balance  = acc_balance - ? where acc_no=?";
		String updateSqlB=
				"update accountb set acc_balance  = acc_balance + ? where acc_no=?";
		String selectSqlA=
				"select acc_balance from accounta where acc_no=?";
		
		
		
		try{
			con=ConnectionFactory.getConnection();
			/*
			 * 1.con.setAutoCommit(false)
			 */
			con.setAutoCommit(false);
			/*
			 * transaction start
			 */
			int acc_no=10000;
			int money=100000;
			
			pstmt=con.prepareStatement(updateSqlA);
			pstmt.setInt(1, money);
			pstmt.setInt(2, acc_no);
			int rowCount=pstmt.executeUpdate();
			System.out.println("1.accountA"+acc_no+"번 계좌잔고가"+money+"원 감소");
			
			pstmt.close();
			
			pstmt=con.prepareStatement(updateSqlB);
			pstmt.setInt(1, money);
			pstmt.setInt(2, acc_no);
			rowCount=pstmt.executeUpdate();
			System.out.println("2.accountB"+acc_no+"번 계좌잔고가"+money+"원 증가");
			
			pstmt.close();
			
			pstmt=con.prepareStatement(selectSqlA);
			pstmt.setInt(1, acc_no);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int balanceA=rs.getInt("acc_balance");
				if(balanceA>=0) {
					/*
					 * transaction end[commit]
					 */
					con.commit();
					System.out.println("3-1.  A 계좌의 잔고가 " +balanceA+"원 --> "+"commit");
				}else {
					con.rollback();
					System.out.println("3-2.  A 계좌의 잔고가 " +balanceA+"원 --> "+"rollback");
				}
			}
						
			
		}catch(Exception e) {
			try {
				con.rollback();
				System.out.println("99.rollback(Exception)");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}

}
