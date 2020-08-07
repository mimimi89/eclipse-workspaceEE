package dao.address03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Address0Dao {
	
		public Address0Dao() throws Exception{
			
		}
		
		public int create(Address insertAddress) throws Exception {
			Connection con=ConnectionFactory.getConnection();
			//매번 connection 객체 생성하고 닫기 귀찮으니까 ConnectionFactory 클래스 만들어서
			String insertSql="insert into address values(address_no_seq.nextval,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, insertAddress.getId());
			pstmt.setString(2, insertAddress.getName());
			pstmt.setString(3, insertAddress.getPhone());
			pstmt.setString(4, insertAddress.getAddress());
			int insertRowCount=pstmt.executeUpdate();
			
			pstmt.close();
			ConnectionFactory.releaseConnection(con);
			//매번 connection 객체 생성하고 닫기 귀찮으니까 ConnectionFactory 클래스 만들어서
			
			return insertRowCount;
		}
		
		
		public int delete(int no) throws Exception {
			String deleteSql = "delete address where no =" + no;
			Connection con = ConnectionFactory.getConnection();
			Statement stmt = con.createStatement();
			int rowCount = stmt.executeUpdate(deleteSql);
			stmt.close();
			ConnectionFactory.releaseConnection(con);
			return rowCount;
		}
		
		
		public int update(Address updateAddress)  throws Exception{
			String updateSql=
		"update address set id=?,name=?,phone=?,address=? where no=?";
			
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement pstmt=con.prepareStatement(updateSql);
			pstmt.setString(1, updateAddress.getId());
			pstmt.setString(2, updateAddress.getName());
			pstmt.setString(3, updateAddress.getPhone());
			pstmt.setString(4, updateAddress.getAddress());
			pstmt.setInt(5, updateAddress.getNo());
			int updateRowCount=pstmt.executeUpdate();
			pstmt.close();
			ConnectionFactory.releaseConnection(con);
			
			return updateRowCount;
		}
		
		
		public Address selectByNo(int fno) throws Exception {
			Address findAddress=null;
			String selectSql="select * from address where no=?";
		
			
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement pstmt=con.prepareStatement(selectSql);
			pstmt.setInt(1,fno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				findAddress=new Address(rs.getInt("no"),
										rs.getString("id"), 
										rs.getString("name"), 
										rs.getString("phone"), 
										rs.getString("address"));
			}
			rs.close();
			pstmt.close();
			ConnectionFactory.releaseConnection(con);
			return findAddress;
		}
		
		
		public ArrayList<Address> selectAll() throws Exception {
			ArrayList<Address> findAddressList=new ArrayList<Address>();
			String selectSql="select * from address";
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement pstmt=con.prepareStatement(selectSql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				findAddressList.add(new Address(rs.getInt("no"),
										rs.getString("id"), 
										rs.getString("name"), 
										rs.getString("phone"), 
										rs.getString("address")));
			}
			rs.close();
			pstmt.close();
			ConnectionFactory.releaseConnection(con);
			return findAddressList;
		}
		
}