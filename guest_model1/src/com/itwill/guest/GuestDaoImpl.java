package com.itwill.guest;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class GuestDaoImpl implements GuestDao{
	
	public GuestDaoImpl() throws Exception{
		
	}
	@Override
	public int insertGuest(Guest guest) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.GUEST_INSERT);
		pstmt.setInt(1, guest.getGuest_no());
		pstmt.setString(2, guest.getGuest_name());
		pstmt.setString(3, guest.getGuest_date());
		pstmt.setString(4, guest.getGuest_email());
		pstmt.setString(5, guest.getGuest_homepage());		
		pstmt.setString(6, guest.getGuest_title());
		pstmt.setString(7, guest.getGuest_content());
		int insertRowCount=pstmt.executeUpdate();
		return insertRowCount;
	}

	@Override
	public Guest selectByNo(int no) throws Exception {
		Guest guest=null;
		Connection con = 
				ConnectionFactory.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement(GuestSQL.GUEST_SELECT_NO);
		pstmt.setInt(1, no);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
					guest=new Guest(rs.getInt("guest_no"),
									rs.getString("guest_name"),
									rs.getString("guest_date"),
									rs.getString("guest_email"),
									rs.getString("guest_homepage"),
									rs.getString("guest_title"),
									rs.getString("guest_content"));
			
		}
		return guest ;
	}
	/*
이름             널?       유형             
-------------- -------- -------------- 
GUEST_NO       NOT NULL NUMBER(10)     
GUEST_NAME     NOT NULL VARCHAR2(100)  
GUEST_DATE     NOT NULL DATE           
GUEST_EMAIL             VARCHAR2(100)  
GUEST_HOMEPAGE          VARCHAR2(100)  
GUEST_TITLE    NOT NULL VARCHAR2(255)  
GUEST_CONTENT  NOT NULL VARCHAR2(4000) 
	 */
	@Override
	public ArrayList<Guest> selectAll() throws Exception {
		ArrayList<Guest> guestList=new ArrayList<Guest>();
		
		Connection con = 
				ConnectionFactory.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement(GuestSQL.GUEST_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		while (rs.next()) {
			guestList.add(
					new Guest(rs.getInt("guest_no"),
							  rs.getString("guest_name"),
							  rs.getString("guest_date"),
							  rs.getString("guest_email"),
							  rs.getString("guest_homepage"),
							  rs.getString("guest_title"),
							  rs.getString("guest_content")));
			
		}
		return guestList;
	}

	@Override
	public int updateGuest(Guest guest) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.GUEST_UPDATE);
		pstmt.setInt(1, guest.getGuest_no());
		pstmt.setString(2, guest.getGuest_name());
		pstmt.setString(3, guest.getGuest_date());
		pstmt.setString(4, guest.getGuest_email());
		pstmt.setString(5, guest.getGuest_homepage());		
		pstmt.setString(6, guest.getGuest_title());
		pstmt.setString(7, guest.getGuest_content());
		int updateRowCount=pstmt.executeUpdate();
		return updateRowCount;
		
	}

	@Override
	public int deleteGuest(int no) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.GUEST_DELETE);
		pstmt.setInt(1, no);
		int deleteRowCount=pstmt.executeUpdate();
		return deleteRowCount;
	}

}
